// normal code with dfs and no optimization
import java.util.*;

public class Juspay {

    static class Node {
        String name;
        Node parent;
        List<Node> children;

        boolean isLocked;
        int lockedBy;

        Node(String name) {
            this.name = name;
            this.children = new ArrayList<>();
            this.isLocked = false;
            this.lockedBy = -1;
        }
    }

    static Map<String, Node> nodeMap = new HashMap<>();

    static boolean lock(Node node, int uid) {

        if (node.isLocked) {
            return false;
        }

        Node curr = node.parent;

        while (curr != null) {
            if (curr.isLocked) {
                return false;
            }
            curr = curr.parent;
        }

        if (hasLockedDescendant(node)) {
            return false;
        }

        node.isLocked = true;
        node.lockedBy = uid;

        return true;
    }

    static boolean unlock(Node node, int uid) {

        if (!node.isLocked) {
            return false;
        }

        if (node.lockedBy != uid) {
            return false;
        }

        node.isLocked = false;
        node.lockedBy = -1;

        return true;
    }

    static boolean upgrade(Node node, int uid) {

        if (node.isLocked) {
            return false;
        }

        List<Node> lockedNodes = new ArrayList<>();

        collectLockedDescendants(node, lockedNodes);

        if (lockedNodes.isEmpty()) {
            return false;
        }

        for (Node lockedNode : lockedNodes) {
            if (lockedNode.lockedBy != uid) {
                return false;
            }
        }

        Node curr = node.parent;

        while (curr != null) {
            if (curr.isLocked) {
                return false;
            }
            curr = curr.parent;
        }

        for (Node lockedNode : lockedNodes) {
            lockedNode.isLocked = false;
            lockedNode.lockedBy = -1;
        }

        node.isLocked = true;
        node.lockedBy = uid;

        return true;
    }

    static boolean hasLockedDescendant(Node node) {

        for (Node child : node.children) {

            if (child.isLocked) {
                return true;
            }

            if (hasLockedDescendant(child)) {
                return true;
            }
        }

        return false;
    }

    static void collectLockedDescendants(Node node, List<Node> lockedNodes) {

        for (Node child : node.children) {

            if (child.isLocked) {
                lockedNodes.add(child);
            }

            collectLockedDescendants(child, lockedNodes);
        }
    }

    public static void main(String args[]) throws Exception {

        int n = 7;
        int m = 2;
        int q = 5;

String[] names = {
    "World",
    "Asia",
    "Africa",
    "China",
    "India",
    "SouthAfrica",
    "Egypt"
};

String[] queries = {
    "1 China 9",
    "1 India 9",
    "3 Asia 9",
    "2 India 9",
    "2 Asia 9"
};

        for (int i = 0; i < n; i++) {
            nodeMap.put(names[i], new Node(names[i]));
        }

        for (int i = 0; i < n; i++) {
            Node parent = nodeMap.get(names[i]);

            for (int j = 1; j <= m; j++) {
                int childIndex = m * i + j;

                if (childIndex >= n) {
                    break;
                }

                Node child = nodeMap.get(names[childIndex]);
                parent.children.add(child);
                child.parent = parent;
            }
        }

        for (int i = 0; i < q; i++) {
            String[] query = queries[i].split(" ");
            int operation = Integer.parseInt(query[0]);
            String nodeName = query[1];
            int uid = Integer.parseInt(query[2]);

            Node node = nodeMap.get(nodeName);

            boolean result = false;

            if (operation == 1) {
                result = lock(node, uid);
            } else if (operation == 2) {
                result = unlock(node, uid);
            } else if (operation == 3) {
                result = upgrade(node, uid);
            }

            System.out.println(result);
        }
    }
}