public class OddTimes{
    public static void main(String args[]){
        int arr[] = {2,4,3,2,2,3};
        OddTimes od = new OddTimes();
        od.oddNoCheck(arr);
    }
    //method for counting appearance of numbers in array
    public int oddNoCheck(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            // finding duplicates and assigning negative values for odd ocurance numbers
            if(count%2!=0){
                int k;
                for(k = i+1;k<arr.length;k++){
                    if(arr[i]==arr[k]){
                        arr[k]=-1;
                    }
                }
                // printing the odd ocurance numbers
                if(arr[i]!=0){
                    System.out.print(arr[i]+" ");
                // return arr[i];
                }
            }
        }
        return 1;
    }
}
