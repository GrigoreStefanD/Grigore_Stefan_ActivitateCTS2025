public class Main {
    public static void main(String[] args) {
        // supe
        Supa supaLegume = SupaFactory.creareSupa(TipSupa.LEGUME);
        supaLegume.pregateste();

        Supa supaCiuperci = SupaFactory.creareSupa(TipSupa.CIUPERCI);
        supaCiuperci.pregateste();

        Supa supaVita = SupaFactory.creareSupa(TipSupa.VITA);
        supaVita.pregateste();

        // rezervare
        Rezervare rezervare = new Rezervare.RezervareBuilder()
                .setLocLaGeam(true)
                .setScauneErgonomice(true)
                .setDecorareMasa(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .setGenMuzica("jazz")
                .build();

        System.out.println("Rez creata cu succes");

        // deserturi
        RestaurantFactory factory = new RestaurantFactory();

        Desert papanasi = factory.creareDesert(TipDesert.PAPANASI);
        papanasi.servire();

        Desert clatite = factory.creareDesert(TipDesert.CLATITE);
        clatite.servire();

        Desert cheesecake = factory.creareDesert(TipDesert.CHEESECAKE);
        cheesecake.servire();
    }
}