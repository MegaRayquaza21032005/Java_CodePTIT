import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            a.add(sc.nextInt());
        }
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; ++i) {
            if(st.empty()) {
                st.push(a.get(i));
            }
            else {
                int x = st.peek();
                if ((x + a.get(i)) % 2 == 0) {
                    st.pop();
                }
                else st.push(a.get(i));
            }
        }
        a.clear();
        while(!st.empty()) {
            a.add(st.pop());
        }
        System.out.println(a.size());
    }
}