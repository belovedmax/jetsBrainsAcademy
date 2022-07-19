import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int s = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum++;
                s += i;
                //System.out.println(s);
            }
        }
        double average = (double) s / sum;
        System.out.println(average);
    }

}
