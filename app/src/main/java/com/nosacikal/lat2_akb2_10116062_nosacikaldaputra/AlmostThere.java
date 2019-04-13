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

public class AlmostThere extends AppCompatActivity {

    private Button btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);

        btnVerify = findViewById(R.id.btnVerify);
        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigatorVerifyAccount();
            }
        });
    }

    public void navigatorVerifyAccount() {
        Intent intent = new Intent(AlmostThere.this, VerifyAccount.class);
        startActivity(intent);
    }
}
