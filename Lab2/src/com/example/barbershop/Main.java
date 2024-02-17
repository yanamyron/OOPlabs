package com.example.barbershop;
import java.util.Arrays;
public class Main {
    private Barber[] barbers = new Barber[5];
    public void createBarbersArray() {
        // Тут ви можете вказати тестові дані для перукарів
        barbers[0] = new Barber(1, "Кривий", "Тимофій", "Григоровия", "123456789",
                5, "Чоловічі стрижка", 20.0, new String[]{"Стрижка", "Бриття"});
        barbers[1] = new Barber(2, "Скрипка", "Ігор", "Андрійович", "123494260",
                2, "Дитячі стрижки", 18.0, new String[]{"Стрижка"});
        barbers[2] = new Barber(3, "Ступка", "Катерина", "Михайлівна", "123412349",
                7, "Жіночі стрижки", 25.0, new String[]{"Стрижка","Покраска"});
        barbers[3] = new Barber(4, "Луцьків", "Юля", "Андріївна", "123896701",
                1, "Чоловіча стрижка", 15.0, new String[]{"Стрижка","Бриття"});
        barbers[4] = new Barber(5, "Мельник", "Ольга", "Ігорівна", "123458923",
                4, "Дитяча стрижка стрижка", 18.0, new String[]{"Стрижка"});
    }
    public void filterByExperienceAndPrint(int minExperience) {
        for (Barber barber : barbers) {
            if (barber.getExperience() >= minExperience) {
                System.out.println(barber);
            }
        }
    }
    public void sortByHourlyRateAndPrint() {
        Arrays.sort(barbers, (b1, b2) -> Double.compare(b1.getHourlyRate(), b2.getHourlyRate()));
        for (Barber barber : barbers) {
            System.out.println(barber);
        }
    }
    public void filterByServiceAndPrint(String service) {
        for (Barber barber : barbers) {
            if (Arrays.asList(barber.getServices()).contains(service)) {
                System.out.println(barber);
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.createBarbersArray();

        System.out.println("Перукарі з досвідом роботи від 3 років:");
        main.filterByExperienceAndPrint(3);

        System.out.println("\nПерукарі відсортовані по вартості надання послуг:");
        main.sortByHourlyRateAndPrint();

        System.out.println("\nПерукарі які надають послугу'Бриття':");
        main.filterByServiceAndPrint("Бриття");
    }
}
