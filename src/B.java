import java.util.Scanner;

public class B extends A {

    private static int y;

    private static void methodOne() {
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
    }

    private static void methodTwo() {
        System.out.println(x + y);
    }

}
