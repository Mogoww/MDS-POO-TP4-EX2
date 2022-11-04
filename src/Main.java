public class Main {
    public static void main(String[] args) {
        // test class
        Gps gps = new Gps();
        AfficheResume afficheResume = new AfficheResume();
        AfficheComplet afficheComplet = new AfficheComplet();
        gps.addObservateur(afficheResume);
        gps.setMesure("vkjndlkjnvkjnv lsd klsdnlnsd", 2);
        gps.addObservateur(afficheComplet);
        gps.setMesure("gok,sl,f,nvsnkfkjznkzresnfksdfn ckvjndfkjnf", 4);

    }
}