package ru.netologia.homework;

public class Radio {
    private int currentRadio;
    private int currentVolume;
    private final int radioCount;

    public Radio() {
        radioCount = 10;
    }

    public Radio(int radioCount) {
        this.radioCount = radioCount;
    }


    public void next() {
        if (currentRadio == (radioCount - 1)) {
            currentRadio = 0;
        } else {
            currentRadio++;
        }
    }

    public void prev() {
        if (currentRadio == 0) {
            currentRadio = radioCount - 1;
        } else {
            currentRadio--;
        }
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

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio >= 0 && currentRadio <= (radioCount - 1)) {
            this.currentRadio = currentRadio;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
