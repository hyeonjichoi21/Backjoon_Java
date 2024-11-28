import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// bufferReader는 엔터만 받기 때문에, 구분을 해줄거면 추가해 줘야됨
import java.util.StringTokenizer;


// 교재 풀이 
public class Day4_partSum4 {
  public static void main(String[] args) throws IOException {
    //bufferedreader는 설명에서처럼 inputstreamreader에 buffer를 추가하는 것이기 떄문에 
		//inputstreamreader를 받아와야한다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer에 토큰으로 문자열 나눠 저장해줌 
    StringTokenizer st = new StringTokenizer(br.readLine());

    // 숫자 개수 입력받기 
    int suNo = Integer.parseInt(st.nextToken());

    // 질의 개수 입력받기 <- ★★★공백 구하는 입력함수로 수정하기 
    int quizNo = Integer.parseInt(st.nextToken());


    // 합 배열 선언 및 크기 할당
    int [] S = new int[suNo + 1];
    st = new StringTokenizer(br.readLine()); // 배열 A 입력 받기 (엔터를 기점으로 끝나기 때문에, 매번 받아와야 됨) 
    for (int i = 1; i<=suNo; i++) {
      S[i] = S[i-1] + Integer.parseInt(st.nextToken());
      // S[0]값 초기화는 누가해주냐  // JAVA에서  배열의 모든 요소는 기본적으로 0으로 초기화!!!
      
    }


    for (int i=0; i<quizNo; i++) {
      st = new StringTokenizer(br.readLine()); // 각 질의 입력 받기

      // i부터
      int a = Integer.parseInt(st.nextToken());

      // j까지
      int b = Integer.parseInt(st.nextToken());

      // ★★★교재는 변수 다 생략했다. 변수를 안 쓰는 게 좋은가?? 

      System.out.println(S[b]-S[a-1]);
    }
  }
}

