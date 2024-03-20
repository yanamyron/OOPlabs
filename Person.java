public abstract class Person {
    private static int counter = 0;
    protected int id;
    protected String lastName;
    protected String firstName;
    protected String phoneNumber;

    public Person(String lastName, String firstName, String phoneNumber) {
        this.id = ++counter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public Person(Person other) {
        this.id = ++counter;
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.phoneNumber = other.phoneNumber;
    }


    public abstract void displayDetails();
}
