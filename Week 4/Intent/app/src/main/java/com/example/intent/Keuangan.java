package com.example.intent;

import java.io.Serializable;
import java.util.Date;

public class Keuangan implements Serializable {
    private double jumlah;
    private String jenis;
    private Date tanggal;

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Keuangan(){

    }

    public Keuangan(double jumlah, String jenis, Date tanggal){
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }
}
