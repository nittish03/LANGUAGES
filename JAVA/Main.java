public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[-2] = 10;

        for(int b : a){
            System.out.println(b);
        }
    }
}
