public class RotateTwoPositions{
    public static void main(String args[]){
        int arr[] = {1,2,43,23,42,86,97,4,63};
        RotateTwoPositions rtp = new RotateTwoPositions();
        rtp.rotate(arr);
    }

    public void rotate(int arr[]){
        int first = arr[arr.length-2];
        int second =arr[arr.length-1];
        for(int i=arr.length-1;i>=2;i--){
            arr[i] = arr[i-2];
        }
        arr[0] = first;
        arr[1] = second;

        //for printing the updated array
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}