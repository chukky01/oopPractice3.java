import java.util.List;  // Imports List interface for collection handling

public class User {  // Defines public User class that will be extended by Student/Teacher
    
    // Private instance fields (encapsulated data)
    private String _name;           // Stores user's name
    private String _membership = "Bronze";  // Stores membership status, defaults to "Bronze"
    
    // Private verification status field
    private boolean _verified = false;  // Tracks if user is verified, defaults to false

    // Setter for verification status (package-private access)
    void set_verified(boolean verified){
        _verified = verified;  // Updates the private _verified field
    }

    // Getter for verification status (package-private access)
    boolean get_verified(){
        return _verified;  // Returns current verification state
    }
    
    // Static field shared across all User instances
    public static List<User> admins;  // Holds list of admin users (no initialization here)

    // Instance method for verification (can be overridden by subclasses)
    void verify(){
        System.out.println("Verifying....");  // Prints generic verification message
        set_verified(true);  // Marks user as verified by calling setter
    }

    // Static method to print names of all admins
    public static void print_admin_names(){
        // Loops through each User object 'u' in the static admins list
        for(User u: admins){
            System.out.println(u.get_name());  // Prints name of current admin user
        }

    }

    // Overrides Object's toString() for custom string representation
    public String toString(){
        return get_name() + " " + get_membership();  // Returns "name membership" format
    }

    // Custom equals method to compare User objects
    public boolean equals(User u2){
        // Compares name and membership using == (should use .equals() for proper string comparison)
        if (get_name() == u2.get_name() && get_membership() == u2.get_membership()){
            return true;  // Returns true if both fields match
        } else{
            return false;  // Returns false otherwise
        }
    }

    // Default no-argument constructor
    public User(){

    }
    
    // Constructor with name and membership parameters
    public User(String name, String membership) {
        //TODO Auto-generated constructor stub
        set_name(name);           // Sets name via setter method
        set_membership(membership);  // Sets membership via setter method
    }

    // Constructor with only name parameter (uses default membership)
    public User(String name) {
        //TODO Auto-generated constructor stub
        set_name(name);  // Sets name via setter method
    }

    // Setter for name (package-private access)
    void set_name(String name){
        _name = name;  // Assigns parameter to private _name field
    }

    // Getter for name (package-private access)
    String get_name(){
        return _name;  // Returns current name value
    }

    // Setter for membership using String (package-private access)
    void set_membership(String membership){
        _membership = membership;  // Assigns string to private _membership field
    }

    // Overloaded setter for membership using enum (package-private access)
    void set_membership(Membership membership){
        _membership = membership.name();  // Converts enum to string and assigns it
    }

    // Public enum defining valid membership levels as constants
    public enum Membership{
        Bronze, Silver, Gold;
    }

    // Getter for membership (package-private access)
    String get_membership(){
        return _membership;  // Returns current membership value
    }

}  // End of User class
