package bo;

public class Lieu {
    private int id;
    private String nom;
    private String rue;
    private float latitude;
    private float longitude;

    public Lieu( String nom, String rue, float latitude, float longitude) {
        this.nom = nom;
        this.rue = rue;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
