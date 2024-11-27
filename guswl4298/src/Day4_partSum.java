import java.util.Scanner;

public class Day4_partSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // 숫자 개수 입력받기 
    int suNo = sc.nextInt(); 
    // 질의 개수 입력받기 <- ★★★공백 구하는 입력함수로 수정하기 
    int quizNo = sc.nextInt();
    // 합 배열 선언 및 크기 할당
    int [] S = new int[suNo];
    // 배열 선언 및 크기 할당
    int [] A = new int[suNo];
    
    for (int i = 0; i<suNo; i++) {
      A[i] = sc.nextInt();
      if (i == 0)
        S[i] = A[i];
      else S[i] = S[i-1] + A[i]; // 합배열 생성하기
      
    }

    // ★★★확장 for문으로도 써보기 


    for (int i=0; i<quizNo; i++) {
      // ★★★ 공백구분하는 입력함수 써야되나?? 
      // i부터
      int a = sc.nextInt();
      a--;

      // j까지
      int b = sc.nextInt();
      b--;

      // 구간합 변수 선언
      int partSum;
      // 구간합 출력하기
      if (a==0){
        partSum = S[b];
      }
      else {
        partSum= S[b] - S[a-1];
      }

      System.out.println(partSum);
    }
  }
}

// ★★★Index -1 out of bounds for length 5 오류에 대해 자세히 알아보기 !!