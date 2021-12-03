package com.example.magiclifecounter;

import com.example.magiclifecounter.AndGraphics.AGScene;
import com.example.magiclifecounter.AndGraphics.AGSprite;

public class Cena extends AGScene {

    AGSprite[] marcador = new AGSprite[2];
    AGSprite numeroesquerda, numerodireita = null;
    int[] referencias = {R.mipmap.digit0,R.mipmap.digit1,R.mipmap.digit2,R.mipmap.digit3,R.mipmap.digit4,R.mipmap.digit5,R.mipmap.digit6,R.mipmap.digit7,R.mipmap.digit8,R.mipmap.digit9};
    float x = (float) 2.9, y = (float) 2.9;

    @Override
    public void init() {
        setSceneBackgroundColor(1,1,1);
        criarMarcadores();
        vidaJogardorum();
        vidaJogadordois();
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

    public void criarMarcadores(){
        int[] referencias = {R.mipmap.squaregreen, R.mipmap.squarered};
        for (int pos = 0 ; pos < marcador.length; pos++){
            marcador[pos] = createSprite(referencias[pos],1,1);
            marcador[pos].vrScale.setXY((float) x, (float) y);
            marcador[pos].vrPosition.setXY(getScreenWidth()/2,370 + pos * (marcador[pos].getHeight() + 50));

        }
    }
    public void vidaJogardorum(){
        vidaInicial();
        posicaoVidaJogadorUm();
    }

    public void vidaJogadordois(){
        vidaInicial();
        posicaoVidaJogadordois();
    }

    public void adicionarVida(){

    }

    public void removerVida(){

    }

    public void resetar(){
        vidaInicial();
    }

    public void vidaInicial(){
        numeroesquerda = createSprite(referencias[2], 1,1);
        numerodireita = createSprite(referencias[0], 1,1);
    }

    public void posicaoVidaJogadorUm(){
        numeroesquerda.setScreenPercent(20,20);
        numeroesquerda.vrPosition.setX(250);
        numeroesquerda.vrPosition.setY(350);
        numerodireita.setScreenPercent(20,20);
        numerodireita.vrPosition.setX(400);
        numerodireita.vrPosition.setY(350);

    }

    public void posicaoVidaJogadordois(){
        numeroesquerda.setScreenPercent(20,20);
        numeroesquerda.vrPosition.setX(250);
        numeroesquerda.vrPosition.setY(1150);
        numerodireita.setScreenPercent(20,20);
        numerodireita.vrPosition.setX(400);
        numerodireita.vrPosition.setY(1150);
    }

}
