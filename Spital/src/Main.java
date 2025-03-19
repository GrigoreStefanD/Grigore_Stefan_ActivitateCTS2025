public class Main {
    public static void main(String[] args) {


        Pacient pacient1 = new Pacient.PacientBuilder("Ion Popescu")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .build();



        Pacient pacient2 = new Pacient.PacientBuilder("Maria Ionescu")
                .setPapuciCamera(true)
                .setHalatInterior(true)
                .build();

        Pacient pacient3 = new Pacient.PacientBuilder("Ana Maria")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .setHalatInterior(true)
                .setPapuciCamera(true)
                .build();


        System.out.println("Informatii pacienti:");
        System.out.println(pacient1);
        System.out.println(pacient2);
        System.out.println(pacient3);


        PersonalSpital brancardier = PersonalSpitalFactory.createPersonal(TipPersonal.BRANCARDIER, "Gheorghe Brancardierul");
        PersonalSpital asistent = PersonalSpitalFactory.createPersonal(TipPersonal.ASISTENT, "Elena Asistenta");
        PersonalSpital medic = PersonalSpitalFactory.createPersonal(TipPersonal.MEDIC, "Dr. Andrei Medic");


        System.out.println("\nInformatii personal spital:");
        System.out.println("Brancardier: " + brancardier.getNume());
        System.out.println("Asistent: " + asistent.getNume());
        System.out.println("Medic: " + medic.getNume());
    }
}