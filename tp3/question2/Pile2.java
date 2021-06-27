package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2 implements PileI {
    /** par delegation : utilisation de la class Stack */
    private Stack<Object> stk;

    /** la capacite de la pile */
    private int capacite;

    /**
     * Creation d'une pile.
     * 
     * @param taille
     *            la taille de la pile, la taille doit etre > 0
     */
    public Pile2(int taille) {
        // prevoir le cas <=0
        // a completer
         if(taille <=0) 
            taille = CAPACITE_PAR_DEFAUT;
        
        stk = new Stack<Object>();
        stk.setSize(taille);
    }

    // constructeur fourni
    public Pile2() {
        this(0);
    }

    public void empiler(Object o) throws PilePleineException {
        // a completer
        if(estPleine())
            throw new PilePleineException();
        stk.push(o);
    }

    public Object depiler() throws PileVideException {
        // a completer
          if(estVide())
            throw new PileVideException();
        return stk.pop();
    }

    public Object sommet() throws PileVideException {
        // a completer
         if(estVide())
            throw new PileVideException();
        return stk.peek();
    }

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est vide, faux autrement
     */
    public boolean estVide() {
        // a completer
        for(Object v :stk){
         if(v!=null){
             return false;
        }else {
            return true;
        }
       }
        return true;
    }

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est pleine, faux autrement
     */
    public boolean estPleine() {
        // a completer
        if(stk.lastElement()!=null) 
            return true;
        return false;
    }

    /**
     * Retourne une representation en String d'une pile, contenant la
     * representation en String de chaque element.
     * 
     * @return une representation en String d'une pile
     */
    public String toString() {
        String s = "[";
        // a completer
       for(Object v :stk){
         if(v!=null){
               s= s+v.toString();
               if(v!=stk.lastElement()) s=s+",";
        }
       }
        return s + "]";
    }

    public boolean equals(Object o) {
        // a completer
        for(Object v :stk){
            
         if(v!=null){
              
              // if(v!=stk.lastElement()) s=s+",";
        }
       }
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    /**
     * Retourne le nombre d'element d'une pile.
     * 
     * @return le nombre d'element
     */
    public int taille() {
        // a completer
        return 0;
    }

    /**
     * Retourne la capacite de cette pile.
     * 
     * @return le nombre d'element
     */
    public int capacite() {
        // a completer
        return 0;
    }

} // Pile2.java
