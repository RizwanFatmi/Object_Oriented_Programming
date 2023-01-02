
/*********************************
 * OBJECT ORIENTED PROGRAMMING *
 *********************************/
 
/*
 * TABLE OF CONTENTS
 * 1.Intoduction
 * 2.Class
 * 3.Objects
 * 4.Data Abstraction
 * 5.Encapsulation
 * 6.Inheritance
 * 7.Polymorphism
 * 
 * 
 * 1.INTRODUCTION:
 * As the name suggests, Object-Oriented Programming or OOPs refers to languages
 * that use objects in programming.
 * Object-oriented programming aims to implement real-world entities like
 * inheritance,hiding, polymorphism, etc
 * in programming. The main aim of OOP is to bind together the data and the
 * functions that operate on them so
 * that no other part of the code can access this data except that function.
 * 
 * 2.CLASS:
 * A class is a user-defined data type. It consists of data members and member
 * functions, which can be accessed
 * and used by creating an instance of that class. It represents the set of
 * properties or methods that are common
 * to all objects of one type. A class is like a blueprint for an object.
 * 
 * 3.OBJECT:
 * It is a basic unit of Object-Oriented Programming and represents the
 * real-life entities. An Object is an instance of a
 * Class. When a class is defined, no memory is allocated but when it is
 * instantiated (i.e. an object is created) memory
 * is allocated. An object has an identity, state, and behavior. Each object
 * contains data and code to manipulate the data.
 * Objects can interact without having to know details of each other’s data or
 * code, it is sufficient to know the type of
 * message accepted and type of response returned by the objects.
 * For example “Dog” is a real-life Object, which has some characteristics like
 * color, Breed, Bark, Sleep, and Eats.
 * 
 * 4.DATA ABSTRACTION:
 * Data abstraction is one of the most essential and important features of
 * object-oriented programming. Data abstraction
 * refers to providing only essential information about the data to the outside
 * world, hiding the background details or
 * implementation. Consider a real-life example of a man driving a car. The man
 * only knows that pressing the accelerators
 * will increase the speed of the car or applying brakes will stop the car, but
 * he does not know about how on pressing the
 * accelerator the speed is increasing, he does not know about the inner
 * mechanism of the car or the implementation of the
 * accelerator, brakes, etc in the car. This is what abstraction is.
 * 
 * 5.ENCAPSULATION:
 * Encapsulation is defined as the wrapping up of data under a single unit. It
 * is the mechanism that binds together code and
 * the data it manipulates. In Encapsulation, the variables or data of a class
 * are hidden from any other class and can be accessed
 * only through any member function of their class in which they are declared.
 * As in encapsulation, the data in a class is hidden
 * from other classes, so it is also known as data-hiding.
 * 
 * 6.INHERITANCE:
 * Inheritance is an important pillar of OOP(Object-Oriented Programming). The
 * capability of a class to derive properties and characteristics
 * from another class is called Inheritance. When we write a class, we inherit
 * properties from other classes. So when we create a class,
 * we do not need to write all the properties and functions again and again, as
 * these can be inherited from another class that possesses it.
 * Inheritance allows the user to reuse the code whenever possible and reduce
 * its redundancy.
 * 
 * 7.POLYMORPHISM:
 * The word polymorphism means having many forms. In simple words, we can define
 * polymorphism as the ability of a message to be displayed in
 * more than one form. For example, A person at the same time can have different
 * characteristics. Like a man at the same time is a father,
 * a husband, an employee. So the same person posses different behavior in
 * different situations. This is called polymorphism.
 * 
 */

// CREATING CLASS

class Mobile {

    // ATTRIBUTES
    String Mobile_Name;
    String Model_Name;
    int Model_Number;
    double Price;

    // FUNCTIONS
    public void Details() {
        System.out.println("\n" + Mobile_Name + "\n" + this.Model_Name + "\n" + this.Model_Number + "\n" + this.Price
                + "\n-----------------------");
    }

    // CONSTRUCTOR
    Mobile(String Mobile_Name, String Model_Name, int Model_Number, double Price) {
        this.Mobile_Name = Mobile_Name;
        this.Model_Name = Model_Name;
        this.Model_Number = Model_Number;
        this.Price = Price;
    }
}

class AirPhones {

    // ATTRIBUTES
    String Name;
    String Model_Name;
    int Model_Number;
    double Price;

    // FUNCTIONS:
    public void Details() {
        System.out.println("\n" + Name + "\n" + this.Model_Name + "\n" + this.Model_Number + "\n" + this.Price
                + "\n-----------------------");
    }

    // METHOD OVERLOADING:
    public void Info(String Name) {
        System.out.println("\n" + Name + "\n-----------------------");
    }

    public void Info(Double Price) {
        System.out.println("\n" + Price + "\n-----------------------");
    }

}

// INHERITANCE:
class Charger extends AirPhones {

}

// ACCESS MODIFIER:
class Account {
    public String Name;
    protected String UserName;
    private String Password;

    // GETTER & SETTER:

    String GetPassword() {
        return Password;
    }

    void SetPassword(String Pasword) {
        this.Password = Pasword;
    }

    // FUCTIONS:

    void AccountInfo() {
        System.out.println(this.Name);
        System.out.println(this.UserName);
        System.out.println(this.Password);

    }
}

public class ObjectOrientedProgramming {

    public static void main(String[] args) {

        // CREATING OBJECT :
        AirPhones Realme = new AirPhones();
        Realme.Name = "Realme Bud";
        Realme.Model_Name = "Bud 486";
        Realme.Model_Number = 256;
        Realme.Price = 1299.00;

        Charger Ubon = new Charger();
        Ubon.Name = "Ubon Charger";
        Ubon.Model_Name = "UB256";
        Ubon.Model_Number = 658;
        Ubon.Price = 50.00;

        Account S1 = new Account();
        S1.Name = "Rizwan";
        S1.UserName = "RF2568";
        S1.SetPassword("Reez2565");

        // CREATING OBJECTS USING CONSTRUCTOR:
        Mobile Oppo = new Mobile("Oppo", "S11", 115, 35000.00);
        Mobile Nokia = new Mobile("Nokia", "Acess", 5233, 1299.00);
        Mobile Redmi = new Mobile("Redmi", "Note4", 256, 9999.00);

        Nokia.Details();
        Oppo.Details();
        Redmi.Details();
        Realme.Details();
        Ubon.Details();

        Realme.Info(Realme.Name);
        Realme.Info(Realme.Price);

        S1.AccountInfo();
        System.out.println(S1.GetPassword());
    }

}
