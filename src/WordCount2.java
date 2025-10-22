
import java.util.Scanner;

public class WordCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String sentence = sc.nextLine();
            if(sentence.equals("그만")){
                System.out.println("종료합니다...");
                break;
            }
            String[] words = sentence.split(" ");
            System.out.println("어절 개수는 "+words.length);
        }
        sc.close();
    }
}