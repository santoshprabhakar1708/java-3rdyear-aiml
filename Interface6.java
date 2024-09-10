import java.io.*;

class Income {
    float iamount;

    void get() throws IOException {
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("\nEnter the income:");
        iamount = Float.parseFloat(d.readLine());
    }
}

interface Expenditure {
    void get1() throws IOException;
}

class NetIncome extends Income implements Expenditure {
    float eamount, namount;

    public void get1() throws IOException {
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("\nEnter the expenditure:");
        eamount = Float.parseFloat(d.readLine());
    }

    void print() {
        System.out.println("\nIncome: " + iamount);
        System.out.println("\nExpenditure: " + eamount);
        System.out.println("\nNet Income: " + (iamount - eamount));
    }
}

class Interface6 {
    public static void main(String[] args) throws IOException {
        NetIncome n = new NetIncome();
        n.get();
        n.get1();
        n.print();
    }
}
