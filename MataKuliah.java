package com.mb1.pemdas.programkrs;

public class MataKuliah {
    
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public int getsks() {
        return sks;
    }

    public String getInfo() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }

}
