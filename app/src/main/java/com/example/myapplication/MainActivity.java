package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.adapters.OlimpiadaAdaptador;
import com.example.myapplication.models.Olimpiada;

public class MainActivity extends AppCompatActivity {

    ListView olimpiadasList;
    OlimpiadaAdaptador olimpiadaAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        olimpiadasList = findViewById(R.id.olimpiadasList);
        olimpiadaAdaptador = new OlimpiadaAdaptador(this, Olimpiada.getCollection());
        olimpiadasList.setAdapter(olimpiadaAdaptador);
    }
}