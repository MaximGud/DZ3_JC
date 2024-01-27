
  //Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные 
  //в виде трёх чисел гггг-мм-дд, без использования условного оператора.

  import java.time.LocalDate; //использeуем класс LocalDate для даты
  import java.util.Comparator;
  
  public class Employee {
      private String firstName;
      private String lastName;
      private LocalDate birthDate;
      private String position;
      private double salary;
  
      public Employee(String firstName, String lastName, LocalDate birthDate, String position, double salary) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.birthDate = birthDate;
          this.position = position;
          this.salary = salary;
      }
  
      public java.lang.String getFirstName() {
          return firstName;
      }
  
      public void setFirstName(java.lang.String firstName) {
          this.firstName = firstName;
      }
  
      public java.lang.String getLastName() {
          return lastName;
      }
  
      public void setLastName(java.lang.String lastName) {
          this.lastName = lastName;
      }
  
      public java.time.LocalDate getBirthday() {
          return birthDate;
      }
  
      public void setBirthDate(java.time.LocalDate birthDate) {
          this.birthDate = birthDate;
      }
  
      public java.lang.String getPosition() {
          return position;
      }
  
      public void setPosition(java.lang.String position) {
          this.position = position;
      }
  
      public double getSalary() {
          return salary;
      }
  
      public void setSalary(double salary) {
          this.salary = salary;
      }
  
      
      // Прототип компаратора для сравнения двух дат 
      public static Comparator<Employee> birthDateComparator() {
          return Comparator.comparing(employee -> employee.birthDate);
      }

      @Override
      public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
            + ", position=" + position + ", salary=" + salary + "]";
      }
  
  }