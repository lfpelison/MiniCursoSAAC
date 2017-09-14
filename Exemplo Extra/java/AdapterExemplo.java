package com.monolit.minicursosaac;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/**
 * Created with mastery by Matheus Valin on 08/09/2017.
 */

public class AdapterExemplo extends RecyclerView.Adapter<MeuHolder> {

    LayoutInflater inflater;
    List<String> lista;

    public AdapterExemplo(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    @Override
    public MeuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.meu_item,parent,false);
        return new MeuHolder(view);
    }

    @Override
    public void onBindViewHolder(MeuHolder holder, int position) {
        String s = lista.get(position);
        holder.informacao.setText(s);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

}
