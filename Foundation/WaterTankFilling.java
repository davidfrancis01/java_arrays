public class WaterTankFilling{
    public static void main(String args[]){
        int[] buckets = {10, 12, 8, 15, 9, 7};
        int maxLitres = 20;
        WaterTankFilling wt = new WaterTankFilling();
        wt.bucketsAdded(buckets, maxLitres);
    }

    public void bucketsAdded(int buckets[],int maxLitres){
        int totalLitres = 0;
        for(int i=0;i<buckets.length;i++){
            int index = i;
            if(totalLitres+buckets[i]<=maxLitres){
                totalLitres += buckets[i];
                System.out.print(buckets[i]+" ");
            }else{
                break;
            }
        }
    }
}