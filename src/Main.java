public class Main {
    public static void main(String[] args) {
        Employee ben = new Employee("Ben", 34, Gender.MALE, 25.3);

        int days = 10;
        System.out.printf("%s's salary for %d days is %.2f%n", ben.getName(), days, ben.getSalary(days));

        Manager anna = new Manager("Anna", 45, Gender.FEMALE, 30, 23);

        days = 30;
        System.out.printf("%s's salary for %d days is %.2f%n", anna.getName(), days, anna.getSalary(days));
    }
}
