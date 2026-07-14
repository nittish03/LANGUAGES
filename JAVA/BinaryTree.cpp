#include <iostream>
#include <queue>
using namespace std;

struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int val) {
        this->val = val;
        left = nullptr;
        right = nullptr;
    }
};

TreeNode* createTree() {
    TreeNode* root = new TreeNode(1);

    root->left = new TreeNode(2);
    root->right = new TreeNode(3);

    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);

    root->right->right = new TreeNode(6);

    return root;
}

void preorder(TreeNode* root) {
    if (root == nullptr) {
        return;
    }

    cout << root->val << " ";

    preorder(root->left);
    preorder(root->right);
}

void inorder(TreeNode* root) {
    if (root == nullptr) {
        return;
    }

    inorder(root->left);

    cout << root->val << " ";

    inorder(root->right);
}

void postorder(TreeNode* root) {
    if (root == nullptr) {
        return;
    }

    postorder(root->left);
    postorder(root->right);

    cout << root->val << " ";
}

void levelOrder(TreeNode* root) {
    if (root == nullptr) {
        return;
    }

    queue<TreeNode*> q;
    q.push(root);

    while (!q.empty()) {
        TreeNode* curr = q.front();
        q.pop();

        cout << curr->val << " ";

        if (curr->left != nullptr) {
            q.push(curr->left);
        }

        if (curr->right != nullptr) {
            q.push(curr->right);
        }
    }
}

int lastLevelSum(TreeNode* root) {
    if (root == nullptr) {
        return 0;
    }

    queue<TreeNode*> q;
    q.push(root);

    int sum = 0;

    while (!q.empty()) {
        int size = q.size();
        sum = 0;

        for (int i = 0; i < size; i++) {
            TreeNode* curr = q.front();
            q.pop();

            sum += curr->val;

            if (curr->left != nullptr) {
                q.push(curr->left);
            }

            if (curr->right != nullptr) {
                q.push(curr->right);
            }
        }
    }

    return sum;
}

int main() {
    TreeNode* root = createTree();

    cout << "Preorder: ";
    preorder(root);

    cout << endl;

    cout << "Inorder: ";
    inorder(root);

    cout << endl;

    cout << "Postorder: ";
    postorder(root);

    cout << endl;

    cout << "Level Order: ";
    levelOrder(root);

    cout << endl;

    cout << "Last Level Sum: " << lastLevelSum(root) << endl;

    return 0;
}
