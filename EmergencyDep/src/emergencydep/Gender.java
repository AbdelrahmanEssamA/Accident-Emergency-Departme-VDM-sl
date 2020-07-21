package emergencydep;

public class Gender {
    private int value;
    
    public final static Gender Male = new Gender(0);
    public final static Gender Female = new Gender(1);
    
    
    public Gender(int value) {
        this.value = value;
    }
    
    public boolean equals(Object condition) {
        Gender c = (Gender) condition;
        return c.value == value;
    }
    
    public String toString() {
        switch(value) {
            case 0: return "Male";
            default: return "Female";
        }
    }
}
