import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// bufferReader는 엔터만 받기 때문에, 구분을 해줄거면 추가해 줘야됨
import java.util.StringTokenizer;


// Day4_3 BufferReader 써보기 (Scanner X)
// BufferReader 속도가 엄청 빠름 
public class Day4_partSum3 {
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
    int [] S = new int[suNo];
    // 배열 선언 및 크기 할당
    int [] A = new int[suNo];
    
    st = new StringTokenizer(br.readLine()); // 배열 A 입력 받기 
    for (int i = 0; i<suNo; i++) {
      A[i] = Integer.parseInt(st.nextToken());
      if (i == 0)
        S[i] = A[i];
      else S[i] = S[i-1] + A[i]; // 합배열 생성하기
      
    }


    for (int i=0; i<quizNo; i++) {
      // ★★★ 공백구분하는 입력함수 써야되나?? -> 지금 쓰고 있음;
      st = new StringTokenizer(br.readLine()); // 각 질의 입력 받기

      // i부터
      int a = Integer.parseInt(st.nextToken());
      a--;

      // j까지
      int b = Integer.parseInt(st.nextToken());
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


// java.util.NoSuchElementException -> 입력을 읽으려 할 때 더 이상 읽을 수 있는 요소가 없을 때 발생
//      각 질의마다 새로운 StingTokenizer를 생성하여 BufferedReader로부터 새 줄을 읽어오게 함
//      이렇게 하면 각 질의의 입력이 별도로 처리되어 오류가 발생하지 않음
//      BufferedReader 닫기: br.close()를 사용하여 닫아주는 게 좋음 like sc.close();