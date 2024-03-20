import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private Person[] persons = new Person[7];

    public void createPersonsArray() {
        persons[0] = new Barber("Кривий", "Тимофій", "Григоровия", "123456789",
                5, "Чоловічі стрижка", 20.0, new String[]{"Стрижка", "Бриття"});
        persons[1] = new Barber("Скрипка", "Ігор", "Андрійович", "123494260",
                2, "Дитячі стрижки", 18.0, new String[]{"Стрижка"});
        persons[2] = new Student(1, "Петров", "Іван", "Олександрович", "вул. Головна, 10", "123456789", "Фізика", 3, "ФЗ-31");
        persons[3] = new Student(2, "Сидорова", "Марія", "Петрівна", "вул. Центральна, 15", "987654321", "Історія", 2, "ІС-22");
        persons[4] = new Student(3, "Іванов", "Олег", "Ігорович", "вул. Перша, 5", "555444333", "Математика", 4, "МТ-41");
        persons[5] = new Student(4, "Бондаренко", "Анна", "Михайлівна", "вул. Шевченка, 20", "111222333", "Фізіологія", 1, "ФІ-11");
        persons[6] = new Student(5, "Дорошенко", "Василь", "Петрович", "вул. Соборна, 7", "444555666", "Хімія", 3, "ХІ-31");
    }
    public void displayAllPersons() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
    public void filterByExperience(int minExperience) {
        for (Person person : persons) {
            if (person instanceof Barber) {
                Barber barber = (Barber) person;
                if (barber.getExperience() >= minExperience) {
                    System.out.println(barber);
                }
            }
        }
    }

    public void filterByExperience() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть мінімальний стаж роботи для фільтрування: ");
        int minExperience = scanner.nextInt();
        filterByExperience(minExperience);
    }

    public void sortByHourlyRate() {
        Arrays.sort(persons, (p1, p2) -> {
            if (p1 instanceof Barber && p2 instanceof Barber) {
                Barber b1 = (Barber) p1;
                Barber b2 = (Barber) p2;
                return Double.compare(b1.getHourlyRate(), b2.getHourlyRate());
            }
            return 0;
        });
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void filterByService(String service) {
        for (Person person : persons) {
            if (person instanceof Barber) {
                Barber barber = (Barber) person;
                if (Arrays.asList(barber.getServices()).contains(service)) {
                    System.out.println(barber);
                }
            }
        }
    }

    public void filterByService() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть послугу для фільтрування: ");
        String service = scanner.nextLine();
        filterByService(service);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.createPersonsArray();

        System.out.println("Інформація про створені екземпляри:");

        main.displayAllPersons();

        System.out.println("\nПерукарі з досвідом роботи від 3 років:");
        main.filterByExperience();

        System.out.println("\nПерукарі відсортовані по вартості надання послуг:");
        main.sortByHourlyRate();

        System.out.println("\nПерукарі які надають послугу 'Стрижка':");
        main.filterByService();


        Student student1 = new Student(1, "Петров", "Іван", "Олександрович", "вул. Головна, 10", "123456789", "Фізика", 3, "ФЗ-31");
        Student student2 = new Student(2, "Сидорова", "Марія", "Петрівна", "вул. Центральна, 15", "987654321", "Історія", 2, "ІС-22");
        Student student3 = new Student(3, "Іванов", "Олег", "Ігорович", "вул. Перша, 5", "555444333", "Математика", 4, "МТ-41");


        System.out.println("\nДеталі про студентів:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
