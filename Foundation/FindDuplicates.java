public class FindDuplicates{
    public static void main(String args[]){
        int[] arr = {4,2,7,4, 9,  5,9, 5};
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                    // return;
                }
            }
        }
    }
}