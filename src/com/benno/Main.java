package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menentukan Index dari nilai mahasiswa
     */

public class Main {

    public static void main(String[] args) {
	    Nilai nilai = new Nilai(90, 90, 90);

        System.out.println("QUIZ\t\t= " + nilai.getQuiz());
        System.out.println("UTS\t\t\t= " + nilai.getUts());
        System.out.println("UAS\t\t\t= " + nilai.getUas());
        System.out.println();
        System.out.println("Nilai Akhir = " + nilai.nilaiAkhir());
        System.out.println();
        System.out.println("Index\t\t= " + nilai.index(nilai.nilaiAkhir()));
        System.out.println("Keterangan\t= " + nilai.keterangan(nilai.index(nilai.nilaiAkhir())));
    }
}
