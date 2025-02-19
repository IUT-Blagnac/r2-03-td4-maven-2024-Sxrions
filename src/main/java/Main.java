//J'ai modifié la ligne 33 de pox.xml "mainclass" pour sélectionner Main.java

public class Main {
    public static void main(String[] args) {
        try {
            Pile jojopile = new Pile(30);

            if (jojopile.estVide()) {
                System.out.println("OLALA LA PILE EST VIDE");
            }

            if (jojopile.estPlein()) {
                System.out.println("PAS OK");
            }

            jojopile.empiler(16);

            int sommet = jojopile.sommet();

            System.out.println(jojopile.depiler());
            if (jojopile.estVide()) {
                System.out.println("Tout va bien si si");
            }

            jojopile.empiler(54);
            jojopile.empiler(16);
            jojopile.empiler(62);

            jojopile.vider();
            if (!jojopile.estVide()) {
                System.out.println("OUH LA NOK");
            }
        } catch (Exception e) {
            System.out.println("Oups");
        }
        

     }
}