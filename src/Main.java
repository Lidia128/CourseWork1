import java.util.Arrays;
public class Main {

    public static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Антон", "Валерьевич", "Сафонов", 1, 52365);
        employees[1] = new Employee("Николай", "Иванович", "Иванов", 2, 78249);
        employees[2] = new Employee("Екатерина", "Фёдоровна", "Носкова", 3, 47549);
        employees[3] = new Employee("Надежда", "Петровна", "Кадешева", 1, 23895);
        employees[4] = new Employee("Константин", "Сергеевич", "Титов", 4, 95648);
        employees[5] = new Employee("Олег", "Давидович", "Смирнов", 5, 59218);
        employees[6] = new Employee("Ольга", "Викторовна", "Колос", 2, 35964);
        employees[7] = new Employee("Наталия", "Николаевна", "Че", 5, 99562);
        employees[8] = new Employee("Александра", "Павловна", "Безродная", 3, 41567);
        employees[9] = new Employee("Алексей", "Антонович", "Бородин", 4, 84215);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();
        getFullName();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты составляет " + totalSumSalary() + " рублей");
        System.out.println();
        System.out.println("Сотрудник " + getEmployeeMax() + " имеет максимальную зарплату");
        System.out.println();
        System.out.println("Сотрудник " + getEmployeeMin() + " имеет минимальную зарплату");
        System.out.println();
        System.out.println("Среднее значение зарплат " + midlSumSalary() + " рублей");
        System.out.println();
    }

    public static Employee getEmployeeMax() {
        int max = Integer.MIN_VALUE;
        Employee employeeMax = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeMax = employee;
            }
        }
        return employeeMax;
    }

    public static Employee getEmployeeMin() {
        int min = Integer.MAX_VALUE;
        Employee employeeMin = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeMin = employee;
            }
        }
        return employeeMin;
    }

    public static int totalSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static int midlSumSalary() {
        int sum = 0;
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += totalSumSalary();
                counter++;
            }
        }
        return sum / counter;
    }
    public static void getFullName() {
        for (Employee employee : employees)
        System.out.println(employee.getName() + " " + employee.getSecondName() +
                " " + employee.getSurname());
    }}









