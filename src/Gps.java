import java.util.ArrayList;

public class Gps implements Observable{

    //-----------------------------------ATTRIBUTS-----------------------------------
    private String position;
    private int precision;
    private ArrayList observateurs;

    //-----------------------------------CONSTRUCTEUR-----------------------------------
    public Gps() {
        this.position = "inconnue";
        this.precision = 0;
        this.observateurs = new ArrayList();
    }

    //-----------------------------------METHODES-----------------------------------
    // Ajoute un observateur à la liste
    public void addObservateur(Observateur o) {
        this.observateurs.add(o);
    }

    // Supprime un observateur de la liste
    public void removeObservateur(Observateur o) {
        this.observateurs.remove(o);
    }

    // Notifie tous les observateurs de la liste
    public void notifyObservateurs() {
        for(int i=0; i<this.observateurs.size(); i++) {
            Observateur o = (Observateur) this.observateurs.get(i);
            o.actualiser( this);
        }
    }

    // set Mesure
    public void setMesure(String position, int precision) {
        this.position = position;
        this.precision = precision;
        this.notifyObservateurs();
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
