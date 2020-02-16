import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Задание 1"); guessTheNamber();
    }


    public static void guessTheNamber() {
        int x = 1;
        do {
            int answer = rand.nextInt(10);
            for (int i = 1; i <= 3; i++) {
                System.out.println("Угадайте число от 0 до 9: ");
                int userAnswer = sc.nextInt();
                if (userAnswer == answer) {
                    System.out.println("Поздравляю, вы угадали!");
                    break;
                } else if (userAnswer > answer) {
                    System.out.println("Вы ввели слишком большое число.");
                } else if (userAnswer < answer) {
                    System.out.println("Вы ввели слишком маленькое число.");
                }
                if (i == 3) {
                    System.out.println("Вы проиграли!");
                }
            }
            System.out.println("Попробовать еще раз? 1-да - 0-нет.");
            int answer1 = sc.nextInt();
            x = answer1;
        } while (x == 1);
        System.out.println("До встречи!");
    }
}