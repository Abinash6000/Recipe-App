package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Recipe barfi = new Recipe(1, "Barfi", "300 ml condensed milk\n" +
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

    }
}