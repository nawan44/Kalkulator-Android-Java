package com.contoh.kalkulatorstring;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Kalkulatorstring1 extends AppCompatActivity {
    EditText txtKalimat, txtHasil;
    Button btnUpper, btnLower, btnJoin, btnReverse, btnCount, btnReplace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulatorstring1);

        txtKalimat = (EditText) findViewById(R.id.txtKalimat);
        txtHasil = (EditText) findViewById(R.id.txtHasil);

        Button btnUpper = (Button) findViewById(R.id.btnUpper);
        btnUpper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtKalimat.length() < 1) {
                    lengkapi("isi kalimat");
                }
                String k1 = txtKalimat.getText().toString();
                k1 = k1.toUpperCase();
                txtHasil.setText(k1);
            }
        });

        Button btnLower = (Button) findViewById(R.id.btnLower);
        btnLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtKalimat.length() < 1) {
                    lengkapi("isi kalimat");
                }
                String k1 = txtKalimat.getText().toString();
                k1 = k1.toLowerCase();
                txtHasil.setText(k1);
            }
        });



        btnJoin = (Button) findViewById(R.id.btnJoin);
        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtKalimat.length() < 1) {
                    lengkapi("isi kalimat");
                }
                String oks="hehehe";
                String k1 = txtKalimat.getText().toString();
                String gab = k1 + "ditambah kata " +oks;
                txtHasil.setText(gab);
            }
        });

        btnReverse = (Button) findViewById(R.id.btnReverse);
        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtKalimat.length() < 1) {
                    lengkapi("isi kalimat");
                }
                String k1 = txtKalimat.getText().toString();
                int p = k1.length(); //menghitung karakter
                char[] arr = k1.toCharArray(); //dijadikan array
                String hsl = "";
                for (int i = p - 1; i >= 0; i--) {
                    hsl=hsl+arr[i];
                }
                txtHasil.setText(String.valueOf(hsl));
            }
        });

        Button btnCount = (Button) findViewById(R.id.btnCount);
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtKalimat.length() < 1) {
                    lengkapi("isi kalimat");
                }
                String k1 = txtKalimat.getText().toString();
                int p = k1.length();
                String hsl = String.valueOf(p);
                txtHasil.setText("Jumlah Kata =" + hsl + " karakter");
            }
        });

        Button btnReplace = (Button) findViewById(R.id.btnReplace);
        btnReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtKalimat.length() < 1) {
                    lengkapi("isi kalimat");
                }
                String k1 = txtKalimat.getText().toString();
                String hasil = k1.replace("dan", "heru");
                txtHasil.setText(hasil);
            }
        });
    }
        void lengkapi (String item) {

            new AlertDialog.Builder(this)
                .setTitle("Lengkapi data")
                .setMessage("Silahkan Isi teks Kalimat" + item)
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int sumthin) {

                    }
                })
                .show();
        }
    }



