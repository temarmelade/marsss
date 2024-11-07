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
        while (counter <= 5) {
            int fTry = scanner.nextInt();
            int sTry = scanner.nextInt();
            int tTry = scanner.nextInt();
            if ((fTry == trueAnswer1) || (fTry == trueAnswer2) || (fTry == trueAnswer3)) {
                countF = 1;
                if ((fTry == sTry) || (tTry == fTry)) {
                    countF = -1;
                }
            }
            if ((sTry == trueAnswer1) || (sTry == trueAnswer2) || (sTry == trueAnswer3)) {
                countS = 1;
                if ((tTry == sTry) || (sTry == fTry)) {
                    countS = -1;
                }
            }
            if ((tTry == trueAnswer1) || (tTry == trueAnswer2) || (tTry == trueAnswer3)) {
                countT = 1;
                if ((tTry == sTry) || (tTry == fTry)) {
                    countT = -1;
                }
            }
            check = (sTry == trueAnswer1) || (sTry == trueAnswer2) || (sTry == trueAnswer3) && (fTry == trueAnswer1) || (fTry == trueAnswer2) || (fTry == trueAnswer3) && (tTry == trueAnswer1) || (tTry == trueAnswer2) || (tTry == trueAnswer3);
            int countSum = countF + countS + countT;
            String det = (countSum == 1) ? "box" : "boxes";
            if ((countSum == -3) || (countSum == -2)) {
                System.out.println("You have found 1 box");
            }
            if (countSum == -1) {
                System.out.println("You have found 2 box");
            }
            if ((countSum < 3) && (countSum > 0)) {
                System.out.println("You have found " + countSum + " " + det);
            }
            if ((countF == 1) && (countS == 1) && (countT == 1) && (check)) {
                System.out.println("Congratulations! You have won the game!");
                break;
            }
            counter++;
        }
    }
}