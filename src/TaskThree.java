import java.util.Scanner;
import java.util.Random;

public class TaskThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            a += (b - (b = a));
        }

        int oddCount = 0;
        int evenCount = 0;
        int oddSum = 0;
        int evenSum = 0;

        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            int randomInt = random.nextInt(b - a + 1) + a;
            if (randomInt % 2 == 1) {
                oddCount++;
                oddSum += randomInt;
            } else {
                evenCount++;
                evenSum += randomInt;
            }
            System.out.println(randomInt);
        }

        System.out.println("Odd Count = " + oddCount);
        System.out.println("Even Count = " + evenCount);
        System.out.println("Sum Of Odd Numbers = " + oddSum);
        System.out.println("Sum Of Even Numbers = " + evenSum);

        int max, min;
        if (oddSum > evenSum) {
            max = oddSum;
            min = evenSum;
        } else {
            max = evenSum;
            min = oddSum;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(max - min + 1) + min);
        }

    }

}
