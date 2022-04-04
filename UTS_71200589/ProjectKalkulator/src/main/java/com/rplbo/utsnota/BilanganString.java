package com.rplbo.utsnota;

import java.util.Locale;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String bilanganstring){
        this.bilanganstring = bilanganstring;
    }

    public int getBilangan(){
        if (bilanganstring.toLowerCase() == "satu"){
            bilangan = 1;
        }
        if (bilanganstring.toLowerCase() == "dua"){
            bilangan = 2;
        }
        if (bilanganstring.toLowerCase() == "tiga"){
            bilangan = 3;
        }
        if (bilanganstring.toLowerCase() == "empat"){
            bilangan = 4;
        }
        if (bilanganstring.toLowerCase() == "lima"){
            bilangan = 5;
        }
        if (bilanganstring.toLowerCase() == "enam"){
            bilangan = 6;
        }
        if (bilanganstring.toLowerCase() == "tujuh"){
            bilangan = 7;
        }
        if (bilanganstring.toLowerCase() == "delapan"){
            bilangan = 8;
        }
        if (bilanganstring.toLowerCase() == "sembilan"){
            bilangan = 9;
        }
        if (bilanganstring.toLowerCase() == "sepuluh"){
            bilangan = 10;
        }
        if (bilanganstring.toLowerCase() == "sebelas"){
            bilangan = 11;
        }
        if (bilanganstring.toLowerCase() == "dua belas"){
            bilangan = 12;
        }
        if (bilanganstring.toLowerCase() == "tiga belas"){
            bilangan = 13;
        }
        if (bilanganstring.toLowerCase() == "empat belas"){
            bilangan = 14;
        }
        if (bilanganstring.toLowerCase() == "lima belas"){
            bilangan = 15;
        }
        if (bilanganstring.toLowerCase() == "enam belas"){
            bilangan = 16;
        }
        if (bilanganstring.toLowerCase() == "tujuh belas"){
            bilangan = 17;
        }
        if (bilanganstring.toLowerCase() == "delapan belas"){
            bilangan = 18;
        }
        if (bilanganstring.toLowerCase() == "sembilan belas"){
            bilangan = 19;
        }
        if (bilanganstring.toLowerCase() == "dua puluh"){
            bilangan = 20;
        }
        return bilangan;
    }

    public boolean apakahDuaDigit(){
        if (getBilangan() >9){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean apakahLebihDari10(){
        if (getBilangan() > 10){
            return true;
        }
        else {
            return false;
        }
    }
}
