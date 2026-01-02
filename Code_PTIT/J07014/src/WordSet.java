import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> se = new TreeSet<>();

    public WordSet(String s) throws IOException {
        Scanner sc = new Scanner(new FileInputStream(s));
        while(sc.hasNext()) {
            this.se.add(sc.next().toLowerCase());
        }
    }

    public TreeSet<String> getSe() {
        return se;
    }

    public String union(WordSet o) {
        TreeSet<String> Union = new TreeSet<>(this.se);
        Union.addAll(o.se);
        StringBuilder sb = new StringBuilder();
        for(String word : Union) sb.append(word).append(" ");
        return sb.toString().trim();
    }

    public String intersection(WordSet o) {
        TreeSet<String> Inter = new TreeSet<>(this.se);
        Inter.retainAll(o.se);
        StringBuilder sb = new StringBuilder();
        for(String word : Inter) sb.append(word).append(" ");
        return sb.toString().trim();
    }
}
