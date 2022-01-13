package ru.netology;

public class Radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int maxCurrentVolume() {
        currentVolume = 100;
        return 100;
    }

    public int minCurrentVolume() {
        currentVolume = 0;
        return 0;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        }
        return;

    }

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume + 1;
        }
        return;
    }

    private int currentRadioStation;
    private int quantityRadioStation = 10;

    public Radio() {
    }
    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public void nextRadioStation(int currentRadioStation) {
        if (currentRadioStation == 10) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }

    public void prevRadioStation(int currentRadioStation) {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 10;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }
}
