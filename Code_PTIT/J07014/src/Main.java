import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

//class WordSet {
//    private TreeSet<String> se = new TreeSet<>();
//
//    public WordSet(String s) throws IOException {
//        Scanner sc = new Scanner(new FileInputStream(s));
//        TreeSet<String> se = new TreeSet<>();
//        while(sc.hasNext()) {
//            se.add(sc.next().toLowerCase());
//        }
//        this.se = se;
//    }
//
//    public TreeSet<String> getSe() {
//        return se;
//    }
//
//    public String union(WordSet o) {
//        TreeSet<String> Union = new TreeSet<>(this.se);
//        Union.addAll(o.se);
//        StringBuilder sb = new StringBuilder();
//        for(String word : Union) sb.append(word).append(" ");
//        return sb.toString().trim();
//    }
//
//    public String intersection(WordSet o) {
//        TreeSet<String> Inter = new TreeSet<>(this.se);
//        Inter.retainAll(o.se);
//        StringBuilder sb = new StringBuilder();
//        for(String word : Inter) sb.append(word).append(" ");
//        return sb.toString().trim();
//    }
//}

public class Main {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}