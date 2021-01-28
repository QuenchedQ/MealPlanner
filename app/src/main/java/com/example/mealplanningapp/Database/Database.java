package com.example.mealplanningapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.example.mealplanningapp.Model.Recipes;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteAssetHelper {

    private static final String DB_NAME = "RecipeDB.db";
    private static final int DB_VER = 1;

    public Database(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }

    public List<Recipes> getRecipes()
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"R_id","Name","Ingredients","Nutrition","Difficulty","Method"};
        String tableName = "DB_RECIPE";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect,null,null,null,null,null);
        List<Recipes> result = new ArrayList<>();

        if (cursor.moveToFirst()
        ) {

            do {
                Recipes recipes = new Recipes();
                recipes.setId(cursor.getInt(cursor.getColumnIndex("R_id")));
                recipes.setName(cursor.getString(cursor.getColumnIndex("Name")));
                recipes.setIngredients(cursor.getString(cursor.getColumnIndex("Ingredients")));
                recipes.setNutrition(cursor.getString(cursor.getColumnIndex("Nutrition")));
                recipes.setDifficulty(cursor.getString(cursor.getColumnIndex("Difficulty")));
                recipes.setMethod(cursor.getString(cursor.getColumnIndex("Method")));

                result.add(recipes);
            } while (cursor.moveToNext());
        }
        return result;


    }

    public List<String> getNames()
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"Name"};
        String tableName = "DB_RECIPE";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect,null,null,null,null,null);
        List<String> result = new ArrayList<>();

        if (cursor.moveToFirst()
        ) {

            do {
                result.add(cursor.getString(cursor.getColumnIndex("Name")));
            } while (cursor.moveToNext());
        }
        return result;
    }

    public List<Recipes> getRecipesByName(String name)
        {
            SQLiteDatabase db = getReadableDatabase();
            SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

            String[] sqlSelect = {"R_id","Name","Ingredients","Nutrition","Difficulty","Method"};
            String tableName = "DB_RECIPE";

            qb.setTables(tableName);

            Cursor cursor = qb.query(db,sqlSelect,"Name LIKE?",new String[]{"%"+name+"%"},
                    null,null,null);
            List<Recipes> result = new ArrayList<>();

            if (cursor.moveToFirst()
            ) {

                do {
                    Recipes recipes = new Recipes();
                    recipes.setId(cursor.getInt(cursor.getColumnIndex("R_id")));
                    recipes.setName(cursor.getString(cursor.getColumnIndex("Name")));
                    recipes.setIngredients(cursor.getString(cursor.getColumnIndex("Ingredients")));
                    recipes.setNutrition(cursor.getString(cursor.getColumnIndex("Nutrition")));
                    recipes.setDifficulty(cursor.getString(cursor.getColumnIndex("Difficulty")));
                    recipes.setMethod(cursor.getString(cursor.getColumnIndex("Method")));

                    result.add(recipes);
                } while (cursor.moveToNext());
            }
            return result;
        }
}
