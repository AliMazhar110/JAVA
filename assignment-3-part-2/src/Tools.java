import java.util.Comparator;
import java.util.Vector;

public class Tools {
    public int search(Vector<Employee> list, String option, String str){
        if(option.equals("name")){
            for(int i=0;i<list.size();i++){
                if(str.equals(list.get(i).showName())){
                    return i;
                }
            }
        }
        else if(option.equals("id")){
            for(int i=0;i<list.size();i++){
                if(str.equals(list.get(i).showId())){
                    return i;
                }
            }
        }
        return -1;
    }
    public void delete(Vector<Employee> list,int pos){
        list.remove(pos);
        Employee.count-=1;
    }
    public static Comparator<Employee> setByName = new Comparator<Employee>(){
        public int compare(Employee emp1, Employee emp2){
            String name1 = emp1.showName().toUpperCase();
            String name2 = emp2.showName().toUpperCase();
            return name1.compareTo(name2);
        }
    };
    public void display(Employee emp){
        System.out.println("Name = "+emp.showName());
        System.out.println("ID = "+emp.showId());
        System.out.println("Gender = "+emp.showSex());
        System.out.println("Job Title = "+emp.showJob());
        System.out.println("Organization's Name = "+emp.showCompany());
        System.out.println("Salary = "+emp.showSalary());
    }
    public void compareBySalary(Employee e1, Employee e2){
        if(e1.showSalary()>e2.showSalary()){
            System.out.println("\n--------------------------------------------------");
            System.out.println(e1.showName()+" earns "+(e1.showSalary()-e2.showSalary())+" more than "+e2.showName());
            System.out.println("--------------------------------------------------");
        }
        else{
            System.out.println("\n--------------------------------------------------");
            System.out.println(e2.showName()+" earns "+(e2.showSalary()-e1.showSalary())+" more than "+e1.showName());
            System.out.println("--------------------------------------------------");
        }
    }
}
