package ptit.edu.vn;

class SoPhuc {
    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc add(SoPhuc o) {
        return new SoPhuc(this.thuc + o.thuc, this.ao + o.ao);
    }

    public SoPhuc sub(SoPhuc o) {
        return new SoPhuc(this.thuc - o.thuc, this.ao - o.ao);
    }

    public SoPhuc mul(SoPhuc o) {
        int thuc = this.thuc * o.thuc - this.ao * o.ao;
        int ao = this.thuc * o.ao + this.ao * o.thuc;
        return new SoPhuc(thuc, ao);
    }

    public String toString() {
        if(this.ao >= 0) {
            return this.thuc + " + " + this.ao + "i";
        }
        else return this.thuc + " - " + Math.abs(this.ao) + "i";
    }
}
