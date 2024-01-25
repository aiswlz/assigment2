public class Person implements Payable, Comparable<Person> {
    private String name;
    private String surname;
    private final int id;
    private static int counter = 1;

    // Default constructor increments the counter and assigns an ID
    public Person() {
        this.id = counter++;
    }


    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    // Abstract method to get the position (Student or Employee) of the person
    public String getPosition() {
        return "Student";
    }

    // toString method provides a formatted string representation
    @Override
    public String toString() {
        return getPosition() + ": " + id + ". " + name + " " + surname;
    }

    // Abstract method to get the payment amount (to be implemented by subclasses)
    @Override
    public double getPaymentAmount() {
        return 0;
    }

    // CompareTo method for sorting based on payment amount in descending order
    @Override
    public int compareTo(Person other) {
        return Double.compare(other.getPaymentAmount(), getPaymentAmount());
    }
}