
import java.util.Arrays;

public class Barber {
    private static int counter = 0;

    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String phoneNumber;
    private int experience;
    private String specialization;
    private double hourlyRate;
    private String[] services;

    public Barber() {
        this.id = ++counter;
        this.lastName = "";
        this.firstName = "";
        this.middleName = "";
        this.phoneNumber = "";
        this.experience = 0;
        this.specialization = "";
        this.hourlyRate = 0.0;
        this.services = new String[]{};
    }

    public Barber(String lastName, String firstName, String middleName, String phoneNumber,
                  int experience, String specialization, double hourlyRate, String[] services) {
        this.id = ++counter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.specialization = specialization;
        this.hourlyRate = hourlyRate;
        this.services = services;
    }

    public Barber(Barber other) {
        this.id = ++counter;
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.middleName = other.middleName;
        this.phoneNumber = other.phoneNumber;
        this.experience = other.experience;
        this.specialization = other.specialization;
        this.hourlyRate = other.hourlyRate;
        this.services = Arrays.copyOf(other.services, other.services.length);
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Barber.counter = counter;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getExperience() {
        return experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public String[] getServices() {
        return services;
    }

    @Override
    public String toString() {
        return "Barber{" +
                "id=" + id +
                ", LastName='" + lastName + '\'' +
                ", FirstName='" + firstName + '\'' +
                ", MiddleName='" + middleName + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                ", Experience=" + experience +
                ", Specialization='" + specialization + '\'' +
                ", HourlyRate=" + hourlyRate +
                ", Services=" + Arrays.toString(services) +
                '}';
    }
}
