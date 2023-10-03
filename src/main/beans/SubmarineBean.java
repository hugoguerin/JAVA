package main.beans;

public class SubmarineBean {


    public static void main(String[] args) {

        SubmarineBean mySub = new SubmarineBean();

        mySub.setName("Squall");
        mySub.dive();
        mySub.dive();
        mySub.rise();
        mySub.rise();
        mySub.rise();

        System.out.println(mySub.name +  " " + mySub.depth);
    }

    // DECLARATION

    private String name;
    private int depth;

    //ACCESSEURS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepth() {
        return depth;
    }


    //METHODES

    public void dive() {
        depth -= 50;
    }

    public void rise() {
        depth += 50;
        if (depth > 0){
            depth = 0;
        }
    }
}