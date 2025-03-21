public class FabricaDeConserve {
    public static Conserva creeazaConserva(String tip) {
        if (tip.equalsIgnoreCase("legume")) {
            return new ConservaLegume();
        } else if (tip.equalsIgnoreCase("fructe")) {
            return new ConservaFructe();
        } else if (tip.equalsIgnoreCase("carne")) {
            return new ConservaCarne();
        } else if (tip.equalsIgnoreCase("peste")) {
            return new ConservaPeste();
        } else {
            throw new IllegalArgumentException("conserva lipsa " + tip);
        }
    }
}