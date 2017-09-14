package com.monolit.minicursosaac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> strings = new ArrayList<>();
        strings.add("String 1");
        strings.add("String 2");
        strings.add("String 3");
        strings.add("String 4");
        strings.add("String 5");
        strings.add("String 6");
        strings.add("String 7");
        strings.add("String 8");
        strings.add("String 9");
        strings.add("String 10");
        strings.add("String 11");
        strings.add("String 12");
        strings.add("String 13");

        RecyclerView list = (RecyclerView) findViewById(R.id.lista);
        LayoutInflater from = LayoutInflater.from(this);
        AdapterExemplo adapter = new AdapterExemplo(from);
        adapter.setLista(strings);

        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager(this));
    }
}
