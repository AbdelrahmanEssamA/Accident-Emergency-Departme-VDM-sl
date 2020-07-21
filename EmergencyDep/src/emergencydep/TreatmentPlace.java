package emergencydep;

public class TreatmentPlace {
    private int value;
    
    public final static TreatmentPlace ChildWard = new TreatmentPlace(0);
    public final static TreatmentPlace AdultWard = new TreatmentPlace(1);
    public final static TreatmentPlace Home = new TreatmentPlace(2);
    
    public TreatmentPlace(int value) {
        this.value = value;
    }
    
    public boolean equals(Object condition) {
        TreatmentPlace c = (TreatmentPlace) condition;
        return c.value == value;
    }
    
    public String toString() {
        switch(value) {
            case 0: return "ChildWard";
            case 1: return "AdultWard";
            default: return "Home";
        }
    }
}
