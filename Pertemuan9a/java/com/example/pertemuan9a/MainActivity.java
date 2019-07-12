package com.example.pertemuan9a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nim,nama,kampus;
    TextView HASIL,NIM,NAMA,KAMPUS;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nim = findViewById(R.id.nim);
        nama = findViewById(R.id.nama);
        kampus = findViewById(R.id.kampus);
        HASIL = findViewById(R.id.Hasil);
        NIM = findViewById(R.id.NIM);
        NAMA = findViewById(R.id.NAMA);
        KAMPUS= findViewById(R.id.KAMPUS);
        button= findViewById(R.id.button);



    }
    public void hasil (View view){
        NIM.setText(nim.getText());
        NAMA.setText(nama.getText());
        KAMPUS.setText(kampus.getText());
    }
}
