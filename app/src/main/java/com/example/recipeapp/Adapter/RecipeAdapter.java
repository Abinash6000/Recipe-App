package com.example.recipeapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.R;
import com.example.recipeapp.Recipe;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecipeAdapter  extends RecyclerView.Adapter<RecipeAdapter.viewHolder>{
    ArrayList<Recipe> list;
    Context context;

    public RecipeAdapter(ArrayList<Recipe> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recipe_card_view , parent , false) ;
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Recipe model =list.get(position);
        holder.imageView.setImageResource(model.imgId);
        holder.textView.setText(model.name);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.foodIV);
            textView = itemView.findViewById(R.id.foodNameTV);
        }
    }
}
