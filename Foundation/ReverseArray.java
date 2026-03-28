public class ReverseArray{
    public static void main(String args[]){
        String fruits[] = {"Guava","Banana","Watermelon","Grapes","Mango","car"};
        int numbers[] = {23,42,445,432,56,2,45,11};
        ReverseArray r1 = new ReverseArray();
        r1.reverse(numbers);
        r1.reverseString(fruits);
    }
    //reverse array method
    public void reverse(int numbers[]){
        // int first = 0;
        // int last = numbers.length-1;
        int temp = 0;
        for(int first=0,last = numbers.length-1;first<last;first++,last--){
            temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
        }

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    }
    //Reverse String array
    public void reverseString(String fruits[]){
        int first = 0;
        int last = fruits.length-1;
        while(first < last){
            String temp = fruits[first];
            fruits[first] = fruits[last];
            fruits[last] = temp;
            first++;
            last--;
        }
        for(int i=0;i<fruits.length;i++){
            System.out.print(fruits[i]+" ");
        }
    }
}