package com.example.w3rk.harrimargono_1202151230_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class takeAway extends AppCompatActivity {

    Button b;
    EditText et_nama;
    EditText et_telepon;
    EditText et_alamat;
    EditText et_catatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        showw2();

    }

    private void showw2 () {
        b = (Button) findViewById(R.id.btn_pilihpesanan);
        et_nama = (EditText) findViewById(R.id.editText_nama);
        et_telepon = (EditText) findViewById(R.id.editText_telepon);
        et_alamat = (EditText) findViewById(R.id.editText_alamat);
        et_catatan = (EditText) findViewById(R.id.editText_catatan);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaText = et_nama.getText().toString();
                String teleponText = et_telepon.getText().toString();
                String alamatText = et_alamat.getText().toString();
                String catatanText = et_catatan.getText().toString();

                Toast.makeText(takeAway.this, "Nama : " + namaText +" , Tlp : " + teleponText + ", Alamat : " + alamatText + ", Catatan : " + catatanText, Toast.LENGTH_LONG).show();
            }
        });
    }


}
