import java.util.concurrent.ExecutionException;
/**
 * Classe de Pile (FIFO)
 * @author Jonah
 */
public class Pile {
    private int[] elements;
    private int nbElements;


    public Pile(int pfTailleMax) {
        this.elements = new int[pfTailleMax];
        this.nbElements = 0;
    }

    /** Vérifie si une pile est vide ou non
     * @author Jonah
     * @return true si pile vide, false si pile non vide
     */
    public boolean estVide() {
        if (nbElements==0) {
            return true;
        } else {
            return false;
        }
    }

    /** Vérifie si une pile est pleine ou non
     * @author Jonah
     * @return true si pile pleine, false si pile non pleine
     */
    public boolean estPlein() {
        if (this.nbElements == this.elements.length) {
            return true;
        } else {
            return false;
        }
    }

    /**Ajoute un élement dans la pile
     * @author Jonah
     * @param pfElement IN entier à insérer dans la pile
     * @throws Exception si la pile est pleine
     */
    public void empiler(int pfElement) throws Exception{
        if (this.estPlein()) {
            throw new Exception("La pile est pleine, on ne peut rien empiler.");
        }
        this.elements[this.nbElements] = pfElement;
        this.nbElements++;
    }
    
    /**Retourne le dernier élément ajouté a la pile.
     * @author Jonah
     * @return dernier élement ajouté a la pile
     * @throws Exception si la pile est vide
     */
    public int sommet() throws Exception{
        if (this.estVide()) {
            throw new Exception("Pile vide, sommet inexistant.");
        }
        return this.elements[this.nbElements-1];
    }

    /**Supprime le dernier élément ajouté à la pile.
     * @author Jonah
     * @returns le derner élément de la pile, après la suppression
     * @throws Exception si la pile est vide.
     */
    public int depiler() throws Exception{
        if (estVide()) {
            throw new Exception("Pile vide, impossible de dépiler.");
        }
        this.nbElements--;
        return this.elements[this.nbElements];
    }

    /**Supprime tous les éléments de la pile
     * @author Jonah
     */
    public void vider() {
        this.nbElements=0;
    }

}
