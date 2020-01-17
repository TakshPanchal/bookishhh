package com.example.myapplication;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListOfBookAdp extends RecyclerView.Adapter<ListOfBookAdp.ViewHolder> {
    private static final String TAG = "ListOfBookAdp";
    private ArrayList<Book> list;
    private Context context;

    public ListOfBookAdp(ArrayList<Book> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_list_of_book, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.title.setText(list.get(position).getName());
        holder.aName.setText(list.get(position).getAuthorName());
        Glide.with(context).asBitmap().load(list.get(position).getDescription()).into(holder.cover);
        holder.cover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,BookActivity.class);
                intent.putExtra("id",position);
                context.startActivity(intent);
            }
        });
        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,BookActivity.class);
                intent.putExtra("id",position);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title, aName, des;
        private ImageView cover;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tvBookTitle);
            aName = itemView.findViewById(R.id.tvAuthorName);
            des = itemView.findViewById(R.id.tvDescription);
            cover = itemView.findViewById(R.id.ivBookCover);
        }



//        @Override
//        public void onClick(View v) {
//            Log.d(TAG, "onClick: clicked");
//        }
    }
}


