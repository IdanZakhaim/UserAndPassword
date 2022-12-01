import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkUserAndPassword());
    }
    public static String checkUserAndPassword() {
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;
        boolean confirmPassword=false;
        do {
            System.out.println("User name :");
            userName = scanner.nextLine();
        } while (userName.contains("*"));
        do {
            System.out.println("Password :");
            password = scanner.nextLine();
            for (int i = 0; i < password.length(); i++) {
                if (password.length() > 7 && password.length() < 11) {
                    if (!Character.isDigit(password.charAt(i)) || (password.contains("%") || password.contains("$") || !password.contains("_"))){
                        if (!userName.equals(password))
                            confirmPassword=true;
                    }
                }
            }
        } while (!confirmPassword);
        return userName + "\n" + password;
    }
}