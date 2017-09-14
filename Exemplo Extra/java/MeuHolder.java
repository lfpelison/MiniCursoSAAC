package com.monolit.minicursosaac;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created with mastery by Matheus Valin on 08/09/2017.
 */
public class MeuHolder extends RecyclerView.ViewHolder {

    TextView informacao;

    public MeuHolder(View itemView) {
        super(itemView);

        informacao = (TextView) itemView.findViewById(R.id.informacao);
    }

}
