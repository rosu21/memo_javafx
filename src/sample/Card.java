package sample;

public class Card {
    //Attributes

    private String imgURL;
    private String imgBackCover = "img/cardBackCover.jpg";
    private int setID;
    private boolean showFront = true;

    // Getter, setter
    public int getSetID() {
        return this.setID;
    }

    public String getImgURL() {
        return this.imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public void setSetID(int setID) {
        this.setID = setID;
    }


    public String getImgBackCover() {
        return imgBackCover;
    }

    public boolean isShowFront() {
        return showFront;
    }

    public void setShowFront(boolean showFront) {
        this.showFront = showFront;
    }
}
