package com.monolit.minicursosaac;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> strings;
    AdapterExemplo adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strings = new ArrayList<>();
        strings.add("String 1");
        strings.add("String 2");
        strings.add("String 3");

        RecyclerView list = (RecyclerView) findViewById(R.id.lista);
        LayoutInflater from = LayoutInflater.from(this);
        adapter = new AdapterExemplo(from);
        adapter.setLista(strings);

        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager(this));

        Button botao = (Button) findViewById(R.id.botao);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreDialog();
            }
        });
    }

    private void abreDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = LayoutInflater.from(this).inflate(R.layout.dialog,null);

        builder.setTitle("Digite o nome");
        builder.setView(view);

        final EditText editText = view.findViewById(R.id.hue);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String text = editText.getText().toString();
                strings.add(text);
                adapter.notifyDataSetChanged();
            }
        });

        builder.setView(view);
        builder.show();
        editText.requestFocus();
    }
}
