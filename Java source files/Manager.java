public class Manager extends Employee {
    private double salary;

    public Manager(int empId, String name, double salary) {
        super(empId, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);

        if (salary > 50000) {
            System.out.println("Category: Senior Manager");
        } else {
            System.out.println("Category: Manager");
        }
    }
}