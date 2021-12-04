public class Students {
    private String name,prn,branch;
    private int[] marks = new int[5];
    DateOfBirth date = new DateOfBirth();
    public Students(String name,String prn,String branch,int arr[],String d){
        this.name = name;
        this.prn = prn;
        this.branch = branch;
        for(int i=0;i<5;i++){
            marks[i] = arr[i];
        }
        date.setDob(d);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrn(String prn){
        this.prn = prn;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public void setMarks(int arr[]){
        for(int i=0;i<5;i++){
            marks[i] = arr[i];
        }
    }
    public void dateOfBirth(String str){
        date.setDob(str);
    }
    public String showname(){
        return name;
    }
    public String showprn(){
        return prn;
    }
    public String showbranch(){
        return branch;
    }
    public String getdateOfBirth(){
        return date.getdob();
    }
    public int sum(){
        int total=0;
        for(int i=0;i<5;i++){
            total+=marks[i];
        }
        return total;
    }
}
class DateOfBirth{
    private String dob;
    public void setDob(String dob){
        this.dob=dob;
    }
    public String getdob(){
        return dob;
    }
}
