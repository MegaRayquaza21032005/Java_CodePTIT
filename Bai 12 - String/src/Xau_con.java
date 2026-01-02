public class Xau_con {
    public static void main(String[] args) {
        String name = "Le Yen Nhi";
        String ten = "Nhi";

        // Contains(): kiểm tra xâu con
        System.out.println(name.contains(ten));

        // Replace(oldChar, newChar): thay thế kí tự
        String name1 = name.replace('e', '@');
        System.out.println(name1);

        String name2 = name.replace(name.charAt(1), '$');
        System.out.println(name2);
    }
}
