import java.io.*;
import pkg.arith;

public class Complex {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException {
        int rp,ip;
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter real part and imaginary part of 1st complex number");
        rp=Integer.parseInt(in.readLine());
        ip=Integer.parseInt(in.readLine());
        arith a=new arith(rp,ip);
        System.out.println("Enter real part and imaginary part of 2nd complex number");
        rp=Integer.parseInt(in.readLine());
        ip=Integer.parseInt(in.readLine());
        arith b=new arith(rp,ip);
        arith c=new arith();
        c.add(a,b);
        System.out.println("Sum of 1st and 2nd complex number is "+c.rp+"+("+c.ip+"i)");
        arith d=new arith();
        d.sub(a,b);
        System.out.println("Difference of 1st and 2nd complex number is "+d.rp+"+("+d.ip+"i)");
    }
}
