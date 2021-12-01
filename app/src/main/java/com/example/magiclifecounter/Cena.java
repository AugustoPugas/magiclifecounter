package com.example.magiclifecounter;

import com.example.magiclifecounter.AndGraphics.AGScene;
import com.example.magiclifecounter.AndGraphics.AGSprite;

public class Cena extends AGScene {

    AGSprite[] marcador = new AGSprite[2];
    float x = (float) 2.9, y = (float) 2.9;

    @Override
    public void init() {
        setSceneBackgroundColor(1,1,1);
        criarmarcadores();
        vidajogardorum();
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
    public void vidajogardorum(){
        AGSprite numeroesquerda = null, numerodireita = null;

        numeroesquerda = createSprite(R.mipmap.digit2, 1,1);
        numeroesquerda.setScreenPercent(20,20);
        numeroesquerda.vrPosition.setX(250);
        numeroesquerda.vrPosition.setY(350);
        numerodireita = createSprite(R.mipmap.digit0, 1,1);
        numerodireita.setScreenPercent(20,20);
        numerodireita.vrPosition.setX(400);
        numerodireita.vrPosition.setY(350);

    }

    public void vidajogadordois(){

    }

}
