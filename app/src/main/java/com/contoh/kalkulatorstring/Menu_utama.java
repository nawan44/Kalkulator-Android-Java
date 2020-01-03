package com.contoh.kalkulatorstring;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu_utama extends AppCompatActivity {

    Button btnAbout, btnDefinisi, btnList, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        btnAbout = (Button) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu_utama.this, About.class);
                startActivity(i);

            }
        });

        btnDefinisi= (Button) findViewById(R.id.btnDefinisi);
        btnDefinisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu_utama.this, Definisi.class);
                startActivity(i);

            }
        });


        btnExit= (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();

            }
        });

    }
}
