// Rezervare
public class Rezervare {
    private boolean locLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPersonalizata;
    private String genMuzica;

    // Constr
    private Rezervare(RezervareBuilder builder) {
        this.locLaGeam = builder.locLaGeam;
        this.scauneErgonomice = builder.scauneErgonomice;
        this.decorareMasa = builder.decorareMasa;
        this.muzicaAmbientalaPersonalizata = builder.muzicaAmbientalaPersonalizata;
        this.genMuzica = builder.genMuzica;
    }

    // Builder
    public static class RezervareBuilder {
        private boolean locLaGeam = false;
        private boolean scauneErgonomice = false;
        private boolean decorareMasa = false;
        private boolean muzicaAmbientalaPersonalizata = false;
        private String genMuzica = "Default";

        public RezervareBuilder setLocLaGeam(boolean locLaGeam) {
            this.locLaGeam = locLaGeam;
            return this;
        }

        public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }

        public RezervareBuilder setGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        public Rezervare build() {
            return new Rezervare(this);
        }
    }
}
