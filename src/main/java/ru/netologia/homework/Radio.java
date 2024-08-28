package ru.netologia.homework;

public class Radio {
    private int currentRadio;
    private int currentVolume;

    public Radio(){
        currentRadio = 0;
        currentVolume = 0;
    }

    public Radio(int currentRadio, int currentVolume){
        if(currentRadio >= 0 && currentRadio <= 9){
            this.currentRadio = currentRadio;
        }else
            this.currentRadio = 0;
        if(currentVolume >= 0 && currentVolume <= 100){
            this.currentVolume = currentVolume;
        }else
            this.currentVolume = 0;
    }


    public void next(){
        if(currentRadio == 9)
            currentRadio = 0;
        else
            currentRadio++;
    }

    public void prev(){
        if(currentRadio == 0)
            currentRadio = 9;
        else
            currentRadio--;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void setCurrentRadio(int currentRadio) {
        if(currentRadio >= 0 && currentRadio <= 9){
            this.currentRadio = currentRadio;
        }
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
