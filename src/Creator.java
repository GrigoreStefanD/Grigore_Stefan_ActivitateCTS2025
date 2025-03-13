public abstract class Creator {
    public abstract Produs factoryMethod();

    public void faCeva() {
        Produs produs = factoryMethod();
        produs.arataTipul();
    }
}
