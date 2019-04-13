package com.nosacikal.lat2_akb2_10116062_nosacikaldaputra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/*
*  Tanggal Pengerjaan :  13 April 2019
*  Nim : 10116062
*  Nama: Nosa Cikal Daputra
*  Kelas : AKB2 (IF-2)
* */

public class Login extends AppCompatActivity {

    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigatorRegister();
            }
        });
    }

    public void navigatorRegister() {
        Intent intent = new Intent(Login.this, Register.class);
        startActivity(intent);
    }

}
