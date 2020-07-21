package emergencydep;

public class Condition {
    private int value;
    
    public final static Condition Lacerations = new Condition(0);
    public final static Condition Fracture = new Condition(1);
    public final static Condition SpinalInjury = new Condition(2);
    public final static Condition Children = new Condition(3);
    public final static Condition Cardiac = new Condition(4);
    
    
    public Condition(int value) {
        this.value = value;
    }
    
    public boolean equals(Object condition) {
        Condition c = (Condition) condition;
        return c.value == value;
    }
    
    public String toString() {
        switch(value) {
            case 0: return "Lacerations";
            case 1: return "Fracture";
            case 2: return "SpinalInjury";
            case 3: return "Children";
            default: return "Cardiac";
        }
    }
}
