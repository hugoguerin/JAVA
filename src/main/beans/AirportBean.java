package main.beans;

public class AirportBean {

    public static void main(String[] args) {

        AirportBean airport = new AirportBean();

        PlaneBean plane1 = new PlaneBean();
        plane1.setName("A1");

        PlaneBean plane2 = new PlaneBean();
        plane2.setName("A2");

        int nextPlace = airport.nextFreePlace();

        System.out.println(airport.park(plane2, nextPlace));

        System.out.println(airport.park(plane2, nextPlace));

        nextPlace = airport.nextFreePlace();

        System.out.println(airport.park(plane1, nextPlace));

        airport.state();

        System.out.println(airport.nextFreePlace());








    }


    //ATTRIBUTS

    private PlaneBean place1;

    private PlaneBean place2;

    // ACCESSEURS

    // METHODES

    public int nextFreePlace() {
        if (place1 == null) {
            return 1;
        } else if (place2 == null) {
            return 2;
        } else {
            return -1;
        }
    }

    public String park(PlaneBean plane, int position) {
        if (position == 1) {
            if (place1 == null) {
                place1 = plane;
                return "ok";
            } else {
                return "La place 1 est occupée";
            }
        } else if (position == 2) {
            if (place2 == null) {
                place2 = plane;
                return "ok";
            } else {
                return "La place 2 est occupée";
            }
        } else {
            return "Position incorrecte";
        }
    }

    public void state() {
        if (place1 == null && place2 == null) {
            System.out.println("Place1=" + "Vide");
            System.out.println("Place2=" + "Vide");
        } else if (place1 != null && place2 == null) {
            System.out.println("Place1=" + place1.getName());
            System.out.println("Place2=" + "Vide");
        } else if (place1 == null && place2 != null) {
            System.out.println("Place1=" + "Vide");
            System.out.println("Place2=" + place2.getName());
        } else {
            System.out.println("Place1=" + place1.getName());
            System.out.println("Place2=" + place2.getName());
        }
    }


}
