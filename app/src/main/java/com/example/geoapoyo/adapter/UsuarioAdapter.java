package com.example.geoapoyo.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geoapoyo.EditUserActivity;
import com.example.geoapoyo.Models.C_candidato;
import com.example.geoapoyo.R;
import com.google.android.material.card.MaterialCardView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.ViewHolder> {
    private final Context context;
    private final List<C_candidato> candidatos;

    public UsuarioAdapter(Context context, List<C_candidato> candidatos) {
        this.context = context;
        this.candidatos = candidatos;
    }

    @NonNull
    @Override
    public UsuarioAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioAdapter.ViewHolder holder, int position) {
        C_candidato candidato = candidatos.get(position);
        String imageURL = "https://prototipo2023-d6240700184c.herokuapp.com/api/uploads/candidatos/" + candidato.id_candidato;
        holder.txtNombreUsuario.setText(candidato.nombre);
        holder.txtUniversidad.setText(candidato.institucion);
        Picasso.get().load(imageURL).into(holder.imgUsuario);
        holder.btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EditUserActivity.class);
                intent.putExtra("Candidato", candidato);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return candidatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombreUsuario;
        TextView txtUniversidad;
        ImageView imgUsuario;
        MaterialCardView crdActive;
        ImageButton btnDetails;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNombreUsuario = itemView.findViewById(R.id.txtNombreUsuarioLista);
            txtUniversidad = itemView.findViewById(R.id.txtUniversidadLista);
            imgUsuario = itemView.findViewById(R.id.imgUsuarioLista);
            btnDetails = itemView.findViewById(R.id.btnDetailLista);
            crdActive = itemView.findViewById(R.id.crdActive);
        }
    }
}
