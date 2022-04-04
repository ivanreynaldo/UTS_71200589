package com.rplbo.utsnota;

public class Kalkulator{
    private int bil2;
    private int bil1;
    private String op;

    public Kalkulator(BilanganString a,BilanganString b,Operator c){
        bil1 = a.getBilangan();
        bil2 = b.getBilangan();
        op = c.getOperatorSimbol();

    }
    public void hitung(){
        int hasil;
        if (op == "+"){
            hasil = bil1 + bil2;
        }
        if (op == "-"){
            hasil = bil1 - bil2;
        }
        if (op == "*"){
            hasil = bil1 * bil2;
        }
        if (op == "/"){
            hasil = bil1 / bil2;
        }
        else {
            hasil = bil1^bil2;
        }
        System.out.println("Hasil: "+hasil);
    }
}
