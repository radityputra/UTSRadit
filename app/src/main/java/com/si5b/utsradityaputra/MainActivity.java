package com.si5b.utsradityaputra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_nama, et_nomor;
    private CheckBox cb_facebook, cb_instagram, cb_website;
    private Button btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nama = findViewById(R.id.et_nama);
        et_nomor = findViewById(R.id.et_nomor);
        cb_facebook = findViewById(R.id.cb_facebook);
        cb_instagram = findViewById(R.id.cb_instagram);
        cb_website = findViewById(R.id.cb_website);

        btn_daftar = findViewById(R.id.btn_daftar);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama, nomor;
                String facebook, instagram, website;

                nama = et_nama.getText().toString();
                nomor = et_nomor.getText().toString();
                facebook = cb_facebook.getText().toString();
                instagram = cb_instagram.getText().toString();
                website = cb_website.getText().toString();

                if (nama.trim().equals("")) {
                    et_nama.setError("Nama Tidak Boleh Kosong !");

                } else if (nomor.trim().equals("")) {
                    et_nomor.setError("Nomor Pendaftaran Tidak Boleh Kosong !");

                } else if (!cb_facebook.isChecked() && !cb_instagram.isChecked() && !cb_website.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Tidak ada sosial media yang dipilih !", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, SecMainActivity.class);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varNomor", nomor);
                    intent.putExtra("varFb", facebook);
                    intent.putExtra("varIg", instagram);
                    intent.putExtra("varWeb", website);
                    startActivity(intent);
                }

            }
        });

    }
}