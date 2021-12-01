package com.example.magiclifecounter;

import com.example.magiclifecounter.AndGraphics.AGScene;
import com.example.magiclifecounter.AndGraphics.AGSprite;

public class Cena extends AGScene {

    AGSprite[] marcador = new AGSprite[2];
    float x = (float) 2.8, y = (float) 2.8;

    @Override
    public void init() {
        setSceneBackgroundColor(1,1,1);
        criarmarcadores();
    }

    @Override
    public void stop() {

    }

    @Override
    public void restart() {

    }

    @Override
    public void loop() {
        if(backButtonClicked()) {
            exitGame();
        }
    }

    public void criarmarcadores(){
        int[] referencias = {R.mipmap.squaregreen, R.mipmap.squarered};
        for (int pos = 0 ; pos < marcador.length; pos++){
            marcador[pos] = createSprite(referencias[pos],1,1);
            marcador[pos].vrScale.setXY((float) x, (float) y);
            marcador[pos].vrPosition.setXY(getScreenWidth()/2,370 + pos * (marcador[pos].getHeight() + 50));

        }
    }
}
