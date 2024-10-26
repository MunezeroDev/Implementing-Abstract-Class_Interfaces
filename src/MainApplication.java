// main class - starting point
public class MainApplication {

    public static void main(String[] args){

        Admin curAdmin = new Admin(0001, "William", "1234567890");// instantiation

        User curUser = new User(1001, "Kamau");

        curAdmin.performOperation(new Update()); // Admin Updates the data.

        curUser.performOperation(new View()); // User can view the data.

    }
}
