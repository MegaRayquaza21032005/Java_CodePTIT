public class SinhVien {
    private String id, name, lop, birth;
    private float gpa;

    SinhVien(){}
    SinhVien(String id, String name, String lop, String birth, float gpa)
    {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }

    public void chuanhoa()
    {
        StringBuilder sb = new StringBuilder(birth);
        if(sb.charAt(1) == '/')
        {
            sb.insert(0, '0');
        }
        if(sb.charAt(4) == '/')
        {
            sb.insert(3, 0);
        }
        this.birth = sb.toString();
    }
    public void info()
    {
        System.out.println(this.id + ' ' + this.name + " " + this.lop + " " + this.birth + " " + this.gpa);
    }
}
