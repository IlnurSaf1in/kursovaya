import java.util.Objects;

public class EmployeeBook {
    private static final Employee[] employees = new Employee[10];

    public void printEmployees() {        // 1.1
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void salaryCosts() { // 1.2
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println(sum);
    }

    public void fidingSmallsetSalaryEmployeer() { // 1.3
        double min = employees[0].getSalary();
        Employee emp11 = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (min > employees[i].getSalary()) {
                    emp11 = employees[i];
                }
            }
        }
        System.out.println(emp11 + " сотрудник с самой маленькой зарплатой");
    }

    public void fidingBiggersetSalaryEmployeer() { // 1.4
        double max = employees[0].getSalary();
        Employee emp11 = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (max < employees[i].getSalary()) {
                    emp11 = employees[i];
                }
            }
        }
        System.out.println(emp11 + " сотрудник с самй большой зарплатой");
    }

    public void fidingAverageSalaryEmployeers() { // 1.5
        double AverageSalaryEmployeers;
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        System.out.println(sum / employees.length);
    }

    public void displayedFullNameAllEmployeers() { // 1.6
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public void indexationSalary() { // 2.1
        Employee emp11 = employees[0];
        double index = 1.1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() * index);
            }
        }
    }

    public void fidingBiggersetSalaryEmployeer_1_Departament() { // 2.2
        Employee emp11 = employees[0];
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartament() == 1) {
                    if (max < employees[i].getSalary()) {
                        emp11 = employees[i];

                    }
                }
            }
        }
        System.out.println(emp11 + " сотрудник из 1 отдела с самой большой  зарплатой");
    }

    public void fidingSmallsetSalaryEmployeer_1_Departament() { // 2.3
        Employee emp11 = employees[0];
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartament() == 1) {
                    if (min > employees[i].getSalary()) {
                        emp11 = employees[i];

                    }
                }
            }
        }
        System.out.println(emp11 + " сотрудник из 1 отдела с самой маленькой зарплатой");
    }

    public void fidingAverageAndSumSalary_1_Departament() { // 2.4 - 2.5
        int id = 0;
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartament() == 1) {
                    sum = sum + employees[i].getSalary();
                    id++;
                }
            }
        }
        System.out.println(sum + "сумма зарплат по 1 департаменту");
        System.out.println(sum / id + "средняя зарплата по 1 департаменту");
    }

    public void indexationSalaryDepartament() { // 2.6
        Employee emp11 = employees[0];
        double index = 1.1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartament() == 1) {
                    employees[i].setSalary(employees[i].getSalary() * index);
                }
            }
        }

    }

    public void printEmployeersDepartament() { // 2.7
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartament() == 1) {
                    System.out.println(employees[i].getId() + " " + employees[i].getFullName() + " " + employees[i].getSalary() + " проиндексированная зарплата по отделу");
                }
            }
        }
    }

    public void fidingEmployeersLowerSalary() {
        int a = 2500;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < a) {
                    System.out.println(employees[i].getId() + " " + employees[i].getFullName() + " " + employees[i].getSalary() + " нахождение сотрудников с зарплатой ниже " + a);
                }
            }
        }
    }

    public void fidingEmployeersBiigerSalary() {
        int a = 8500;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() >= a) {
                    System.out.println(employees[i].getId() + " " + employees[i].getFullName() + " " + employees[i].getSalary() + " нахождение сотрудников с зарплатой выше " + a);
                }
            }
        }
    }

    public void addNewEmployee(String fullName, int departament, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName, departament, salary);
                break;
            }
            if (i == employees.length - 1) {
                System.out.println("мест нет");
            }
        }
    }

    public void deletedEmployee(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (Objects.equals(employees[i].getFullName(), fullName)) {
                    employees[i] = null;
                }
            }
        }
    }

    public void modernetSalaryEmployee(String fullName, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (Objects.equals(employees[i].getFullName(), fullName)) {
                    employees[i].setSalary(salary);
                }
            }
        }
    }
    public void modernetDepartamentmployee(String fullName, int departament) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (Objects.equals(employees[i].getFullName(), fullName)) {
                    employees[i].setDepartament(departament);
                }
            }
        }
    }
    public void printDepartamentsEmployee (int departament){
        System.out.println(departament + " отдел ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartament() == departament){
                    System.out.println(employees[i].getId() + " " + employees[i].getFullName() + " " + employees[i].getSalary());

                }
            }
        }
    }
}

