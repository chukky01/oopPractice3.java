import java.util.ArrayList;  // Imports ArrayList class for dynamic array functionality
import java.util.List;       // Imports List interface for collection operations

public class practice {     // Defines main class for demonstrating polymorphism

    public static void main(String[] args) {  // Main method - program entry point

        // Creates Student object and sets name using inherited setter
        Student s = new Student();
        s.set_name("Student");
        
        // Creates Teacher object and sets name using inherited setter
        Teacher t = new Teacher();
        t.set_name("Teacher");
        
        // Initializes static admins list in User class with empty ArrayList
        User.admins = new ArrayList<User>();

        // Adds various User objects (Student, Teacher, User) to the admins list
        // Demonstrates polymorphism - storing subclass objects in superclass collection
        User.admins.add(s);  // Adds Student object (upcast to User)
        User.admins.add(t);  // Adds Teacher object (upcast to User)
        User.admins.add(new User("Paul"));   // Creates and adds User object
        User.admins.add(new User("You"));    // Creates and adds User object
        User.admins.add(new User("Jacob"));  // Creates and adds User object

        // Iterates through each User object in the admins list
        for(User u: User.admins){
            u.verify();  // Polymorphic method call - verify() behavior depends on actual object type
        }
        
    }  // End of main method
}  // End of practice class
