import java.util.Scanner;


// BJ_11720
public class Day2_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // N값 입력받기 
    int n = sc.nextInt();

    // 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장하기
    // next? nextLine? 차이
    String sNum = sc.next();
    
    // sNum을 다시 char []형 변수 cNum에 변환하여 저장하기
    // String -> Char 로 쪼개는 함수 
    char [] cNum = sNum.toCharArray();

    // int형 변수 sum 선언하기
    int sum = 0;

    // for(cNum 길이만큼 반복하기)
    for(int c : cNum){
      // 배열의 각 자릿값을 정수형으로 변환하여 sum에 더하여 누적하기
      
      // Char -> Int
      // 방법1 : Character.getNumericValue(); ex) int x = Character.getNumericValue(char1);
      //sum += Character.getNumericValue(cNum[i]); // <- 배열 전체가 아닌 단일문자 받음 주의!
      
      // 방법2 : ParseInt(); ex) int n = Integer.parseInt(String.valueOf(ch));
      //sum += Integer.parseInt(String.valueOf(cNum));

      // 방법3 : 숫자 문자에 한해, - '0'을 해준다. (아스키코드 이용)
      sum += c - '0';
    }


    System.out.println(sum);

    sc.close();
  }
}
