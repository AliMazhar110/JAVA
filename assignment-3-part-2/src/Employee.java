public class Employee {
    private String name,id,sex,job,company;
    private int salary;
    public static int count;
    public Employee(String name, String id,String sex, String job, String company,int salary){
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.job = job;
        this.company = company;
        this.salary = salary;
        count+=1;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setJob(String job){
        this.job = job;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String showName(){
        return name;
    }
    public String showId(){
        return id;
    }
    public String showSex(){
        return sex;
    }
    public String showJob(){
        return job;
    }
    public String showCompany(){
        return company;
    }
    public int showSalary(){
        return salary;
    }
    public static Employee makeObject(String name, String id, String sex, String job, String company, int salary){
        return new Employee(name,id,sex,job,company,salary);
    }
}
