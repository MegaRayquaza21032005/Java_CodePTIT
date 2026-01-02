package view;

import common.AppContext;
import model.Role;
import service.ProductService;

import java.util.Scanner;

public class MenuView implements IBaseView {

    private final ProductService productService;

    private final Scanner scanner;

    public MenuView() {
        productService = new ProductService();
        scanner = new Scanner(System.in);
    }

    @Override
    public void show() {
        Role role = AppContext.getUser().getRole();
        if(role == Role.ADMIN) {
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa sách");
            System.out.println("3. Xóa sách");
        }
        System.out.println("4. Tìm kiếm sách");
        System.out.println("5. Xem danh sách sách");
        System.out.println("6. Đăng xuất");
        int option = scanner.nextInt();
        switch (option) {
            case 1:

        }
    }

    @Override
    public void dispose() {

    }

}