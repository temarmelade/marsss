import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countF = 0;
        int countS = 0;
        int countT = 0;
        int counter = 0;
        System.out.println("Игра началась, загаданы три числа от 1 до 7 (расположение коробок)");
        System.out.println("Введите три числа: ");
        boolean check = true;
        int trueAnswer1 = 1 + (int) (Math.random() * 6);
        int trueAnswer2 = 1 + (int) (Math.random() * 6);
        int trueAnswer3 = 1 + (int) (Math.random() * 6);
        while ((trueAnswer1 == trueAnswer2) || (trueAnswer2 == trueAnswer3) || (trueAnswer1 == trueAnswer3)) {
            trueAnswer1 = 1 + (int) (Math.random() * 6);
            trueAnswer2 = 1 + (int) (Math.random() * 6);
            trueAnswer3 = 1 + (int) (Math.random() * 6);
        }
    }
}