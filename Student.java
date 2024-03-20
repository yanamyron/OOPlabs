
public class Student extends Person {
    private String patronymic;
    private String address;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String lastName, String firstName, String patronymic, String address, String phoneNumber, String faculty, int course, String group) {
        super(lastName, firstName, phoneNumber);
        this.patronymic = patronymic;
        this.address = address;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Patronymic: " + patronymic);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Faculty: " + faculty);
        System.out.println("Course: " + course);
        System.out.println("Group: " + group);
    }
}
