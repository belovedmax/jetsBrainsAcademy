import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b  = scanner.nextInt();
        int c = scanner.nextInt();

        int sum1 = (a+b);
        int sum2 = (a+c);
        int sum3 = (b+c);


        if (sum1>c && sum2 > b && sum3 > a ){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}