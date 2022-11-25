package com.kelompok6.haditsbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Pengantar(View view) {
        Intent intent = new Intent(MainActivity.this,PengantarActivity.class);
        startActivity(intent);

    }

    public void Hadits(View view) {
        Intent intent = new Intent(MainActivity.this, ContentActivity.class);
        startActivity(intent);
    }

}