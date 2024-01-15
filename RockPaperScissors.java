import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가위(0), 바위(1), 보(2):");
        int user = sc.nextInt();
        Random ran = new Random();
        int computer = ran.nextInt(3);

        if (user == computer) {
            System.out.println("비김");
        } else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
            System.out.println("이김");
        } else {
            System.out.println("짐");
        }
        scanner.close();
    }
}
