
import java.util.Arrays;
import java.util.Objects;

public class Barber {
    private Integer id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String phoneNumber;
    private Integer experience;
    private String specialization;
    private Double hourlyRate;
    private String[] services;

    public Barber(Integer id, String lastName, String firstName, String middleName, String phoneNumber,
                  int experience, String specialization, double hourlyRate, String[] services) {
        this.id = Integer.valueOf(id);
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.experience = Integer.valueOf(experience);
        this.specialization = specialization;
        this.hourlyRate = Double.valueOf(hourlyRate);
        this.services = services;
    }

    @Override
    public String toString() {
        return "Barber{" +
                "id=" + id +
                ", Прізвище='" + lastName + '\'' +
                ", Ім'я='" + firstName + '\'' +
                ", По батькові='" + middleName + '\'' +
                ", Номер телефону='" + phoneNumber + '\'' +
                ", Досвід,роки=" + experience +
                ", Спеціалізація='" + specialization + '\'' +
                ", Погодинна оплата=" + hourlyRate +
                ", Послуги=" + Arrays.toString(services) +
                '}';
    }

    public Integer getExperience() {
        return experience;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public String[] getServices() {
        return services;
    }
}
