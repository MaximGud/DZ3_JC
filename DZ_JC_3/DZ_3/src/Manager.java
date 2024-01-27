import java.time.LocalDate;

public class Manager extends Employee{
   // Конструктор класса Manager
   public Manager(String firstName, String lastName, LocalDate birthDate, String position, double salary) {
    super(firstName, lastName, birthDate, position, salary);
}

// Статический метод для повышения зарплаты, если сотрудник не руководитель
public static void increaseSalary(Employee[] employees, double percentage) {
    for (Employee employee : employees) {
        if (!(employee instanceof Manager)) {
            double currentSalary = employee.getSalary();
            double newSalary = currentSalary * (1 + percentage / 100);
            employee.setSalary(newSalary);
        }
    }
}
}
