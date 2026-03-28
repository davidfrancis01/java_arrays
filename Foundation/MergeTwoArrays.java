import java.util.Arrays;
public class MergeTwoArrays{
    public static void main(String args[]){
        String tiffins[] = {"idly","vada","poori","dosa","upma"};
        String snacks[] = {"chai","coffee","samosa","punugulu","coke"};
        String result[] = new String[tiffins.length+snacks.length];
        // for(int i = 0;i<tiffins.length;i++){
        //     // 
        // }
        System.arraycopy(tiffins,0,result,0,tiffins.length);
        System.arraycopy(snacks,0,result,tiffins.length,snacks.length);
        System.out.println(Arrays.toString(result));
    }
}