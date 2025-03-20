class Paine {
    private String tipFaina;
    private boolean sare;
    private boolean seminte;
    private String umplutura;


    public void setTipFaina(String tipFaina) {
        this.tipFaina = tipFaina;
    }

    public void setSare(boolean sare) {
        this.sare = sare;
    }

    public void setSeminte(boolean seminte) {
        this.seminte = seminte;
    }

    public void setUmplutura(String umplutura) {
        this.umplutura = umplutura;
    }



    public String getTipFaina() {
        return tipFaina;
    }

    public boolean isSare() {
        return sare;
    }

    public boolean isSeminte() {
        return seminte;
    }

    public String getUmplutura() {
        return umplutura;
    }

    private Paine(Builder builder) {
        this.tipFaina = builder.tipFaina;
        this.sare = builder.sare;
        this.seminte = builder.seminte;
        this.umplutura = builder.umplutura;
    }



    public static class Builder {
        private String tipFaina;
        private boolean sare;
        private boolean seminte;
        private String umplutura;

        public Builder(String tipFaina) {
            this.tipFaina = tipFaina;
        }

        public Builder adaugaSare(boolean sare) {
            this.sare = sare;
            return this;
        }

        public Builder adaugaSeminte(boolean seminte) {
            this.seminte = seminte;
            return this;
        }

        public Builder adaugaUmplutura(String umplutura) {
            this.umplutura = umplutura;
            return this;
        }

        public Paine build() {
            return new Paine(this);
        }
    }

    @Override
    public String toString() {
        return "paine" + "tipFaina='" + tipFaina + '\'' + " sare=" + sare +
                " seminte=" + seminte +
                " umplutura='" + umplutura + '\''                ;
    }
}