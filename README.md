IMPLEMENTING ABSTRACT CLASS AND INTERFACE IN JAVA.

- This is a basic account management project that illustrate the concept of Abstract Classes and Interfaces in Object Oriented Development.

PROJECT STRUCTURE:

- The project consists of 6 main classes, each within its own file. The main class (MainApplication) serves as the entry point.

1. Account

   - This is an abstract class -> meaning it cannot be instantiated directly.
   - it's also a base class for subclasses 'Admin' and 'User' which will inherit properties from it.
   - It has 3 shared properties :id(int), name(String) and myData(a user-defined type) and a common method 'performOperation()'.

2. Admin

   - This a subclass of Account superClass -> meaning it inherites properties (id, name & myData) and method(performOperation) of Account.
   - it adds a private property 'password' -> meaning the property is only directly accessible within this Admin class itself.
   - it also has a constuctor 'Admin ()'of the same name that accepts arguments (id,name and Authpassword) for instantiation.

3. User

   - This is also a subclass of Account.
   - has a constructor "user()" that innitalise id and name of each user instance.

4. DataSource

   - An interface -> meaning it prototypes(declares) methods without implementing(defining) them.
   - In this case it has an abstract method "execute()" -> this is intended for implementation by classes(Delete,Update and View) to define their own specific method implementation.

5. Operational Classes

   - These are 3 classes "Delete", "Update" and "View" that implements the DataSource interface.
   - These thus customise the abstract "execute" method to fit their specific data operation namely delete, update and view data.

6. MainApplication
   - This is project 's entry point.
   - It instantiates Admin and user objects and pass arguments onto them.
   - 'performOperation()' method is called on the curAdmin object-> which recieves 'Update' arguments.
   - The 'performOperation()' implementation in Account , a parent class of Admin -> myData.execute() is called.
   - Since myData.execute() is an instance reference to update() -> the execute -> the execute() method in Update class is execute
   - This prints out our output : "Data has been Updated Successfully!"
   - the same process happens on curUser object, to print : "Some data to be displayed."
