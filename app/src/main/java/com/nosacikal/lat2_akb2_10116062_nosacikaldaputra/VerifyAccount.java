package com.nosacikal.lat2_akb2_10116062_nosacikaldaputra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 *  Tanggal Pengerjaan :  14 April 2019
 *  Nim : 10116062
 *  Nama: Nosa Cikal Daputra
 *  Kelas : AKB2 (IF-2)
 * */

public class VerifyAccount extends AppCompatActivity {

    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigatorUserHome();
            }
        });
    }

    public void navigatorUserHome() {
        Intent intent = new Intent(VerifyAccount.this, UserHome.class);
        startActivity(intent);
    }
}
