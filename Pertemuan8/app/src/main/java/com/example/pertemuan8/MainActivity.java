package com.example.pertemuan8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button tambah,kurang,kali,bagi,clr;
    EditText tks1,tks2;
    TextView Tampilkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambah=(Button)findViewById(R.id.Tambah);
        kurang=(Button)findViewById(R.id.Kurang);
        kali=(Button)findViewById(R.id.Kali);
        bagi=(Button)findViewById(R.id.Bagi);
        clr=(Button)findViewById(R.id.Bersihkan);
        tks1=(EditText)findViewById(R.id.editText);
        tks2=(EditText)findViewById(R.id.editText2);
        Tampilkan=(TextView)findViewById(R.id.textView4);
    }

    public void klik_Tambah (View vi) {
        Toast t = null;
        if (tks1.getText().length() > 0 && tks2.getText().length() > 0) {
            int angka1 = Integer.parseInt(tks1.getText().toString());
            int angka2 = Integer.parseInt(tks2.getText().toString());
            int hasil = angka1 + angka2;
            Tampilkan.setText(Integer.toString(hasil));
        }else {
            t = Toast.makeText(MainActivity.this, "Masukkan Angka Terlebih Dulu", Toast.LENGTH_LONG);
        t.show();

    }
    }


}
