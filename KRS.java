package com.mb1.pemdas.programkrs;

import java.util.ArrayList;

public class KRS {

    private Mahasiswa mahasiswa;
    private ArrayList<MataKuliah> listMK;
    private final int MAX_SKS = 24;
    private int totalSks = 0;

    public KRS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.listMK = new ArrayList<>();
    }

    public boolean tambahMataKuliah(MataKuliah mk) {
        if (totalSks + mk.getsks() <= MAX_SKS) {
            listMK.add(mk);
            totalSks += mk.getsks();
            return true;
        } else {
            return false;
        }
    }

     public void cetakKRS() {
        System.out.println("\n==================== KARTU RENCANA STUDI ====================");
        System.out.println("NIM   : " + mahasiswa.getNim());
        System.out.println("Nama  : " + mahasiswa.getNama());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Daftar Mata Kuliah :");

        for (MataKuliah mk : listMK) {
            System.out.println("- " + mk.getInfo());
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Total SKS: " + totalSks);
        System.out.println("\nTTD KPS:");
        System.out.println("Dr. Tri Astoto, S.Kom");
        System.out.println("=============================================================");
    }

}
