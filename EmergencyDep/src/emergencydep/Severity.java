package emergencydep;

public class Severity {
    private int value;
    
    public final static Severity Minor = new Severity(0);
    public final static Severity Sever = new Severity(1);
    
    
    public Severity(int value) {
        this.value = value;
    }
    
    public boolean equals(Object condition) {
        Severity c = (Severity) condition;
        return c.value == value;
    }
    
    public String toString() {
        switch(value) {
            case 0: return "Minor";
            default: return "Sever";
        }
    }
}
