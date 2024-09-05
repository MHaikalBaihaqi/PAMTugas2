package com.example.pamtugas2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Deklarasikan variabel untuk EditText, RadioGroup, Button, dan intent
    EditText edtAngka1, edtAngka2;
    RadioGroup rgOperasi;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi komponen
        edtAngka1 = findViewById(R.id.edtAngka1);
        edtAngka2 = findViewById(R.id.edtAngka2);
        rgOperasi = findViewById(R.id.rgOperasi);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {
                // Ambil nilai dari EditText dan RadioButton
                String strAngka1 = edtAngka1.getText().toString();
                String strAngka2 = edtAngka2.getText().toString();
                int selectedId = rgOperasi.getCheckedRadioButtonId();

                // Lakukan perhitungan berdasarkan RadioButton yang dipilih
                int hasil = 0;
                if (selectedId == R.id.rbTambah) {
                    hasil = Integer.parseInt(strAngka1) + Integer.parseInt(strAngka2);
                }
                if (selectedId == R.id.rbKurang) {
                    hasil = Integer.parseInt(strAngka1) - Integer.parseInt(strAngka2);
                }
                if (selectedId == R.id.rbKali) {
                    hasil = Integer.parseInt(strAngka1) * Integer.parseInt(strAngka2);
                }
                if (selectedId == R.id.rbBagi) {
                    hasil = Integer.parseInt(strAngka1) / Integer.parseInt(strAngka2);
                }

                // Kirim data hasil, NIM, dan nama ke Activity kedua menggunakan Intent
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("hasil", hasil);
                intent.putExtra("nim", "225150407111054");
                intent.putExtra("nama", "Muhammad Haikal Baihaqi");
                startActivity(intent);
            }
        });
    }
}