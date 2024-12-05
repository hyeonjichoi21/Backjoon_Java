import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// bufferReader는 엔터만 받기 때문에, 구분을 해줄거면 추가해 줘야됨
import java.util.StringTokenizer;


public class Day5_partSum22 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // 공백으로 구분하니까 StringTokenizer도 사용해야 함
      StringTokenizer st = new StringTokenizer(br.readLine());

      // 배열 크기 n 입력받기 (n x n)
      int n = Integer.parseInt(st.nextToken());
      // 크기가 n인 배열 N 선언
      int [][] N = new int[n][n];

      // 질의 개수 quizNo 입력받기
      int quizNo = Integer.parseInt(st.nextToken());

      // 나중에 확장 for문 도전해봐라
      // 배열 N 값 입력 받음

      for (int i=0; i<n; i++){
          for (int j=0; j<n; j++){
              st = new StringTokenizer(br.readLine());
              N [i][j] = Integer.parseInt(st.nextToken());
          } 
      }

    
      // 합을 구해야 할 범위  x1, y1, x2, y2 입력받음
      for (int i=0; i<quizNo; i++){
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        int sum = 0;

        // 삼중 for 문 이게 최선이냐 <- 이거 아닌듯 
        for(int j = y1-1; j<=y2-1; j++){
          for (int k = x1-1; k<=x2-1; k++){
            sum += N [j][k];
          }
        }
        System.out.println(sum);
      } 
    }
}