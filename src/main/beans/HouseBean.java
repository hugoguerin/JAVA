package main.beans;

public class HouseBean {
    private int width;
    private int length;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public int getArea(){
        return length * width;
    }

}
