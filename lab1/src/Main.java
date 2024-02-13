import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private double m;
    private double c;
    private double b;

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    private void run() {
        inputValues();
        calculateV();
        calculateF();
        print();
        printDateTime();
    }

    private void inputValues() {
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

    private double calculateV() {
        return Math.cbrt(m * Math.tan(b) + Math.abs(c * Math.sin(b)));
    }

    private double calculateF() {
        return m * Math.cos(c) + Math.pow(c, 2);
    }

    private void print() {
        System.out.println("V="+calculateV());
        System.out.println("F="+calculateF());
        System.out.println("Введені дані:");
        System.out.println("m = " + m);
        System.out.println("c = " + c);
        System.out.println("b = " + b);
    }

    private void printDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String dateTime = dateFormat.format(new Date());
        System.out.println("Поточна дата та час: " + dateTime);
    }
}
