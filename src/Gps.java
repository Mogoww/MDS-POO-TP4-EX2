import java.util.ArrayList;

public class Gps extends Observable{

    //-----------------------------------ATTRIBUTS-----------------------------------
    private String position;
    private int precision;

    //-----------------------------------CONSTRUCTEUR-----------------------------------
    public Gps() {
        this.position = "inconnue";
        this.precision = 0;
    }

    //-----------------------------------METHODES-----------------------------------
    // Notifie tous les observateurs de la liste
    public void notifierObservateurs() {
        setChanged();
         notifyObservers();
    }

    // set Mesure
    public void setMesure(String position, int precision) {
        this.position = position;
        this.precision = precision;
        this.notifierObservateurs();
    }

    // get Position
    public String getPosition() {
        return this.position;
    }

    // get Precision
    public int getPrecision() {
        return this.precision;
    }

}
