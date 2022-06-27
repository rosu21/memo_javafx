package sample;

/*
* Idea: use singleton class to pass information between javafx scenes.
* Source: Case 3 from (https://dev.to/devtony101/javafx-3-ways-of-passing-information-between-scenes-1bm8)
* */

public final class Game {
    // Attributes
    //---------------------------------------------------------------------------
    private int setSize = 0;
    private int setNumber = 0;

    private boolean gamingMode;


    private final static Game gameInstance = new Game();

    // Constructor, getter and setter
    //---------------------------------------------------------------------------

    private Game() {    }


    public static Game getInstance() {
        return gameInstance;
    }



    public void setSetSize(int size){
        this.setSize = size;
    }
    public int getSetSize() {
        return this.setSize;
    }
    public int getSetNumber() {
        return this.setNumber;
    }

    public void setSetNumber(int number) {
        this.setNumber = number;
    }

    public boolean getGamingMode(){
        return this.gamingMode;
    }

    public void setGamingMode(Boolean mode){
        this.gamingMode = mode;
    }






}
