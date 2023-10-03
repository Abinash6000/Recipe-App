package com.example.recipeapp;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recipeapp.Adapter.RecipeAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.menuRV);

        Recipe barfi = new Recipe(1, R.drawable.barfi, "Barfi", "300 ml condensed milk\n" +
                "2 1/2 cup milk powder\n" +
                "2 tablespoon ghee\n" +
                "1 cup water\n" +
                "1 teaspoon powdered green cardamom\n" +
                "1 handful pistachios", "Step 1 Make the milk powder dough\n" +
                "Take a large bowl and add milk powder to it along with milk. Make a rigid dough using these ingredients. Once done, keep the dough in the freezer and freeze it for at least for 20 minutes.\n" +
                "\n" +
                "Step 2 Grate the dough & heat some ghee\n" +
                "Take the dough and grate it in a bowl. Keep this grated dough aside for further usage. Take a deep bottomed pan, keep it on low flame and heat ghee in it.\n" +
                "\n" +
                "Step 3 Cook the grated dough with cardamom\n" +
                "Add the grated dough to this pan with water. Mix well and stir in cardamom powder in the pan. Cook this mixture until the water dries out and the mixture accumulates in the centre of the pan.\n" +
                "\n" +
                "Step 4 Garnish with silver varq & almonds before serving\n" +
                "Pour this prepared mixture into a greased tray and garnish it with almonds and pistachios. Let the mixture cool down and cut the barfi into desired shapes. Garnish it with silver varq and serve!");

        Recipe barfi1 = new Recipe(1, R.drawable.barfi, "Barfi", "300 ml condensed milk\n" +
                "2 1/2 cup milk powder\n" +
                "2 tablespoon ghee\n" +
                "1 cup water\n" +
                "1 teaspoon powdered green cardamom\n" +
                "1 handful pistachios", "Step 1 Make the milk powder dough\n" +
                "Take a large bowl and add milk powder to it along with milk. Make a rigid dough using these ingredients. Once done, keep the dough in the freezer and freeze it for at least for 20 minutes.\n" +
                "\n" +
                "Step 2 Grate the dough & heat some ghee\n" +
                "Take the dough and grate it in a bowl. Keep this grated dough aside for further usage. Take a deep bottomed pan, keep it on low flame and heat ghee in it.\n" +
                "\n" +
                "Step 3 Cook the grated dough with cardamom\n" +
                "Add the grated dough to this pan with water. Mix well and stir in cardamom powder in the pan. Cook this mixture until the water dries out and the mixture accumulates in the centre of the pan.\n" +
                "\n" +
                "Step 4 Garnish with silver varq & almonds before serving\n" +
                "Pour this prepared mixture into a greased tray and garnish it with almonds and pistachios. Let the mixture cool down and cut the barfi into desired shapes. Garnish it with silver varq and serve!");
        Recipe barfi2 = new Recipe(1, R.drawable.barfi, "Barfi", "300 ml condensed milk\n" +
                "2 1/2 cup milk powder\n" +
                "2 tablespoon ghee\n" +
                "1 cup water\n" +
                "1 teaspoon powdered green cardamom\n" +
                "1 handful pistachios", "Step 1 Make the milk powder dough\n" +
                "Take a large bowl and add milk powder to it along with milk. Make a rigid dough using these ingredients. Once done, keep the dough in the freezer and freeze it for at least for 20 minutes.\n" +
                "\n" +
                "Step 2 Grate the dough & heat some ghee\n" +
                "Take the dough and grate it in a bowl. Keep this grated dough aside for further usage. Take a deep bottomed pan, keep it on low flame and heat ghee in it.\n" +
                "\n" +
                "Step 3 Cook the grated dough with cardamom\n" +
                "Add the grated dough to this pan with water. Mix well and stir in cardamom powder in the pan. Cook this mixture until the water dries out and the mixture accumulates in the centre of the pan.\n" +
                "\n" +
                "Step 4 Garnish with silver varq & almonds before serving\n" +
                "Pour this prepared mixture into a greased tray and garnish it with almonds and pistachios. Let the mixture cool down and cut the barfi into desired shapes. Garnish it with silver varq and serve!");
        Recipe barfi3 = new Recipe(1, R.drawable.barfi, "Barfi", "300 ml condensed milk\n" +
                "2 1/2 cup milk powder\n" +
                "2 tablespoon ghee\n" +
                "1 cup water\n" +
                "1 teaspoon powdered green cardamom\n" +
                "1 handful pistachios", "Step 1 Make the milk powder dough\n" +
                "Take a large bowl and add milk powder to it along with milk. Make a rigid dough using these ingredients. Once done, keep the dough in the freezer and freeze it for at least for 20 minutes.\n" +
                "\n" +
                "Step 2 Grate the dough & heat some ghee\n" +
                "Take the dough and grate it in a bowl. Keep this grated dough aside for further usage. Take a deep bottomed pan, keep it on low flame and heat ghee in it.\n" +
                "\n" +
                "Step 3 Cook the grated dough with cardamom\n" +
                "Add the grated dough to this pan with water. Mix well and stir in cardamom powder in the pan. Cook this mixture until the water dries out and the mixture accumulates in the centre of the pan.\n" +
                "\n" +
                "Step 4 Garnish with silver varq & almonds before serving\n" +
                "Pour this prepared mixture into a greased tray and garnish it with almonds and pistachios. Let the mixture cool down and cut the barfi into desired shapes. Garnish it with silver varq and serve!");
        Recipe barfi4 = new Recipe(1, R.drawable.barfi, "Barfi", "300 ml condensed milk\n" +
                "2 1/2 cup milk powder\n" +
                "2 tablespoon ghee\n" +
                "1 cup water\n" +
                "1 teaspoon powdered green cardamom\n" +
                "1 handful pistachios", "Step 1 Make the milk powder dough\n" +
                "Take a large bowl and add milk powder to it along with milk. Make a rigid dough using these ingredients. Once done, keep the dough in the freezer and freeze it for at least for 20 minutes.\n" +
                "\n" +
                "Step 2 Grate the dough & heat some ghee\n" +
                "Take the dough and grate it in a bowl. Keep this grated dough aside for further usage. Take a deep bottomed pan, keep it on low flame and heat ghee in it.\n" +
                "\n" +
                "Step 3 Cook the grated dough with cardamom\n" +
                "Add the grated dough to this pan with water. Mix well and stir in cardamom powder in the pan. Cook this mixture until the water dries out and the mixture accumulates in the centre of the pan.\n" +
                "\n" +
                "Step 4 Garnish with silver varq & almonds before serving\n" +
                "Pour this prepared mixture into a greased tray and garnish it with almonds and pistachios. Let the mixture cool down and cut the barfi into desired shapes. Garnish it with silver varq and serve!");
        Recipe barfi5 = new Recipe(1, R.drawable.barfi, "Barfi", "300 ml condensed milk\n" +
                "2 1/2 cup milk powder\n" +
                "2 tablespoon ghee\n" +
                "1 cup water\n" +
                "1 teaspoon powdered green cardamom\n" +
                "1 handful pistachios", "Step 1 Make the milk powder dough\n" +
                "Take a large bowl and add milk powder to it along with milk. Make a rigid dough using these ingredients. Once done, keep the dough in the freezer and freeze it for at least for 20 minutes.\n" +
                "\n" +
                "Step 2 Grate the dough & heat some ghee\n" +
                "Take the dough and grate it in a bowl. Keep this grated dough aside for further usage. Take a deep bottomed pan, keep it on low flame and heat ghee in it.\n" +
                "\n" +
                "Step 3 Cook the grated dough with cardamom\n" +
                "Add the grated dough to this pan with water. Mix well and stir in cardamom powder in the pan. Cook this mixture until the water dries out and the mixture accumulates in the centre of the pan.\n" +
                "\n" +
                "Step 4 Garnish with silver varq & almonds before serving\n" +
                "Pour this prepared mixture into a greased tray and garnish it with almonds and pistachios. Let the mixture cool down and cut the barfi into desired shapes. Garnish it with silver varq and serve!");
        Recipe barfi6 = new Recipe(1, R.drawable.barfi, "Barfi", "300 ml condensed milk\n" +
                "2 1/2 cup milk powder\n" +
                "2 tablespoon ghee\n" +
                "1 cup water\n" +
                "1 teaspoon powdered green cardamom\n" +
                "1 handful pistachios", "Step 1 Make the milk powder dough\n" +
                "Take a large bowl and add milk powder to it along with milk. Make a rigid dough using these ingredients. Once done, keep the dough in the freezer and freeze it for at least for 20 minutes.\n" +
                "\n" +
                "Step 2 Grate the dough & heat some ghee\n" +
                "Take the dough and grate it in a bowl. Keep this grated dough aside for further usage. Take a deep bottomed pan, keep it on low flame and heat ghee in it.\n" +
                "\n" +
                "Step 3 Cook the grated dough with cardamom\n" +
                "Add the grated dough to this pan with water. Mix well and stir in cardamom powder in the pan. Cook this mixture until the water dries out and the mixture accumulates in the centre of the pan.\n" +
                "\n" +
                "Step 4 Garnish with silver varq & almonds before serving\n" +
                "Pour this prepared mixture into a greased tray and garnish it with almonds and pistachios. Let the mixture cool down and cut the barfi into desired shapes. Garnish it with silver varq and serve!");
        Recipe barfi7 = new Recipe(1, R.drawable.barfi, "Barfi", "300 ml condensed milk\n" +
                "2 1/2 cup milk powder\n" +
                "2 tablespoon ghee\n" +
                "1 cup water\n" +
                "1 teaspoon powdered green cardamom\n" +
                "1 handful pistachios", "Step 1 Make the milk powder dough\n" +
                "Take a large bowl and add milk powder to it along with milk. Make a rigid dough using these ingredients. Once done, keep the dough in the freezer and freeze it for at least for 20 minutes.\n" +
                "\n" +
                "Step 2 Grate the dough & heat some ghee\n" +
                "Take the dough and grate it in a bowl. Keep this grated dough aside for further usage. Take a deep bottomed pan, keep it on low flame and heat ghee in it.\n" +
                "\n" +
                "Step 3 Cook the grated dough with cardamom\n" +
                "Add the grated dough to this pan with water. Mix well and stir in cardamom powder in the pan. Cook this mixture until the water dries out and the mixture accumulates in the centre of the pan.\n" +
                "\n" +
                "Step 4 Garnish with silver varq & almonds before serving\n" +
                "Pour this prepared mixture into a greased tray and garnish it with almonds and pistachios. Let the mixture cool down and cut the barfi into desired shapes. Garnish it with silver varq and serve!");
        Recipe barfi8 = new Recipe(1, R.drawable.barfi, "Barfi", "300 ml condensed milk\n" +
                "2 1/2 cup milk powder\n" +
                "2 tablespoon ghee\n" +
                "1 cup water\n" +
                "1 teaspoon powdered green cardamom\n" +
                "1 handful pistachios", "Step 1 Make the milk powder dough\n" +
                "Take a large bowl and add milk powder to it along with milk. Make a rigid dough using these ingredients. Once done, keep the dough in the freezer and freeze it for at least for 20 minutes.\n" +
                "\n" +
                "Step 2 Grate the dough & heat some ghee\n" +
                "Take the dough and grate it in a bowl. Keep this grated dough aside for further usage. Take a deep bottomed pan, keep it on low flame and heat ghee in it.\n" +
                "\n" +
                "Step 3 Cook the grated dough with cardamom\n" +
                "Add the grated dough to this pan with water. Mix well and stir in cardamom powder in the pan. Cook this mixture until the water dries out and the mixture accumulates in the centre of the pan.\n" +
                "\n" +
                "Step 4 Garnish with silver varq & almonds before serving\n" +
                "Pour this prepared mixture into a greased tray and garnish it with almonds and pistachios. Let the mixture cool down and cut the barfi into desired shapes. Garnish it with silver varq and serve!");
        ArrayList<Recipe> recipeArrayList = new ArrayList<>();
        recipeArrayList.add(barfi);
        recipeArrayList.add(barfi1);
        recipeArrayList.add(barfi2);
        recipeArrayList.add(barfi3);
        recipeArrayList.add(barfi4);
        recipeArrayList.add(barfi5);
        recipeArrayList.add(barfi6);
        recipeArrayList.add(barfi7);
        recipeArrayList.add(barfi8);
        RecipeAdapter recipeAdapter = new RecipeAdapter(recipeArrayList,this);
        rv.setAdapter(recipeAdapter);
    }
}