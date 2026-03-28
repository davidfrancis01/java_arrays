public class Grades{
    public static void main(String args[]){
        String grades[] = new String[10];
        grades[0] = "B+";
        grades[1] = "F";
        grades[2] = "C";
        grades[3] = "B";
        grades[4] = "B+"; 
        grades[5] = "A+";
        grades[6] = "A";
        grades[7] = "A+";
        grades[8] = "O";
        gradesOfDavid(grades);
    }

    public static void  gradesOfDavid(String grades[]){
        for(int i=0;i<grades.length;i++){
            System.out.println(grades[i]);
        }
    }
}