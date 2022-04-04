package com.rplbo.utsnota;

import java.util.Locale;

public class Operator {
    private String operatorString;
    private String operatorSimbol;

    public Operator(String operatorString){
        this.operatorString = operatorString;
        operatorString.toLowerCase(Locale.ROOT);
    }

    public String getOperatorSimbol() {
        if (operatorString.toLowerCase(Locale.ROOT) == "tambah"){
            operatorSimbol = "+";
        }
        if (operatorString.toLowerCase(Locale.ROOT) == "kurang") {
            operatorSimbol = "-";
        }
        if (operatorString.toLowerCase(Locale.ROOT) == "kali") {
            operatorSimbol = "*";
        }
        if (operatorString.toLowerCase(Locale.ROOT) == "bagi") {
            operatorSimbol = "/";
        }
        if (operatorString.toLowerCase(Locale.ROOT) == "pangkat") {
            operatorSimbol = "**";
        }
        return operatorSimbol;
    }
}
