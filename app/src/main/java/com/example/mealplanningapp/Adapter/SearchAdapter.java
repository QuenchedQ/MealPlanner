package com.example.mealplanningapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mealplanningapp.Model.Recipes;
import com.example.mealplanningapp.R;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

class SearchViewHolder extends RecyclerView.ViewHolder{

    public TextView name, ingredients,nutrition,difficulty,method;

    public SearchViewHolder( View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.name);
        ingredients = (TextView)itemView.findViewById(R.id.ingredients);
        nutrition = (TextView)itemView.findViewById(R.id.nutrition);
        difficulty = (TextView)itemView.findViewById(R.id.difficulty);
        method = (TextView)itemView.findViewById(R.id.method);

    }


}

public class SearchAdapter extends RecyclerView.Adapter <SearchViewHolder> {

    private Context context;
    private List<Recipes> recipes;

    public SearchAdapter(Context context, List<Recipes> recipes) {
        this.context = context;
        this.recipes = recipes;
    }

    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_recipe_search,parent,false);

        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {

        holder.name.setText(recipes.get(position).getName());
        holder.ingredients.setText(recipes.get(position).getIngredients());
        holder.nutrition.setText(recipes.get(position).getNutrition());
        holder.difficulty.setText(recipes.get(position).getDifficulty());
        holder.method.setText(recipes.get(position).getMethod());
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }
}
