import java.util.Scanner;

public class Main {

    public int solution(String s) {
        String answer = "";
        for (char x : s.toCharArray())
        {
            if (Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    /*
    public int solution(String s) {
        int answer = 0;
        for (char x : s.toCharArray())
        {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }
    */

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
