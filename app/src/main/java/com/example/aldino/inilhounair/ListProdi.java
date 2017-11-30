package com.example.aldino.inilhounair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class ListProdi extends AppCompatActivity implements SearchView.OnQueryTextListener {

    ListView lv;
    SearchView searchView;
    ArrayAdapter<String> adapter;
    String[] data = {" Pendidikan Bidan" ,"Pendidikan Dokter" ,"Pendidikan Dokter Gigi" ,"Ilmu Hukum" ,"Ekonomi Pembangunan" ,"Akutansi" ,"Manajemen" ,"Ilmu Ekonomi Isalm" ,
            "Pendidikan Apoteker" ,"Pendidikan Dokter Hewan" ,"Ilmu Hubungan Internasional" ,"Ilmu Komunikasi" ,"Ilmu Administrasi Negara" ,"Ilmu Informasi dan Perpustakaan" ,"Ilmu Politik" ,"Antropologi" ,
            "Sosiologi" ,"Statistika" , "Fisika" , "Teknobiomedik" , "Ilmu dan Teknologi Lingkungan" ,"Biologi" ,"Matematika" , "Kimia" ,"Sistem Informasi" ,"Kesehatan Masyarakat" ,"Ilmu Gizi" ,"Psikologi" ,
            "Sastra Jepang" , "Ilmu Sejarah" ,"Sastra Indonesia" ,"Sastra Inggris" , "Pendidikan Ners" , "Budidaya Perairan" , "Teknologi Industri Hasil Perikanan" ,"D3 Pengobatan Tradisional" ,"D3 Fisioterapi" ,"D3 Analis Medis" ,
            "D3 Radiologi" ,"D3 Teknik Kesehatan Gigi" ,"D3 Kesehatan Ternak" ,"D3 Otomasi Sistem Instrumentasi" ,"D3 Sistem Informasi" ,"D3 Higiene Perusahaan, K3" ,"D3 Manajemen Pemasaran" ,"D3 Manajemen Perbankan" ,
            "D3 Akutansi" ,"D3 Perpajakan" ,"D3 Manajemen Kesekretariatan dan Perkantoran" ,"D3 Manajemen Perhotelan" ,"D3 Kepariwisataan / Bina Wisata" ,"D3 Teknisi Perpustakaan" ,"D3 Bahasa Inggris" ,"D4 Pengobatan Tradisional " ,"D4 Fisioterapi " ,"D4 Radiologi" ,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_prodi);

        lv = (ListView) findViewById(R.id.listProdi);
        searchView = (SearchView) findViewById(R.id.searchProdi);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);
        searchView.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.getFilter().filter(newText);
        return false;
    }
}
