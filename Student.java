public class Student extends User {  // Defines Student class that inherits from User class
    
    // Overrides the verify() method from User class to provide student-specific verification
    void verify(){
        System.out.println("Verifying through email");  // Prints student-specific verification method (email)
        set_verified(true);  // Calls inherited method to mark student as verified
    }
        
}  // End of Student class
