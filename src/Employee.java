public class Employee {
    private String name;
    private String secondName;
    private String surname;
    private int salary;
    private int department;
    private final int id;
    private static int counter = 0;

    public Employee(String name, String secondName, String surname, int department, int salary) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        this.id = counter ++;
    }

    public String getName() {
        return this.name;
    }
    public String getSecondName () { return this.secondName;}
    public String getSurname() {
        return this.surname;
    }
    public int getSalary() {return salary;}
    public int getDepartment() {return department;}

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId () {
        return id;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", id=" + id +
                '}';
    }
    }






