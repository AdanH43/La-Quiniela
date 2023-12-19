package com.politecnicomalaga.NasdaqOilPrices;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class JornadaViewHolder extends RecyclerView.ViewHolder {

    //ESTADO

    //TODO: declare attributes to hold two textviews, day and money
    final JornadaAdapter mAdapter;
    private TextView tvEquipoLocal;
    private TextView tvEquipoVisitante;
    private TextView tvPuntuacion;


    //COMPORTAMIENTO
    public JornadaViewHolder(View itemView, JornadaAdapter adapter) {
        super(itemView);

        tvEquipoLocal = itemView.findViewById(R.id.equipoLocal);
        tvEquipoVisitante = itemView.findViewById(R.id.equipoVisitante);
        tvPuntuacion = itemView.findViewById(R.id.puntuacion);
        this.mAdapter = adapter;
    }

    public void setTvEquipoLocal(String data) {
        tvEquipoLocal.setText(data);
    }

    public void setTvEquipoVisitante(String data) {
        tvEquipoVisitante.setText(data);
    }

    public void setTvPuntuacion(String data) {
        this.tvPuntuacion.setText(data);
    }
}
