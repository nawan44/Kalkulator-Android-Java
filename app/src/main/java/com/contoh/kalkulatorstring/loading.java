package com.contoh.kalkulatorstring;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);



    Loading();
    }
    public void Loading(){
        new Thread(){
            public void run(){
                try {Thread.sleep(5000);}
                catch (Exception e){}
                Intent i = new Intent(loading.this,Menu_utama.class);
                loading.this.finish();
                startActivity(i);

            }
        }
                .start();
    }
}
