import java.util.*;

public class Case_Conversion {
    public static String convert(String a) {
        String res = "";
        for(int i = 0; i < a.length(); ++i) {
            if(Character.isAlphabetic(a.charAt(i))) {
                res += Character.toUpperCase(a.charAt(i));  // Character.toLowerCase()
            }
            else res += a.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        String name = "Nguyen Thanh Dat CN136";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(Character.isDigit(name.charAt(19)));
        System.out.println(Character.isAlphabetic(name.charAt(1)));
        System.out.println(Character.isLowerCase(name.charAt(3)));
        System.out.println(Character.isUpperCase(name.charAt(7)));

        System.out.println(convert(name));
    }
}
