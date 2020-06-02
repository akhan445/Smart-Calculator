import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        // write your code here

        String password = new Scanner(System.in).nextLine();

        String pattern = "\\s*(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).*\\s*";

        System.out.println(password.matches(pattern) ? "YES" : "NO");
    }
}