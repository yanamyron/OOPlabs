import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок тексту:");
        String inputText = scanner.nextLine();

        StringProcessor stringProcessor = new StringProcessor(inputText);

        System.out.println("Результат обробки:");
        System.out.println(stringProcessor.getResultText());

        System.out.println("Вихідний рядок:");
        System.out.println(stringProcessor.getInputText());

        }
}
