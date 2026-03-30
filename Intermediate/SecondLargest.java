public class SecondLargest{
    public static void main(String args[]){
        int[] arr = {12, 45, 7, 89, 34,55,99};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                int temp = largest;
                int temp2 = secondLargest;
                largest=arr[i];
                secondLargest = temp;
                thirdLargest = temp2;
            }else if(arr[i]>secondLargest && arr[i]<largest){
                int temp = secondLargest;
                secondLargest = arr[i];
                thirdLargest = temp;
            }else if(arr[i]>thirdLargest && arr[i]<secondLargest){
                thirdLargest = arr[i];
            }
        }
        System.out.println("Third Largest No. :"+thirdLargest);
        System.out.println("Second Largest No. :"+secondLargest);
        System.out.println("Largest No. :"+largest);
    }
}
// ERROR