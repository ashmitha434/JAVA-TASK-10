public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lasteName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lasteName;
        this.salary = salary;

    }
    public int getId(){
        return id;

    }
    public String getFirstName(){
        return firstName;

    }
    public String getlastName(){
        return lastName;

    }
    public String getName(){
        return firstName + " " + lastName;
        
    }
    public int getSalary(){
        return salary;

    }
    public void setSalary (int salary){
        this.salary = salary;
    }
    public void raiseSalary(int percent) {
        double raisePercentage = (double) percent / 100;
        double raiseAmount = salary * raisePercentage;
        salary += raiseAmount;
        
    }
    public int getAnnualSalary(){
        return salary * 12;

    }
    @Override
    public String toString(){
        return "Employee [ id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
        
    }
    public static void main(String[] args) {
        // Example usage
        Employee employee = new Employee(1, "John", "Doe", 50000);
        System.out.println("Original Employee Details:");
        System.out.println(employee);

        // Raise salary by 10%
        employee.raiseSalary(10);
        System.out.println("\nAfter 10% Raise:");
        System.out.println(employee);
    }

}
