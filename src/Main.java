import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store instances of Person, Employee, and Student
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Teacher", 27045.78));
        people.add(new Employee("George", "Harrison", "Teacher", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.1));
        people.add(new Student("Paul", "McCartney", 3.8));

        // Sort the ArrayList in descending order based on payment amount
        Collections.sort(people);
        Collections.reverse(people);
        printData(people);
    }

    // Method to print data of people
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}