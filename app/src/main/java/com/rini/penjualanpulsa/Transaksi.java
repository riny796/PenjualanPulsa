package com.rini.penjualanpulsa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Transaksi extends AppCompatActivity {

    EditText Nohp, harga;
    Spinner Namaoperator, Nominal;
    Button kirim;

    public String Nama [] = {"Xl Axiata","TELKOMSEL","SMARFREN"};
    public String Nom [] = {"5.000","10.000","15.000","20.000","25.000","50.000","100.000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);

        Nohp = findViewById(R.id.et_nohp);
        harga = findViewById(R.id.et_harga);
        Namaoperator = (Spinner)  findViewById(R.id.sp_nama);
        Nominal = (Spinner)  findViewById(R.id.sp_nominal);
        kirim = (Button)  findViewById(R.id.btn_kirim);

        ArrayAdapter adapter = new ArrayAdapter( Transaksi.this , android.R.layout.simple_spinner_dropdown_item,Nama);
        Namaoperator.setAdapter(adapter);
        ArrayAdapter adapternominal = new ArrayAdapter(Transaksi.this, android.R.layout.simple_spinner_dropdown_item,Nom);
        Nominal.setAdapter(adapternominal);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Transaksi.this, selesai.class);
                startActivity(intent);
            }
        });
    }
}