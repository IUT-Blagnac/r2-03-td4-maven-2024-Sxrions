import java.util.concurrent.ExecutionException;

public class Pile {
    private int[] elements;
    private int nbElements;


    public Pile(int pfTailleMax) {
        this.elements = new int[pfTailleMax];
        this.nbElements = 0;
    }

    public boolean estVide() {
        if (nbElements==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estPlein() {
        if (this.nbElements == this.elements.length) {
            return true;
        } else {
            return false;
        }
    }

    public void empiler(int pfElement) throws Exception{
        if (this.estPlein()) {
            throw new Exception("La pile est pleine, on ne peut rien empiler.");
        }
        this.elements[this.nbElements] = pfElement;
        this.nbElements++;
    }

    public int sommet() throws Exception{
        if (this.estVide()) {
            throw new Exception("Pile vide, sommet inexistant.");
        }
        return this.elements[this.nbElements-1];
    }

    public int depiler() throws Exception{
        if (estVide()) {
            throw new Exception("Pile vide, impossible de dépiler.");
        }
        this.nbElements--;
        return this.elements[this.nbElements];
    }

    public void vider() {
        this.nbElements=0;
    }

}
