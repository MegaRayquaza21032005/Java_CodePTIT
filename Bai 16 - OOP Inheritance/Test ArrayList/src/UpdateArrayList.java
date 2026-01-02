import java.util.ArrayList;

public class UpdateArrayList {
    private ArrayList<Integer> num = new ArrayList<>();

    public UpdateArrayList(ArrayList<Integer> num) {
        this.num = num;
    }

    public ArrayList<Integer> getNum() {
        return num;
    }

    public void add() {
        for(int i = 1; i <= 5; ++i) {
            this.num.add(i);
        }
    }
}
