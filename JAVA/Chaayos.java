public class Chaayos{
    public static void main(String[] args){
        //suppoeesd i am gievn with 2 string i am suppposed to find whether first string is permutation of 2nd string or not
        String a = "cdh";
        String b = "cba";

        if(a.length() != b.length()){
            System.out.println("Not a permutation");
            return;
        }

        int[] freq = new int[26];

        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)]++;
        }

        for(int i=0;i<b.length();i++){
            freq[b.charAt(i)-97]--;
                    
        if(freq[b.charAt(i)]<0){
            System.out.println("Not a permutation");
            return;
            }
        }

            System.out.println("Is a permutation");
        // if(a.length()!b.length()){
            
        // }
        
    }
}