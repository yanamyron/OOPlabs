import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private Barber[] barbers = new Barber[5];

    public void createBarbersArray() {
        barbers[0] = new Barber("Кривий", "Тимофій", "Григоровия", "123456789",
                5, "Чоловічі стрижка", 20.0, new String[]{"Стрижка", "Бриття"});
        barbers[1] = new Barber("Скрипка", "Ігор", "Андрійович", "123494260",
                2, "Дитячі стрижки", 18.0, new String[]{"Стрижка"});
        barbers[2] = new Barber("Ступка", "Катерина", "Михайлівна", "123412349",
                7, "Жіночі стрижки", 25.0, new String[]{"Стрижка", "Покраска"});
        barbers[3] = new Barber("Луцьків", "Юля", "Андріївна", "123896701",
                1, "Чоловіча стрижка", 15.0, new String[]{"Стрижка", "Бриття"});
        barbers[4] = new Barber("Мельник", "Ольга", "Ігорівна", "123458923",
                4, "Дитяча стрижка", 18.0, new String[]{"Стрижка"});
    }

    // Метод для виведення перукарів зі стажем більше 3 років
    public void filterByExperience(int minExperience) {
        for (Barber barber : barbers) {
            if (barber.getExperience() >= minExperience) {
                System.out.println(barber);
            }
        }
    }

    // Перевантажений метод без параметра для введення значення фільтрування
    public void filterByExperience() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть мінімальний стаж роботи для фільтрування: ");
        int minExperience = scanner.nextInt();
        filterByExperience(minExperience);
    }

    // Метод для сортування перукарів за вартістю надання послуг
    public void sortByHourlyRate() {
        sortByHourlyRateAscending();
    }

    // Перевантажений метод без параметра для введення значення фільтрування
    public void sortByHourlyRate(boolean descending) {
        if (descending) {
            sortByHourlyRateDescending();
        } else {
            sortByHourlyRateAscending();
        }
    }

    // Приватний метод для сортування за зростанням вартості
    private void sortByHourlyRateAscending() {
        Arrays.sort(barbers, (b1, b2) -> Double.compare(b1.getHourlyRate(), b2.getHourlyRate()));
        for (Barber barber : barbers) {
            System.out.println(barber);
        }
    }

    // Приватний метод для сортування за спаданням вартості
    private void sortByHourlyRateDescending() {
        Arrays.sort(barbers, (b1, b2) -> Double.compare(b2.getHourlyRate(), b1.getHourlyRate()));
        for (Barber barber : barbers) {
            System.out.println(barber);
        }
    }

    // Метод для виведення перукарів, які надають певну послугу
    public void filterByService(String service) {
        for (Barber barber : barbers) {
            if (Arrays.asList(barber.getServices()).contains(service)) {
                System.out.println(barber);
            }
        }
    }

    // Перевантажений метод без параметра для введення значення фільтрування
    public void filterByService() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть послугу для фільтрування: ");
        String service = scanner.nextLine();
        filterByService(service);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.createBarbersArray();

        System.out.println("Лічильник створених екземплярів класу Barber: " + Barber.getCounter());

        Barber defaultBarber = new Barber();
        Barber paramBarber = new Barber("Іванов", "Іван", "Іванович", "123456789", 5, "Чоловічі стрижка", 20.0, new String[]{"Стрижка"});
        Barber copyBarber = new Barber(paramBarber);

        System.out.println("\nІнформація про об'єкти класу Barber:");
        System.out.println(defaultBarber);
        System.out.println(paramBarber);
        System.out.println(copyBarber);

        System.out.println("\nПерукарі з досвідом роботи від 3 років:");
        main.filterByExperience();

        System.out.println("\nПерукарі відсортовані по вартості надання послуг:");
        main.sortByHourlyRate();

        System.out.println("\nПерукарі які надають послугу 'Стрижка':");
        main.filterByService();
    }
}
