package org.example.Dz_Nt_Radio;


public class Radio {
    private int maxChanel = 9;
    private int minChanel = 0;
    private int currentChanel;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int maxChanel) {
        this.maxChanel = maxChanel;
    }


    public Radio() {
    }

    public int getNumberOfChanel(){
        return currentChanel;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel > maxChanel) {
            return;
        }
        if (currentChanel < minChanel) {
            return;
        }
        this.currentChanel = currentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void nextChanel() {
        if (currentChanel >= 9) {
            setCurrentChanel(minChanel);
        }
        else {
            setCurrentChanel(currentChanel + 1);
        }
    }



    public void prevChanel() {
        if (currentChanel <= minChanel) {
            setCurrentChanel(maxChanel);
        }
        else {
            setCurrentChanel(currentChanel - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}

