public class ReverseEvenNo{
    public static void main(String args[]){
        int[] arr = {2,4,6,1,3,5};
        int first =0;
        int last = arr.length-1;
        while(first<last){
            if(arr[first]%2==0 && arr[last]%2==0){
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
            else if(arr[first]%2!=0){
                first++;
            }
            else if(arr[last]%2!=0){
                last--;
            }
        }for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}