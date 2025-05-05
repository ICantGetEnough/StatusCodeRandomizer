import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1.base or 2.test");
        String query = scanner.nextLine();

        if (query.equalsIgnoreCase("base") || query.equalsIgnoreCase("1")){
            service.base();
        } else if (query.equalsIgnoreCase("test") || query.equalsIgnoreCase("2")) {
            service.service();
        }
    }
}