public class Brutarie
{
    public static void main(String[] args)
    {
        Paine paineIntegrala = new Paine.Builder("Integrala")
                .adaugaSare(true)
                .adaugaSeminte(true)
                .adaugaUmplutura("Nuca")
                .build();



        Paine paineAlba = new Paine.Builder("Alba")
                .adaugaSare(false)
                .adaugaUmplutura("Ciocolata")
                .build();

        System.out.println(paineIntegrala);
        System.out.println(paineAlba);
    }
}