package com.example.aldino.inilhounair;

/**
 * Created by Aldino on 30/11/2017.
 */

public class Informasi {

    String [] data;
    String [] informasi;

    public Informasi (){
        data = new String [] {"Pendidikan Bidan" ,"Pendidikan Dokter" ,"Pendidikan Dokter Gigi" ,"Ilmu Hukum" ,"Ekonomi Pembangunan" ,"Akutansi" ,"Manajemen" ,"Ilmu Ekonomi Isalm" ,
                "Pendidikan Apoteker" ,"Pendidikan Dokter Hewan" ,"Ilmu Hubungan Internasional" ,"Ilmu Komunikasi" ,"Ilmu Administrasi Negara" ,"Ilmu Informasi dan Perpustakaan" ,"Ilmu Politik" ,"Antropologi" ,
                "Sosiologi" ,"Statistika" , "Fisika" , "Teknobiomedik" , "Ilmu dan Teknologi Lingkungan" ,"Biologi" ,"Matematika" , "Kimia" ,"Sistem Informasi" ,"Kesehatan Masyarakat" ,"Ilmu Gizi" ,"Psikologi" ,
                "Sastra Jepang" , "Ilmu Sejarah" ,"Sastra Indonesia" ,"Sastra Inggris" , "Pendidikan Ners" , "Budidaya Perairan" , "Teknologi Industri Hasil Perikanan" ,"D3 Pengobatan Tradisional" ,"D3 Fisioterapi" ,"D3 Analis Medis" ,
                "D3 Radiologi" ,"D3 Teknik Kesehatan Gigi" ,"D3 Kesehatan Ternak" ,"D3 Otomasi Sistem Instrumentasi" ,"D3 Sistem Informasi" ,"D3 Higiene Perusahaan, K3" ,"D3 Manajemen Pemasaran" ,"D3 Manajemen Perbankan" ,
                "D3 Akutansi" ,"D3 Perpajakan" ,"D3 Manajemen Kesekretariatan dan Perkantoran" ,"D3 Manajemen Perhotelan" ,"D3 Kepariwisataan / Bina Wisata"
                ,"D3 Teknisi Perpustakaan" ,"D3 Bahasa Inggris" ,"D4 Pengobatan Tradisional " ,"D4 Fisioterapi " ,"D4 Radiologi"};

        informasi = new String [] {".....", ".....", "....."};

    }

    public int cekData(String data){
        int x = -1;
        for (int i = 0; i < data.length(); i++) {
            if (this.data[i].equals(data)){
                x = i;
            }
        }
        return x;
    }

    public String getInformasi (int i){
        return informasi[i];
    }
}
