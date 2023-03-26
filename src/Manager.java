public class Manager extends Employee{
    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(String name, int age, Gender gender, double salaryPerDay, int numberOfSubordinates) {
        super(name, age, gender, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(int days){
        return days * this.getSalaryPerDay() * (1 + this.getNumberOfSubordinates() / 100d);
    }
}
