public class Main {
    public static void main(String[] args) {

        Manager[] managers = {
            new Manager(101, "Balu", 60000),
            new Manager(102, "Surya", 45000),
            new Manager(103, "Ravi", 70000)
        };

        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");

        for (int i = 0; i < managers.length; i++) {
            System.out.println("\nEmployee " + (i + 1));
            managers[i].displayInfo();
        }
    }
}