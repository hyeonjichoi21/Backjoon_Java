import java.util.Scanner;

public class BJ_2743{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // 문자열 nextLine
        String word = scanner.nextLine();
        
        // 길이 length()
        int length = word.length();
        
        System.out.println(length);
        
        scanner.close();
    }
}