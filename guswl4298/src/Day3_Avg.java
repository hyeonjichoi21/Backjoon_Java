import java.util.Scanner;

public class Day3_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 n에 과목의 수 입력 받기
        int n = sc.nextInt();
        // 길이가 n인 1차원 배열 avg[] 선언하기
        // 선언 및 크기까지 할당하려면 new int~로 해줘야 함
        int[] avg = new int[n];
        
        for (int i=0; i<avg.length; i++){
            avg[i] = sc.nextInt();
        }
        // 합계, 최댓값 구하는 변수 선언 및 초기화 (안전하게 long으로 해야되냐?)
        int sum=0, max=0;
        for (int a: avg) {
            if(max < a)
                max = a;
            sum += a;
        }
        
        // System.out.print((float)sum*100/max/n); <- 방법1: 형변환 
        System.out.print(sum*100.0/max/n); // 방법2: 처음부터 실수 넣기 
        
    }
}