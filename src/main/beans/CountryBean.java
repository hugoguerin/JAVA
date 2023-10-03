package main.beans;

public class CountryBean {


    public static void main(String[] args) {
        CountryBean test = new CountryBean("toto", 40, 150);
        System.out.println(test.name);
        System.out.println(test.population);
        System.out.println(test.area);
    }

    // ATTRIBUTS
    private String name;
    private double population;
    private long area;


    // CONSTRUCTEURS
    public CountryBean(String name, double population, long area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public CountryBean(String name) {

        this(name, 1_000, 10_000);
//
    }

    public CountryBean() {

        this("SansNom", 1000, 10_000);
//        name = "SansNom";
//        population = 1_000;
//        area = 10_000;
    }

    // ACCESSEURS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }
}

