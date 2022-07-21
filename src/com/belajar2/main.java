//PELAJARAN 2 MEMAHAI VARIABEL
//===========================

package com.belajar2;

public class main {
    public static void main(String[] args){

        System.out.println("===========================================");
        System.out.println("MEMAHAI VARIABEL, DEKLARASI, DAN ASSIGNMENT");
        System.out.println("===========================================");

        //---------------------------------------------------------------------------------------

        // 1. VARIABEL adalah suatu tempat untuk menyimpan data. Data dapat berupa nilai tertentu.

        //---------------------------------------------------------------------------------------

        // 2. cara menulis variabel dengan deklarasi
        // deklarasi yaitu cara menetapkan tipe data dan nama variabel tanpa memberi nilai.
        // tipe data adalah suatu bentuk deklarasi tipe dari wadah data.
        // nilai dapat berupa data angka, kata/kalimat(string), karakter(char) dan lain-lain.

        // tipe-data nama_variabel;

        // contoh:
        int nilai_sekolah;
        int data_a;
        int data_b;

        // dalam variabel ini tidak dapat ditampilkan(error), karena masih kosong.
        // System.out.println("nilai_sekolah = " + nilai_sekolah );
        // System.out.println("data_a = " + data_a );
        // System.out.println("data_b = " + data_b );
        // untuk mengetahui hasil, hapus komentar di atas dan jalankan.

        //peneteuan nilai:
        nilai_sekolah = 98;
        data_a = 12;
        data_b = 41;

        // sekarang data variabel dapat ditampilkan, karena sudah memiliki nilai.
        // hasil:
        System.out.println("nilai_sekolah = " + nilai_sekolah );
        System.out.println("data_a = " + data_a );
        System.out.println("data_b = " + data_b );

        // ------------------------------------------------------------------------------------

        // 3. cara menulis variabel denga metode Assignment

        // tipe-data nama_variabel = nilai;

        // tipe data adalah suatu bentuk deklarasi tipe dari wadah data.
        // nilai dapat berupa data angka, kata/kalimat(string), karakter(char) dan lain-lain.

        // contoh:
        int a = 10; // ini adalah cara menulis dengan metode 'Assignment'
        int b = 8;  // karena setelah menetapkan tipe data langsung diberikan nilai.
        int c = 5;

        // ------------------------------------------------------------------------------------

        // 4. cara menampilkan variabel ke dalam konsol
        // sebelumnya ini telah kita gunakan pada point 1.
        //                          v----------- variabel
        System.out.println("a = " + a );
        System.out.println("b = " + b );
        System.out.println("c = " + c );

        // ------------------------------------------------------------------------------------

        // 5. cara merubah nilai variabel
        // sebelumnya ini telah kita gunakan pada point 1.
        a = 11;
        b = 9;
        c = 6;

        //hasil:
        System.out.println("a baru = " + a );
        System.out.println("b baru = " + b );
        System.out.println("c baru = " + c );

        // SEKIAN SELAMAT BELAJALAR...........

    }
}
