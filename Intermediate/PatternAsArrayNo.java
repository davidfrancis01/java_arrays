public class PatternAsArrayNo{
    public static void main(String args[]){
        int[] arr = {2, 12, 10, 3};
        // int num = 0;
        for(int i =0;i<arr.length;i++){
            // num = arr[i];
            for(int j = 1;j<=arr[i];j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}