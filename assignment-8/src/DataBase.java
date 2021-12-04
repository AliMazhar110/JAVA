import java.sql.*;

public class DataBase {
    private final static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private final static String url = "jdbc:mysql://localhost:3306/assignment_8";
    private final static String userPass = "ALImazhar@110";
    private final static String userName = "root";

    private Statement statement;
    private ResultSet resultSet;
    private Connection con;
    public DataBase(){
        createDatabase();
        createTable();
    }
    private void createDatabase(){
        try{
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(url,userName,userPass);
            statement = con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public void createTable(){
        try {
            DatabaseMetaData dbm = con.getMetaData();
            resultSet = dbm.getTables(null,null,"Employee",null);
            if(resultSet.next()){
                return;
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        try{
            statement.execute("create table Employee(empno int, empname varchar(30), department varchar(10), job varchar(15), salary float);");
            statement.execute("insert into Employee values(8369,'Steve Smith','IT','Manager',80000.00);");
            statement.execute("insert into Employee values(8654,'Momin Khan Momin','Sales','Salesman',12050.00);");
            statement.execute("insert into Employee values(8839,'Amir Khan','Sales','President',150000.00);");
            statement.execute("insert into Employee values(8934,'Mita Haque','HR','Clerk',23000.00);");
            statement.execute("insert into Employee values(8900,'Jatin Sapru','HR','Clerk',25050.00);");
        } catch(Exception err){
            System.out.println("ERROR: "+err);
        }
    }
    public void insertInTable(int empno, String name, String dept, String job, float sal) {
        try {
            statement.execute("insert into Employee values(" + empno + ", '" + name + "', '" + dept + "', '" + job + "', "
                    + sal + ");");

        }
        catch(Exception err){
            System.out.println("ERROR: "+err);
        }
    }
    public void dropTable(){
        try {
            statement.execute("drop table Employee;");
        }
        catch(Exception err){
            System.out.println("ERROR: "+err);
        }
    }

    public void search(String name){
        try{
            resultSet = statement.executeQuery("select * from Employee where empname='"+name+"';");
            if(resultSet != null) {
                System.out.println("+-----------+------------------------------+-----------------+---------------+---------------+");
                System.out.println("|***************************************SEARCH RESULT****************************************|");
                System.out.println("+-----------+------------------------------+-----------------+---------------+---------------+");
                System.out.println("|  EMP. NO  |             NAME             |    DEPARTMENT   |      JOB      |      SALARY   |");
                System.out.println("+-----------+------------------------------+-----------------+---------------+---------------+");
                while (resultSet.next()) {
                    System.out.format("| %9.9s | %28.28s | %15.15s | %13.13s | %13.13s |", resultSet.getString(1),
                            resultSet.getString(2), resultSet.getString(3),
                            resultSet.getString(4), resultSet.getString(5));
                    System.out.println("\n+-----------+------------------------------+-----------------+---------------+---------------+");
                }
            }
        }
        catch(Exception err){
            System.out.println("ERROR: "+err);
        }
    }
    public void updateSalary(int empno, float sal){
        try{
            statement.execute("update Employee set salary="+sal+" where empno="+empno+";");
        }
        catch(Exception e){
            System.out.println("ERROR: "+e);
        }
    }
    public void deleteEmployee(int empno) {
        try {
            statement.execute("delete from Employee where empno=" + empno + ";");
        }
        catch (Exception e){
            System.out.println("ERROR: "+e);
        }
    }
    public void displayTable() {
        try {
            System.out.println("+-----------+------------------------------+-----------------+---------------+---------------+");
            System.out.println("|******************************************TABLE*********************************************|");
            System.out.println("+-----------+------------------------------+-----------------+---------------+---------------+");
            System.out.println("|  EMP. NO  |             NAME             |    DEPARTMENT   |      JOB      |      SALARY   |");
            System.out.println("+-----------+------------------------------+-----------------+---------------+---------------+");
            resultSet = statement.executeQuery("select * from Employee;");
            if(resultSet != null) {
                while (resultSet.next()) {
                    System.out.format("| %9.9s | %28.28s | %15.15s | %13.13s | %13.13s |", resultSet.getString(1),
                            resultSet.getString(2), resultSet.getString(3),
                            resultSet.getString(4), resultSet.getString(5));
                    System.out.println("\n+-----------+------------------------------+-----------------+---------------+---------------+");
                }
            }
        }
        catch (Exception err){
            System.out.println("ERROR: "+err);
        }
    }

}
