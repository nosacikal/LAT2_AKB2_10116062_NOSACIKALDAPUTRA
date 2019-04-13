package com.nosacikal.lat2_akb2_10116062_nosacikaldaputra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 *  Tanggal Pengerjaan :  13 April 2019
 *  Nim : 10116062
 *  Nama: Nosa Cikal Daputra
 *  Kelas : AKB2 (IF-2)
 * */

public class Register extends AppCompatActivity {

    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigatorAlmostThere();
            }
        });
    }

    public void navigatorAlmostThere() {
        Intent intent = new Intent(Register.this, AlmostThere.class);
        startActivity(intent);
    }


}
