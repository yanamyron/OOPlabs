package com.example.barbershop;
import java.util.Arrays;
public class Barber {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String phoneNumber;
    private int experience;
    private String specialization;
    private double hourlyRate;
    private String[] services;

    public Barber(int id, String lastName, String firstName, String middleName, String phoneNumber,
                  int experience, String specialization, double hourlyRate, String[] services) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.specialization = specialization;
        this.hourlyRate = hourlyRate;
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
    public int getExperience() {
        return experience;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public String[] getServices() {
        return services;
    }
}
