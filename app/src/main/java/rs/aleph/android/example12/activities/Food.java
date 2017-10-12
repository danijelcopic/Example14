package rs.aleph.android.example12.activities;

public class Food {

    private int id;
    private String slika;
    private String naziv;
    private String opis;
    private int kalorije;
    private double cena;
    private float rejting;


    public Food() {
    }

    public Food(int id, String slika, String name, String opis, int kalorije, double cena, float rejting) {
        this.id = id;
        this.slika = slika;
        this.naziv = name;
        this.opis = opis;
        this.kalorije = kalorije;
        this.cena = cena;
        this.rejting = rejting;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getName() {
        return naziv;
    }

    public void setName(String name) {
        this.naziv = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getKalorije() {
        return kalorije;
    }

    public void setKalorije(int kalorije) {
        this.kalorije = kalorije;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public float getRejting() {
        return rejting;
    }

    public void setRejting(float rejting) {
        this.rejting = rejting;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", slika='" + slika + '\'' +
                ", name='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", kalorije=" + kalorije +
                ", cena=" + cena +
                ", rejting=" + rejting +
                '}';
    }
}
