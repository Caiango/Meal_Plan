package com.example.meal_plan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterHamb extends RecyclerView.Adapter<AdapterHamb.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public AdapterHamb(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterHamb.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hamb_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHamb.ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);
        holder.txTitle.setText(listItem.getTitle());
        holder.txDesc.setText(listItem.getDesc());
        holder.imgHamb.setImageResource(R.mipmap.hamburguer);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txTitle;
        public TextView txDesc;
        public ImageView imgHamb;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txTitle = (TextView) itemView.findViewById(R.id.txhambtitle);
            txDesc = (TextView) itemView.findViewById(R.id.txhambdesc);
            imgHamb = (ImageView) itemView.findViewById(R.id.imghamb);
        }
    }
}










