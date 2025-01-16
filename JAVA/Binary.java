class Binary{
    public static void  main(String[] args){
        int arr[] = {1,2,5,9,10,77,99,101};
        int low = 0 ,high = arr.length-1;
        int mid = low+high/2;
int item = 2;
        while(arr[mid]!=item){
            if(arr[mid]>item){
                high = mid;
            }else{
                low = mid;
            }
            if((low+high/2)==mid){
                System.out.println("Element not found");
                return;
            }
            mid = low + high/2;
        }
        System.out.println("Element found at index " + mid);
    }
}
