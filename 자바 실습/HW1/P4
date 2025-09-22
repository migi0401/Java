import java.util.Scanner;

public class four {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("자동차 상태 입력>>");
            int condition=sc.nextInt();

            int temperature=condition%32; //0-5 비트
            int aircon = condition & 0b0100_0000; //원하는 비트 자리에 1 작성
            int run = condition & 0b1000_0000; //&와 status로 구하고 4자리씩 끊기

            System.out.print("자동차는 ");
            if(run == 0){
                System.out.print("정지 상태이고 ");
            }
            else{
                System.out.print("달리는 상태이고 ");
            }

            if(aircon == 0){
                System.out.print("에어컨이 꺼진 상태이고 ");
            }
            else{
                System.out.print("에어컨이 켜진 상태이고 ");
            }

            System.out.println("온도는 "+temperature+"도이다.");

            sc.close();
            //수정본
        }
}
