package com.example.app2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app2.model.Contact;

import java.util.List;

//extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context context;
    List<Contact> listaContactos;

    public RecyclerViewAdapter(Context context, List<Contact> listaContactos) {
        this.context = context;
        this.listaContactos = listaContactos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.row,viewGroup,false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {

//        myViewHolder.tv_name.setText(listaContactos.get(i).getName());
        myViewHolder.tv_name.setText(listaContactos.get(position).getName());
        myViewHolder.tv_phone.setText(listaContactos.get(position).getPhone());
        myViewHolder.tv_numPuntos.setText(String.valueOf(listaContactos.get(position).getPhone()));
        myViewHolder.tv_foto.setImageResource(listaContactos.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return listaContactos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name;
        private TextView tv_phone;
        private ImageView tv_foto;
        private TextView tv_numPuntos;

        public MyViewHolder(View v) {
            super(v);
            tv_name = v.findViewById(R.id.txtNombre);
            tv_phone= v.findViewById(R.id.txtTelefono);
            tv_numPuntos= v.findViewById(R.id.txtPuntos);
            tv_foto= v.findViewById(R.id.foto);

        }
    }
}
