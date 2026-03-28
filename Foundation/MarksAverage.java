public class MarksAverage{
    public static void main(String args[]){
        int marks[] = {45,34,64,88,90,66};
        MarksAverage sem1 = new MarksAverage();
        System.out.println(sem1.average(marks));
    }

    public double average(int marks[]){
        float sum = 0;
        double average = 0;
        for(int i =0;i<marks.length;i++){
            sum += marks[i];
        }
        average = sum/marks.length;
        System.out.println(sum);
        return average;
        
    }
}