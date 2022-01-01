package com.example.retrofitmvvmrecyclerviewcalbackstutorial.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitmvvmrecyclerviewcalbackstutorial.R;
import com.example.retrofitmvvmrecyclerviewcalbackstutorial.pojo.PostModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PostViewHolder> {

    private ArrayList<PostModel> postModels = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        holder.title.setText(postModels.get(position).getTitle());
        holder.id.setText(String.valueOf(postModels.get(position).getId()));
        holder.body.setText(postModels.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return postModels.size();
    }

    public void setList(ArrayList<PostModel> postModels){
        this.postModels = postModels;
        notifyDataSetChanged();
    }

    class PostViewHolder extends RecyclerView.ViewHolder{

        TextView title,id,body;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTV);
            id = itemView.findViewById(R.id.userIDTV);
            body = itemView.findViewById(R.id.bodyTV);

        }
    }

}
