import java.util.*;
public class DArray {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Integer n = Integer.parseInt(br.readLine());

        // int[][] matrix = new int[n][n];
        // for(int i =0 ;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[i][j] = Integer.parseInt(br.readLine());
        //     }
        // }

        int[][] arr = {
            {1,1,0},
            {1,1,1},
            {1,1,0}
        };
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i =0 ;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 0){
                    map.put(i,j);
                }
            }
        };

        for(HashMap.Entry<Integer,Integer> e: map.entrySet()){
            for(int i=0;i<arr.length;i++){
                arr[i][e.getValue()] = 0;
            }
            for(int j=0;j<arr[0].length;j++){
                arr[e.getKey()][j] = 0;
            }
        };

        for(int[] row:arr){
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}