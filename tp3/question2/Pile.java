package question2;

import question1.PilePleineException;
import question1.PileVideException;

/**
 * A remplacer en partie par votre classe Pile de la question 1.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile implements PileI {

    private Object[] zone;
    private int ptr;

    public Pile(int taille) {
        if(taille <=0) 
            taille = CAPACITE_PAR_DEFAUT;
        this.zone=  new Object[taille];
        this.ptr=0;
        
        // traiter le cas <=0
        // a completer
    }

    public Pile() {
        this(CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
        // a completer
        if(estPleine())
            throw new PilePleineException();
        this.zone[this.ptr]=o;
        this.ptr++;
    }

    public Object depiler() throws PileVideException {
        // a completer
        if(estVide()) 
            throw new PileVideException();
            this.ptr--;

        return this.zone[this.ptr];
    }

    public Object sommet() throws PileVideException {
        // a completer
        if(estVide())
            throw new PileVideException();
        
        return this.zone[this.ptr-1];
        
    }

    public int capacite() {
        // a completer
        return this.zone.length;
    }

    public int taille() {
        // a completer
        return this.ptr;
    }

    public boolean estVide() {
        // a completer
        return this.ptr==0;
    }

    public boolean estPleine() {
        // a completer
        return this.ptr ==capacite();
    }

    public boolean equals(Object o) {
        // a completer
          for(int i=ptr-1;i>=0;i--){
            if(this.zone[i]!= o)
                return false;
        }
        return true;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        // a completer
        StringBuffer sb= new StringBuffer("[");
        for(int i=ptr-1;i>=0;i--){
            sb.append(this.zone[i]);
            if(i>0)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}