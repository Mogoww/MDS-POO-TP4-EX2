public interface Observable {
    public void addObservateur(Observateur o);
    public void removeObservateur(Observateur o);
    public void notifyObservateurs();
}
