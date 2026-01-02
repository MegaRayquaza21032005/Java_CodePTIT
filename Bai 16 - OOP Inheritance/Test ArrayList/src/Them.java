import java.util.ArrayList;

public class Them {
    private ArrayList<Integer> num = new ArrayList<>();

    public Them(ArrayList<Integer> num) {
        this.num = num;
    }

    public ArrayList<Integer> getNum() {
        return this.num;
    }

    public void themPhanTu() {
        for(int i = 6; i <= 10; ++i) {
            this.num.add(i);
        }
    }
}
