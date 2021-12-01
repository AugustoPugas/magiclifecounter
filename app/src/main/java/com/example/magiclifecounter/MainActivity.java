package com.example.magiclifecounter;

import android.os.Bundle;

import com.example.magiclifecounter.AndGraphics.AGActivityGame;

public class MainActivity extends AGActivityGame {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.init(this, false);
        this.addScene(new Cena());
    }
}