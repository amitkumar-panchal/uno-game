/**
 * Decidir a estrutura de unocard
 * 
*/
public abstract class UnoCard{
    /**
     *
    */
    public enum Color {        
    
    }

    /**
     *
    */
    public enum Value {        
        
    }

    //private final Color color;
    //private final Value value;

    public UnoCard(final Color color, final Value value){
        this.color = color;
        this.value = value;
    }

    public String toString() { return value.toString() + " " + color.toString();}
}