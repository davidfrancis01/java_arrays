public class LeaderElementsFromRight{
    public static void main(String args[]){
        int arr[] ={16,17,4,3,5,2};
        LeaderElementsFromRight.largerElements(arr);
    }
    //method for printing higher elements from right
    public static void largerElements(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>largest){
                largest = arr[i];
                System.out.print(largest+" ");
                
            }
        }
    }
}