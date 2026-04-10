public class LongestSequence{
    public static void main(String args[]){
        int arr[]={1,2,3,2,3,4,5,1};
        LongestSequence ls = new LongestSequence();
        ls.increasingSequence(arr);
    }
    //method for printing longest sequence in array
    public void increasingSequence(int arr[]){
        int max = 1;
        int current =1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                current++;
            }else{
                current=1;
            }
            if(current>max){
                max = current;
            }
        }
        
        System.out.println("The highest continous sequence length is: "+max);
    }
}