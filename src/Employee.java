// Subclass of Person representing an employee with additional attributes
public class Employee extends Person {
    private String position;
    private double salary;

    // Default constructor calls the superclass constructor
    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public double getPaymentAmount() {
        return salary;
    }

    // toString method provides a formatted string representation with salary information
    @Override
    public String toString() {
        return super.toString() + " earns  " + salary + " tenge";
    }
}