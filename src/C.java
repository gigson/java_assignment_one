import java.util.Scanner;

public class C {

    private static Integer a, b, c;

    private static long methodFiveValue; // meh

    private static void methodOne() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    private static int methodTwo() {
        return a % 10;
    }

    private static int methodThree() {
        return b.toString().charAt(0) - '0';
    }

    private static int methodFour() {
        int sum = 0, temp = c;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    private static void methodFive() {
        long product = methodTwo() * methodThree();
        methodFiveValue = product;
        System.out.println(product);
    }

    private static void methodSix() {
        System.out.println(methodFiveValue + methodThree());
    }

}
