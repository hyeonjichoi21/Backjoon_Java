import java.util.Arrays;
import java.util.Scanner;

public class BJ_10818 {
	public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] arrays = new int[N];
        
		for (int i = 0; i < N; i++) {
			arrays[i] = scanner.nextInt();
		}
        
		/// 오름차순 정렬, n-1
		Arrays.sort(arrays);
		System.out.println(arrays[0] + " " + arrays[N - 1]);
        
        scanner.close();
	}
}