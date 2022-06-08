package sample;

public class Game {
    // Attributes
    //---------------------------------------------------------------------------
    private int setSize = 0;
    private int setNumber = 0;

    private boolean gamingMode;

    // Constructor, getter and setter
    //---------------------------------------------------------------------------
    public Game() {    }

    public int getSetSize() {
        return setSize;
    }

    public void setSetSize(int size){
        this.setSize = size;
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int number) {
        this.setNumber = number;
    }

    public boolean getGamingMode(){
        return gamingMode;
    }

    public void setGamingMode(Boolean mode){
        this.gamingMode = mode;
    }






}
