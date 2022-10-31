import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        for (char c : str.toCharArray())
        {
            if (Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);

            /*
            if (c >= 97 && c <= 122) answer += (char) (c - 32);
            else answer += (char) (c + 32);
            */
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
