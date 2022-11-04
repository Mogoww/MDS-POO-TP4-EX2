public class AfficheComplet implements Observateur{
    public void actualiser(Observable o) {
        if(o instanceof Gps) {
            Gps gps = (Gps) o;
            System.out.println("Position : " + gps.getPosition() +" Présision : " + gps.getPrecision() );
        }
    }
}
