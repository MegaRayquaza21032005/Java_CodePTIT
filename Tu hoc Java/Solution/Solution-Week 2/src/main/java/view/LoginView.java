package view;

import model.User;
import service.UserService;
import java.util.Scanner;

public class LoginView implements IBaseView{
    private final UserService userService;

    private final Scanner scanner;

    public LoginView() {
        userService = new UserService();
        scanner = new Scanner(System.in);
    }

    public void show(){
        while (true) {
            System.out.println("Nhập username: ");
            String username = scanner.nextLine();
            System.out.println("Nhập mật khẩu: ");
            String password = scanner.nextLine();
            User user = new User(username, password);
            boolean ok = userService.checkLogin(user);
            if(ok){
                MenuView menuView = new MenuView();
                menuView.show();
                break;
            }
            else{
                System.out.println("Sai thông tin!");
            }
        }
    }

    @Override
    public void dispose() {

    }
}
