package com.si5b.utsradityaputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;
import android.widget.Button;

public class SecMainActivity extends AppCompatActivity {

    private TextView tv_tampil_nama, tv_tampil_nomor;
    private CheckedTextView ctv_facebook, ctv_instagram, ctv_website;
    private Button btn_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec_main);

        tv_tampil_nama = findViewById(R.id.tv_tampil_nama);
        tv_tampil_nomor = findViewById(R.id.tv_tampil_nomor);
        ctv_facebook = findViewById(R.id.ctv_facebook);
        ctv_instagram = findViewById(R.id.ctv_instagram);
        ctv_website = findViewById(R.id.ctv_website);
        btn_kembali = findViewById(R.id.btn_kembali);

        Intent intent = getIntent();

        tv_tampil_nama.setText(intent.getStringExtra("varNama"));
        tv_tampil_nomor.setText(intent.getStringExtra("varNomor"));
        ctv_facebook.setText(intent.getStringExtra("varFb"));
        ctv_instagram.setText(intent.getStringExtra("varIg"));
        ctv_website.setText(intent.getStringExtra("varWeb"));
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SecMainActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

    }
}