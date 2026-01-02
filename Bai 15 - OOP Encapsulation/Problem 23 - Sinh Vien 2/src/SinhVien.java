public class SinhVien {
    String id, name, birth, className;
    double gpa;

    public SinhVien(int id, String name, String birth, String className, double gpa) {
        this.id = "SV" + String.format("%03d", id);
        this.name = name;
        this.birth = birth;
        this.className = className;
        this.gpa = gpa;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getBirth() {
        return this.birth;
    }
    public String getClassName() {
        return this.className;
    }
    public double getGpa() {
        return this.gpa;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void chuanHoaName() {
        String[] arr = this.name.split("\\s+");
        String newName = "";
        for(String x : arr)
        {
            newName += Character.toUpperCase((x.charAt(0)));
            for(int j = 1; j < x.length(); ++j) {
                newName += Character.toLowerCase(x.charAt(j));
            }
            newName += " ";
        }
        this.name = newName.trim();
    }

    public void chuanHoaBirth() {
        StringBuilder sb = new StringBuilder(this.birth);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3,  '0');
        while(sb.length() < 10) sb.insert(6, '0');
        this.name = sb.toString();
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.birth + " " + String.format("%.2f", this.gpa);
    }
}
