package question3;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2<T> implements PileI<T>{
    /** par délégation : utilisation de la class Stack */
    private Stack<T> stk;
    /** la capacité de la pile */
    private int capacite;

    /** Création d'une pile.
     * @param taille la "taille maximale" de la pile, doit être > 0
     */
    public Pile2(int taille){
        // à compléter
              // a completer
         if(taille <=0) 
            taille = CAPACITE_PAR_DEFAUT;
        
        stk = new Stack<T>();
       this.capacite = taille;
    }

    public Pile2(){
        // à compléter
        this(PileI.CAPACITE_PAR_DEFAUT);
    }

    public void empiler(T o) throws PilePleineException{
        // à compléter
         if(estPleine())
            throw new PilePleineException();
        stk.push(o);
    }

    public T depiler() throws PileVideException{
        // à compléter
            if(estVide())
            throw new PileVideException();
        return stk.pop();
    }

    public T sommet() throws PileVideException{
        // à compléter
          if(estVide())
            throw new PileVideException();
        return stk.peek();
    }

    // recopier ici toutes les autres méthodes
    // qui ne sont pas modifiées en fonction
    // du type des éléments de la pile
 public boolean estVide() {
        // a completer
       return this.stk.empty();
    }

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est pleine, faux autrement
     */
    public boolean estPleine() {
        // a completer
        return this.stk.size()==this.capacite;
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
       if(this==o)
            return true;
            
        if(!(o instanceof Pile2))
            return false;
        
        Pile2 p1 = (Pile2) o;
        if(p1.taille() == this.taille() && p1.capacite()==this.capacite()){
            boolean sontEgale=false;
            for(int i=stk.size() -1;i>=0;i--){
                Object tmp =this.stk.get(i);
                boolean existe=false;
                for(int j =this.stk.size()-1;j>=0;j--){
                     if(tmp==p1.stk.get(i)){
                         existe=true;
                    }
                }
                if(existe) 
                    sontEgale=true;
                else 
                    return false;
                    
            }
            return true;
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
        return this.stk.size();
    }

    /**
     * Retourne la capacite de cette pile.
     * 
     * @return le nombre d'element
     */
    public int capacite() {
        // a completer
        return this.capacite;
    }
} // Pile2