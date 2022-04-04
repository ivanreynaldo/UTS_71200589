package com.uts.prakrplbo;

import java.util.List;

public class Keranjang {
    private List<Buah> daftarBuah;

    public void tambahProduk(Buah buah){
        /*daftarBuah.add(buah);*/
        System.out.println(buah+" berhasil ditambahkan ke dalam keranjang!");
    }
    public void hapusProduk(Buah buah){
        //daftarBuah.add(buah);//
        System.out.println(buah+" berhasil dikeluarkan dari dalam keranjang!");
        /*if (daftarBuah.isEmpty()){
            System.out.println(buah+" sudah tidak ada di dalam keranjang!");
        }*/
    }
    public void getKeranjang(){

    }
}
