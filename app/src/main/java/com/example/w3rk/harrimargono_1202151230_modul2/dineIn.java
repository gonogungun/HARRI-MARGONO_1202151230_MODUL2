package com.example.w3rk.harrimargono_1202151230_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class dineIn extends AppCompatActivity  {


    Button b;
    Spinner sp;
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        showw();

    }


        private void showw () {
            b = (Button) findViewById(R.id.btn_pesan);
            sp = (Spinner) findViewById(R.id.nomormeja);
            et = (EditText) findViewById(R.id.namaText);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nomormeja = sp.getSelectedItem().toString();
                    String namaText = et.getText().toString();
                    Toast.makeText(dineIn.this, "Anda :" + namaText +" telah memilih : "+ nomormeja , Toast.LENGTH_LONG).show();
                }
            });
        }

    }




