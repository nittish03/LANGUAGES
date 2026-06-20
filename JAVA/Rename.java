public class Rename {
    public static void main(String[] args) {

        
        String name = "  Nittish   Baboria 03  ";




                String result = name.trim()
                    .toLowerCase()
                    .replaceAll("\\s+", " ");

System.out.println(result);

        // String[] arr = name.split(" ");
        

        // StringBuilder result = new StringBuilder();

        // for (int i = 0; i < arr.length; i++) {

        //     if (!arr[i].isEmpty()) {

        //         if (result.length() > 0) {
        //             result.append(" ");
        //         }

        //         result.append(arr[i].trim().toLowerCase());
        //     }
        // }

        // System.out.println(result);
    }
}