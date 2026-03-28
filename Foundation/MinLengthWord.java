public class MinLengthWord{
    public static void main (String args[]){
        String fruits[] = {"Guava","Banana","Watermelon","Grapes","Mango","car"};
        String minWord = fruits[0];
        int index = 0;
        for(int i = 0;i<fruits.length;i++){
            if(fruits[i].length()<minWord.length()){
                minWord = fruits[i];
                index = i;
            }
        }
        System.out.println("Min Length Word :"+minWord+" at index :"+index);
    }
}