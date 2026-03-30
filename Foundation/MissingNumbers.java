public class MissingNumbers{
    public static void main(String args[]){
        int arr[]  = {3 ,6 ,1 ,8 ,6 ,2 ,3};
        int n = 10;
        for(int i=1;i<=n;i++){
            boolean found = false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    found =true;
                }
            }if(found!=true){
                System.out.print(i+" ");
            }
        }
    }
}