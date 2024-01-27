import java.time.LocalDate;


public class App {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee("Maxim", "Fedorov", LocalDate.of(1986, 7, 28), "operator", 15000.00);
        Employee emp2 = new Employee("Petr", "Ivanov", LocalDate.of(1975, 10, 25), "accountant", 16000.00);
        Manager emp3 = new Manager("Oleg", "Sidorov", LocalDate.of(1980, 12, 01), "manager", 25000.00);
       
        Employee[] employees = new Employee[3];
        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;

        System.out.println("Оклады до повышения:");
        for(Employee object : employees){
            System.out.println(object.toString());
        }

        System.out.println("Оклады до повышения:");
        Manager.increaseSalary(employees, 20);
        for(Employee object : employees){
            System.out.println(object.toString());
        }
    }
}

