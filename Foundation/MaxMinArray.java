public class MaxMinArray{
    public static void main(String args[]){
        int array[] = {22,43,25,66,96,47,4,88,35};
        int maxIndex = 0;
        int minIndex = 0;
        int maxNo = Integer.MIN_VALUE;
        int minNO = Integer.MAX_VALUE;
        // object creation for non-static methods and varibles
        MaxMinArray t = new MaxMinArray();
        t.maxNumber(array,maxNo,maxIndex);
        t.minNumber(array,minNO,minIndex);
        // System.out.println("largest number in array :"+t.maxNumber(array,maxNo,maxIndex)+" at index no :"+maxIndex);
        // System.out.println("smallest number in array :"+t.minNumber(array, minNO,minIndex)+" at index no :"+minIndex);
    } 

    //this method for finding largest number
    public void maxNumber(int array[],int maxNo,int maxIndex){
        for(int i=0;i<array.length;i++){
            if(maxNo<array[i]){
                maxNo = array[i];
                maxIndex = i;
            }
        }
        System.out.println("largest number in array :"+maxNo+" '&' at index :"+maxIndex);
    }

    //this method for finding smallest number
    public void minNumber(int array[],int minNO,int minIndex){
        for(int i=0;i<array.length;i++){
            if(array[i]<minNO){
                minNO = array[i];
                minIndex = i;
            }
        }
        System.out.println("smallest number in array :"+minNO+" '&' at index :"+minIndex);
    }
}