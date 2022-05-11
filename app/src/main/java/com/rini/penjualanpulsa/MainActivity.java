package com.rini.penjualanpulsa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_username;
    EditText et_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = (EditText)  findViewById(R.id.ti_username);
        et_password = (EditText)  findViewById(R.id.ti_password);
        btn_login = (Button)  findViewById(R.id.button);

        btn_login.setOnClickListener(view -> {

            if (et_username.getText().toString().equals("admin") && et_password.getText().toString().equals("123")) {
                Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Transaksi.class);
                startActivity(intent);

            } else {
                Toast.makeText(MainActivity.this, "Username dan Password Salah!", Toast.LENGTH_SHORT).show();
            }

        });
    }

}
