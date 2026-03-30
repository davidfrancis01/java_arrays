public class GreaterThanPrevious{
    public static void main(String args[]){
        int[] arr = {7, 2, 5, 5, 9, 4, 10};
        int biggestNo = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>biggestNo){
                biggestNo = arr[i];
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}