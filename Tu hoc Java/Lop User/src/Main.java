import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> listUser = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i)
        {
            String username = sc.next();
            String password = sc.next();
            User user = new User(username, password);
            listUser.add(user);
        }
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= m; ++i)
        {
            String username = sc.next();
            String password = sc.next();
            for(User user : listUser)
            {
                if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    user.setCnt(user.getCnt() + 1);
                }
            }
        }
        for(User user : listUser)
        {
            System.out.print(user.getCnt() + " ");
        }
    }
}