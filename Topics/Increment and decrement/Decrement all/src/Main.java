import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        --num;
        int num1 = scanner.nextInt();
        --num1;
        int num2 = scanner.nextInt();
        --num2;
        int num3 = scanner.nextInt();
        --num3;

        System.out.printf("%d %d %d %d",num,num1, num2, num3);
    }
}
