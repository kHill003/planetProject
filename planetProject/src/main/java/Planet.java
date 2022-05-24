

public class Planet {

    private String planetName;
    private int planetSize;

    public Planet(String planetName, int planetSize) {
        this.planetName = planetName;
        this.planetSize = planetSize;
    }

    public String getPlanetNameName() {
        return this.planetName;
    }

    public int getPlanetSize() {
        return this.planetSize;
    }

    //the way the below function works is that the %s is a holder for this.planetname;
    //it will output whatever is the second argueent.
    public String explode() {
        String output = String.format("Boom %s has exploded", this.planetName);
        return output;
    }


}