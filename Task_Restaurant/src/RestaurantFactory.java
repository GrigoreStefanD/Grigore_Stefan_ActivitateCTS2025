public class RestaurantFactory implements FactoryMeniu {
    @Override
    public Supa creareSupa(TipSupa tip) {
        return SupaFactory.creareSupa(tip); // SupaFactory din B.1
    }

    @Override
    public Desert creareDesert(TipDesert tip) {
        switch (tip) {
            case PAPANASI:
                return new Papanasi();
            case CLATITE:
                return new Clatite();
            case CHEESECAKE:
                return new Cheesecake();
            default:
                throw new IllegalArgumentException("desert necunoscut");
        }
    }
}