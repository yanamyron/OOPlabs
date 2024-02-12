import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    private static double m;
    private static double c;
    private static double b;

    public static void main(String[] args) {
        run();
    }
    private static void run() {
        inputValues();
        calculateV();
        calculateF();
        print();
        printDateTime();
    }
    private static void inputValues() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введіть значення m: ");
            m = scanner.nextDouble();
            System.out.print("Введіть значення c: ");
            c = scanner.nextDouble();
            System.out.print("Введіть значення b: ");
            b = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Неправильні дані. Введіть дійсні числові значення");
            System.exit(1);
        } finally {
            scanner.close();
        }
    }
    private static void calculateV() {
        double V = Math.cbrt(m*Math.tan(b)+Math.abs(c*Math.sin(b)));
        System.out.println("V = " + V);
    }
    private static void calculateF() {
        double F = m * Math.cos(c) + Math.pow(c, 2);
        System.out.println("F = " + F);
    }
    private static void print() {
        System.out.println("Введені дані:");
        System.out.println("m = " + m);
        System.out.println("c = " + c);
        System.out.println("b = " + b);
    }
    private static void printDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String dateTime = dateFormat.format(new Date());
        System.out.println("Поточна дата та час: " + dateTime);
    }
}
