package main.beans;

public class PartyBean {

    //Attributs
    private PlayerBean j1;
    private PlayerBean j2;
    private int round;
    private PlayerBean currentPlayer;


    //Méthodes
    public PlayerBean winner() {
        if (j1.getScore() > j2.getScore()) {
            return j1;
        } else if (j2.getScore() > j1.getScore()) {
            return j2;
        } else {
            return null;
        }
    }

    public void add1Round() {
        round++;
    }

    //Constructeurs


    public PartyBean(String nameJ1, String nameJ2) {
        j1 = new PlayerBean(nameJ1);
        j2 = new PlayerBean(nameJ2);
        round = 0;

        currentPlayer = j1;
    }

    public PlayerBean getJ1() {
        return j1;
    }

    public void setJ1(PlayerBean j1) {
        this.j1 = j1;
    }

    public PlayerBean getJ2() {
        return j2;
    }

    public void setJ2(PlayerBean j2) {
        this.j2 = j2;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public PlayerBean getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(PlayerBean currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
