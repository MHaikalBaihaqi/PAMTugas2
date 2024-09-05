package com.example.pamtugas2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        TextView tvHasil = findViewById(R.id.tvHasil);


        // Ambil data yang dikirim dari MainActivity
        Intent intent = getIntent();
        int hasil = intent.getIntExtra("hasil", 0);
        String nim = intent.getStringExtra("nim");
        String nama = intent.getStringExtra("nama");

        // Tampilkan hasil, NIM, dan nama
        tvHasil.setText("Hasil: " + hasil + "\nNIM: " + nim + "\nNama: " + nama);
    }
}