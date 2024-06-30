public class Main {
    void nonStaticMethod(){

    }
    static void staticMethod(){

    }
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addNewEmployee("name1" , 1, 1000);
        employeeBook.addNewEmployee("name2" , 1, 2000);
        employeeBook.addNewEmployee("name3" , 2, 3000);
        employeeBook.addNewEmployee("name4" , 2, 4000);
        employeeBook.addNewEmployee("name5" , 3, 5000);
        employeeBook.addNewEmployee("name6" , 3, 6000);
        employeeBook.addNewEmployee("name7" , 4, 7000);
        employeeBook.addNewEmployee("name8" , 4, 8000);
        employeeBook.addNewEmployee("name9" , 5, 9000);
        employeeBook.addNewEmployee("name10" , 5, 10000);
        employeeBook.addNewEmployee("name10" , 5, 10000);


        employeeBook.printEmployees();
        employeeBook.salaryCosts();
        employeeBook.fidingSmallsetSalaryEmployeer();
        employeeBook.fidingBiggersetSalaryEmployeer();
        employeeBook.fidingAverageSalaryEmployeers();   // базовая сложность
        employeeBook.displayedFullNameAllEmployeers();
        employeeBook.indexationSalary();
        employeeBook.fidingSmallsetSalaryEmployeer_1_Departament();
        employeeBook.fidingBiggersetSalaryEmployeer_1_Departament();
        employeeBook.fidingAverageAndSumSalary_1_Departament();
        employeeBook.indexationSalaryDepartament();
        employeeBook.printEmployeersDepartament();
        employeeBook.fidingEmployeersLowerSalary();
        employeeBook.fidingEmployeersBiigerSalary();  // повышенная сложность
        employeeBook.deletedEmployee("name1");
        employeeBook.printEmployees();
        employeeBook.modernetSalaryEmployee("name10" , 999);
        employeeBook.printEmployees();
        employeeBook.modernetDepartamentmployee("name10" , 3);
        employeeBook.printEmployees();
        for (int i = 0; i <= 5; i++) {
            employeeBook.printDepartamentsEmployee(i);
        }






    }
}