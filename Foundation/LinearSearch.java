public class LinearSearch{
    public static void main(String args[]){
        int numbers[] = {12,4,24,5,2,565,63,346,664,32,1};
        int key = 664;
        LinearSearch find = new LinearSearch();
        int index = find.searchKey(numbers, key);
        if(index == -1){
            System.out.println("Key is not found in the array");
        }else{
            System.out.println("Key found at index :"+index);
        }

    }

    public int searchKey(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
}