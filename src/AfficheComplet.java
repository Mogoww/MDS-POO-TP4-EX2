import java.util.Observer;

public class AfficheComplet implements Observer {
    public void update(Observable o, Object obj) {
        if(o instanceof Gps) {
            Gps gps = (Gps) o;
            System.out.println("Position : " + gps.getPosition() + " - Precision : " + gps.getPrecision());
        }
    }
}
