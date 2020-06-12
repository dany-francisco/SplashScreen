package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.toolbox.ImageLoader;
import com.example.myapplication.adapters.ContactoAdaptador;
import com.example.myapplication.helpers.QueueUtils;
import com.example.myapplication.models.Contacto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView contactosList;
    ContactoAdaptador contactoAdaptador;
    QueueUtils.QueueObject queue = null;
    ImageLoader queueImage = null;
    ArrayList<Contacto> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        queue = QueueUtils.getInstance(this.getApplicationContext());
        queueImage = queue.getImageLoader();
        items = new ArrayList<>();
        Contacto.injectContactsFromCloud(queue, items, this);

        contactosList = findViewById(R.id.contactosList);
        contactoAdaptador = new ContactoAdaptador(this, items, queueImage);
        contactosList.setAdapter(contactoAdaptador);
    }

    public void refreshList(){
        if ( contactoAdaptador != null ) {
            contactoAdaptador.notifyDataSetChanged();
        }
    }
}