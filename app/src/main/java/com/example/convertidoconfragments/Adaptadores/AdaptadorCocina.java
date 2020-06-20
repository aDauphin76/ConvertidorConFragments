package com.example.convertidoconfragments.Adaptadores;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.convertidoconfragments.MedidaCocina;
import com.example.convertidoconfragments.R;

import java.util.ArrayList;

public class AdaptadorCocina extends RecyclerView.Adapter<AdaptadorCocina.MedidaCocinaViewHolder>
                            implements View.OnClickListener {

    ArrayList<MedidaCocina> medidaCocina;
    private View.OnClickListener listener;


    public AdaptadorCocina(ArrayList<MedidaCocina> medidaCocina) {
        this.medidaCocina = medidaCocina;
    }

    @NonNull
    @Override
    public MedidaCocinaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.fila_cocina,null,false);
        vista.setOnClickListener(this);
        return new MedidaCocinaViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull MedidaCocinaViewHolder holder, int position) {
        holder.tvNombreUnidad.setText(medidaCocina.get(position).getNombre());
        holder.tvMedida1.setText(medidaCocina.get(position).getMedida1());
        holder.tvMedida2.setText(medidaCocina.get(position).getMedida2());
        holder.tvMedida3.setText(medidaCocina.get(position).getMedida3());
        holder.imagenMedida.setImageResource(medidaCocina.get(position).getImagen());
    }

    @Override
    public int getItemCount() {
        return medidaCocina.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View vista) {
        if (listener != null){
            listener.onClick(vista);
        }

    }

    public static class MedidaCocinaViewHolder extends RecyclerView.ViewHolder {

        TextView tvNombreUnidad, tvMedida1, tvMedida2, tvMedida3;
        ImageView imagenMedida;

        public MedidaCocinaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombreUnidad = itemView.findViewById(R.id.tvNombreUnidad);
            tvMedida1      = itemView.findViewById(R.id.tvMedida1);
            tvMedida2      = itemView.findViewById(R.id.tvMedida2);
            tvMedida3      = itemView.findViewById(R.id.tvMedida3);
            imagenMedida  = itemView.findViewById(R.id.imagenCocina);
        }
    }
}
