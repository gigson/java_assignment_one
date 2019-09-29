import java.util.Scanner;

public class A {

    public static int x;

    public A() {
        System.out.println("Hello");
    }

    private static void methodOne() {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
    }

    private static void methodTwo() {
        System.out.println(x + 12);
    }

    private static void methodThree() {
        System.out.println(x % 2 == 1 ? "Odd" : "Even");
    }

}
