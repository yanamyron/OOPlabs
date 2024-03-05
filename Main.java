

import java.util.Arrays;
import java.util.Objects;

public class Main {
    private Barber[] barbers = new Barber[5];

    public void createBarbersArray() {
        barbers[0] = new Barber(1, "Кривий", "Тимофій", "Григоровия", "123456789",
                5, "Чоловічі стрижка", 20.0, new String[]{"Стрижка", "Бриття"});
        barbers[1] = new Barber(2, "Скрипка", "Ігор", "Андрійович", "123494260",
                2, "Дитячі стрижки", 18.0, new String[]{"Стрижка"});
        barbers[2] = new Barber(3, "Ступка", "Катерина", "Михайлівна", "123412349",
                7, "Жіночі стрижки", 25.0, new String[]{"Стрижка", "Покраска"});
        barbers[3] = new Barber(4, "Луцьків", "Юля", "Андріївна", "123896701",
                1, "Чоловіча стрижка", 15.0, new String[]{"Стрижка", "Бриття"});
        barbers[4] = new Barber(5, "Мельник", "Ольга", "Ігорівна", "123458923",
                4, "Дитяча стрижка стрижка", 18.0, new String[]{"Стрижка"});
    }

    public void filterByExperienceAndPrint(Integer minExperience) {
        for (Barber barber : barbers) {
            if (barber.getExperience().compareTo(minExperience) >= 0) {
                System.out.println(barber);
            }
        }
    }


    public void sortByHourlyRateAndPrint() {
        Arrays.sort(barbers, (b1, b2) -> Double.compare(Objects.requireNonNullElse(b1.getHourlyRate(), 0.0),
                Objects.requireNonNullElse(b2.getHourlyRate(), 0.0)));
        for (Barber barber : barbers) {
            System.out.println(barber);
        }
    }

    public void filterByServiceAndPrint(String service) {
        for (Barber barber : barbers) {
            if (barber.getServices() != null && Arrays.asList(Objects.requireNonNullElse(barber.getServices(),
                    new String[0])).contains(service)) {
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
        System.out.println("\nПерукарі які надають послугу 'Бриття':");
        main.filterByServiceAndPrint("Бриття");
    }
}
