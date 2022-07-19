import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int sum = 0;


        for(int i =1; i<= num; i++){
            int sequence = scanner.nextInt();
            if(sequence % 6 ==0  ){
                sum +=sequence;
            }
        }
        System.out.println(sum);
    }
}