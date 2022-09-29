package test;

public class Script3 {
    public static void main (String[] args) {

        Cours cours1 = new Cours();
        Cours cours2 = new Cours();
        System.out.println("essai");

        cours1.drop();

        cours1.nom = "Versionning Git";
        cours2.nom = "Hébergement Web";

        System.out.println("le cours 1 est " +cours1.nom);
        System.out.println("le cours 2 est " +cours2.nom);
    }
}
