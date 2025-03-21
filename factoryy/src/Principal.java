public class Principal {
    public static void main(String[] args) {
        Conserva conservaLegume = FabricaDeConserve.creeazaConserva("legume");
        Conserva conservaFructe = FabricaDeConserve.creeazaConserva("fructe");
        Conserva conservaCarne = FabricaDeConserve.creeazaConserva("carne");
        Conserva conservaPeste = FabricaDeConserve.creeazaConserva("peste");

        conservaLegume.descrie();
        conservaFructe.descrie();
        conservaCarne.descrie();
        conservaPeste.descrie();
    }
}