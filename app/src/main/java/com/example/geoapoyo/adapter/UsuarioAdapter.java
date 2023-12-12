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
import com.example.geoapoyo.R;

import org.w3c.dom.Text;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.ViewHolder> {
    private final Context context;
    //Falta la lista de Usuarios, esta se agrega al constructor

    public UsuarioAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public UsuarioAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioAdapter.ViewHolder holder, int position) {
        holder.btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EditUserActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombreUsuario;
        TextView txtUniversidad;
        ImageView imgUsuario;
        ImageButton btnDetails;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNombreUsuario = itemView.findViewById(R.id.txtNombreUsuarioLista);
            txtUniversidad = itemView.findViewById(R.id.txtUniversidadLista);
            imgUsuario = itemView.findViewById(R.id.imgUsuarioLista);
            btnDetails = itemView.findViewById(R.id.btnDetailLista);
        }
    }
}
