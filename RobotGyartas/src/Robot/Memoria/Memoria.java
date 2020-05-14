
package Robot.Memoria;

/**
 *
 * @author Dani
 */
public class Memoria {
    private MemoriaTipus tipus;
    public MemoriaTipus getMemoria(){
        return tipus;
    }
    public void setMemoriaTipus(MemoriaTipus tipus){
        this.tipus = tipus;
    }
    
    private int meret;
    public int getmeret(){
        return meret;
    }
    public void setmeret(int meret){
        this.meret = meret;
    }
    
    public Memoria(MemoriaTipus tipus, int meret){
        this.meret = meret;
        this.tipus = tipus;
    }
}
