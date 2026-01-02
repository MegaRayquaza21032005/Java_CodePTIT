public class HocSinh {
    private String id, name;
    double math, phys, chems;

    public HocSinh(String id, String name, double math, double phys, double chems) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.phys = phys;
        this.chems = chems;
    }

    public double getTongDiem() {
        double sum = this.math + this.phys + this.chems;
        StringBuilder sb = new StringBuilder();
        sb.append(this.id.charAt(0));
        sb.append(this.id.charAt(1));
        sb.append(this.id.charAt(2));
        String kv = sb.toString();
        // kv = this.id.substring(0, 3)
        if(kv.equals("KV1")) sum += 0.5;
        else if(kv.equals("KV2")) sum += 1.0;
        else sum += 2.5;
        return sum;
    }

    public String getStatus() {
        double sum = getTongDiem();
        if(sum < 25) return "FAIL";
        else return "PASS";
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.id.charAt(2) + " " + getTongDiem() + " " + getStatus();
    }
}
