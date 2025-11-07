public class Teacher extends User {  // Defines Teacher class that inherits from User class
    
    // Method to verify teacher (package-private access)
    void verify(){
        System.out.println("Verifying through phone");  // Prints verification method to console
        set_verified(true);  // Marks teacher as verified by calling inherited setter
    }
}
