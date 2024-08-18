import java.util.Scanner;

public class BJ_10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 개수 N
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // 찾으려고 하는 정수 V
        int v = scanner.nextInt();

        int count = 0;
        for (int number : numbers) {
            if (number == v) {
                count++;
            }
        }

        System.out.println(count);
        
        scanner.close();
    }
}