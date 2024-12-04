package pkg;

public class arith {
    public int rp,ip;
    public arith() {
        rp=0;
        ip=0;
    }
    public arith(int r,int i) {
        rp=r;
        ip=i;
    }
    public void add(arith a1, arith a2) {
        rp=a1.rp+a2.rp;
        ip=a1.ip+a2.ip;
    }
    public void sub(arith a1, arith a2) {
        rp=a1.rp-a2.rp;
        ip=a1.ip-a2.ip;
    }
}

