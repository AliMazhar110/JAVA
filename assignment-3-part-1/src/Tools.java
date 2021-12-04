import java.util.ArrayList;
import java.util.Comparator;

public class Tools {
    private int[] numbers = new int[4];
    public Tools(){
        for(int i=0;i<4;i++){
            numbers[i]=0;
        }
    }
    public boolean delete(ArrayList<Students> list, String str, String option){
        if(option.equals("name")){
            for(int i=0;i<list.size();i++){
                if(str.equals(list.get(i).showname())){
                    double d = list.get(i).sum()/5.0;
                    delGrades(d);
                    list.remove(i);
                    return true;
                }
            }
        }
        else if(option.equals("prn")){
            for(int i=0;i<list.size();i++){
                if(str.equals(list.get(i).showprn())){
                    double d = list.get(i).sum()/5.0;
                    delGrades(d);
                    list.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    public int find(ArrayList<Students> list, String str,String option){
        if(option.equals("name")){
            for(int i=0;i<list.size();i++){
                if(str.equals(list.get(i).showname())){
                    return i;
                }
            }
        }
        else if(option.equals("prn")){
            for(int i=0;i<list.size();i++){
                if(str.equals(list.get(i).showprn())){
                    return i;
                }
            }
        }
        return -1;
    }
    public void replace(Students stu, int a,String set){
        if(a==1){
            stu.setName(set);
        }
        else if(a==2){
            stu.setPrn(set);
        }
        else if(a==3){
            stu.setBranch(set);
        }
        else if(a==4){
            stu.dateOfBirth(set);
        }
        display(stu);
    }
    public void replaceMarks(Students stu, int[] arr){
        double d;
        d = stu.sum()/5.0;
        delGrades(d);
        stu.setMarks(arr);
        d = stu.sum()/5.0;
        grades(d);
    }
    public void grades(double d){
        if(d>80){
            numbers[0] = numbers[0]+1;
        }
        else if(d>60){
            numbers[1] = numbers[1]+1;
        }
        else if(d>=40){
            numbers[2] = numbers[2]+1;
        }
        else{
            numbers[3] = numbers[3]+1;
        }
    }
    public void delGrades(double d){
        if(d>80){
            numbers[0] = numbers[0]-1;
        }
        else if(d>60){
            numbers[1] = numbers[1]-1;
        }
        else if(d>=40){
            numbers[2] = numbers[2]-1;
        }
        else{
            numbers[3] = numbers[3]-1;
        }
    }
    public void gradesRatio(){
        System.out.println("\nA - "+numbers[0]);
        System.out.println("B - "+numbers[1]);
        System.out.println("C - "+numbers[2]);
        System.out.println("F - "+numbers[3]);
    }
    public static Comparator<Students> setByMarks = new Comparator<Students>(){
        public int compare(Students s1, Students s2){
            int marks1 = s1.sum();
            int marks2 = s2.sum();
            return marks2-marks1;
        }
    };
    public void display(Students stu){
        System.out.println("NAME = "+stu.showname());
        System.out.println("PRN = "+stu.showprn());
        System.out.println("Branch = "+stu.showbranch());
        System.out.println("Date of Birth = "+stu.getdateOfBirth());
        System.out.println("Total Marks = "+stu.sum()+"/500");
        System.out.println("Percentage = "+stu.sum()/5+"%");
    }
}
