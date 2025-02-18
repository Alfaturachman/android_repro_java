package com.example.repro.ui.pengelola;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AmbilAdapter extends RecyclerView.Adapter<AmbilAdapter.ViewHolder> {
    private List<Ambil> ambilList;

    public void setData(List<Ambil> ambilList) {
        this.ambilList = ambilList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Ambil ambil = ambilList.get(position);
        holder.textView.setText(ambil.getNamaPemasok());
    }

    @Override
    public int getItemCount() {
        return ambilList == null ? 0 : ambilList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(android.R.id.text1);
        }
    }
}
