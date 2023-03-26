public class Main {
    public static void main(String[] args) {
        Employee ben = new Employee("Ben", 34, Gender.MALE, 25.3);

        int days = 10;
        System.out.printf("%s's salary for %d days is %.2f", ben.getName(), days, ben.getSalary(days));
    }
}
