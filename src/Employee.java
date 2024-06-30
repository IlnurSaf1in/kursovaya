public class Employee {
    private static int counter;
    private Integer id;
    private String fullName;
    private int departament;

    private double salary;
    public Employee(String fullName,int departament, double salary){
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        this.id = counter++;
    }
    public String getFullName (){
        return fullName;
    }
    public int getDepartament(){
        return departament;
    }
    public double getSalary(){
        return salary;
    }
    public Integer getId(){
        return this.id;
    }
    public void setEmployee(){
        this.fullName = fullName;
        this.departament = departament;
        this.salary = salary;
        this.id = counter++;
    }
    public void setDepartament(int departament){
        this.departament = departament;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    @Override
    public String toString(){
        return id + " " + fullName + " " + departament + " " + salary;
    }

}
