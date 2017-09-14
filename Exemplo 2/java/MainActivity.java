package br.matheusvalin.exemplo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.meu_texto);
        botao = (Button) findViewById(R.id.meu_botao);

        textView.setText("Outro Texto inicial");

        botao.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                    abreDialog();
                 }
             }
        );
    }

    void abreDialog(){
        View view = getLayoutInflater().inflate(R.layout.dialog, null);

        final EditText campo = (EditText) view.findViewById(R.id.meu_campo);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);

        builder.setTitle("Meu Dialog");

        builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String string = campo.getText().toString();
                textView.setText(string);

            }
        });

        builder.show();
    }


}
