import java.util.Scanner;

public class ArthimeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int time = scanner.nextInt(); // 정수 입력

        int hour = time/3600;
        int min = time%3600/60;
        int sec = time%3600%60;
        System.out.println(time + "초는 " + hour + "시간, " + min + "분, " + sec + "초입니다."); 

        scanner.close();
    }
}