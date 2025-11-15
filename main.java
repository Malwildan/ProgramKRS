package com.mb1.pemdas.programkrs;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();

        Mahasiswa mhs = new Mahasiswa(nim, nama);
        KRS krs = new KRS(mhs);

        while(true){
            System.out.print("Masukkan Kode Mata Kuliah: ");
            String kode = scan.nextLine();
            System.out.print("Masukkan Nama Mata Kuliah: ");
            String namaMK = scan.nextLine();
            System.out.print("Masukkan SKS Mata Kuliah: ");
            int sks = Integer.parseInt(scan.nextLine());

            MataKuliah mk = new MataKuliah(kode, namaMK, sks);
            boolean berhasil = krs.tambahMataKuliah(mk);

            if(berhasil){
                System.out.println("Mata Kuliah berhasil ditambahkan.");
            } else {
                System.out.println("Gagal menambahkan Mata Kuliah. Melebihi batas SKS.");
            }

            System.out.println("Apakah Anda ingin menambahkan mata kuliah lagi? (y/n): ");
            String lagi = scan.nextLine();
            if(lagi.equalsIgnoreCase("n")){
                krs.cetakKRS();
                break;
            }
        }
    }
    
}
