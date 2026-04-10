public class ReverseEvenNo{
    public static void main(String args[]){
        int[] arr = {2,3,1,4,6,1,3,5};
        int first =0;
        int last = arr.length-1;

        //while loop for counting appearnce of numbers
        while(first<last){
            if(arr[first]%2==0 && arr[last]%2==0){
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
            //if the element is odd it skips it at starting
            else if(arr[first]%2!=0){
                first++;
            }
            //if the element is odd it skips it at ending
            else if(arr[last]%2!=0){
                last--;
            }

        }for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
