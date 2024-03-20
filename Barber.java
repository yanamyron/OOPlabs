import java.util.Arrays;

public class Barber extends Person {
    private static int counter = 0;

    private String middleName;
    private int experience;
    private String specialization;
    private double hourlyRate;
    private String[] services;

    public Barber() {
        super("", "", "");
        this.middleName = "";
        this.experience = 0;
        this.specialization = "";
        this.hourlyRate = 0.0;
        this.services = new String[]{};
    }

    public Barber(String lastName, String firstName, String middleName, String phoneNumber,
                  int experience, String specialization, double hourlyRate, String[] services) {
        super(lastName, firstName, phoneNumber);
        this.middleName = middleName;
        this.experience = experience;
        this.specialization = specialization;
        this.hourlyRate = hourlyRate;
        this.services = services;
    }

    public Barber(Barber other) {
        super(other);
        this.middleName = other.middleName;
        this.experience = other.experience;
        this.specialization = other.specialization;
        this.hourlyRate = other.hourlyRate;
        this.services = Arrays.copyOf(other.services, other.services.length);
    }


    public int getExperience() {
        return experience;
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
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", experience=" + experience +
                ", specialization='" + specialization + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", services=" + Arrays.toString(services) +
                '}';
    }

    @Override
    public void displayDetails() {
        System.out.println("Barber Details:");
        System.out.println("ID: " + id);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Experience: " + experience);
        System.out.println("Specialization: " + specialization);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Services: " + Arrays.toString(services));
    }




}
