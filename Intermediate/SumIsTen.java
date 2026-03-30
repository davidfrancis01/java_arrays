public class SumIsTen{
    public static void main(String args[]){
        int[] arr = {2, 7, 4, 6, 3, 8};
        // int sum = 0;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == 10){
                    System.out.println(arr[i]+"+"+arr[j]);
                }
            }
        }
    }
}