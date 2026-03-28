public class HotballonBusiness{
    public static void main(String args[]){
        int peopleWeights[] ={32,56,77,34,76,55,86};
        int maxWeight = 300;
        int index = 0;
        int totalWeight = 0;
        for(int i = 0;i<peopleWeights.length;i++){
            index = i;
            if(totalWeight+peopleWeights[i]<=maxWeight){
                totalWeight += peopleWeights[i];
                System.out.print(peopleWeights[i]+" ");
            }else{
                break;
            }
        }
        System.out.println("\nTotal members in hotballon :"+(index)+"\nTotal weight of them :"+totalWeight);
        System.out.println("Max Weight Hotballon can carry :"+maxWeight);
    }
}