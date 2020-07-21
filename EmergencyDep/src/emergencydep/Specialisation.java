package emergencydep;

public class Specialisation {
    private int value;
    
    public final static Specialisation Radiologist = new Specialisation(0);
    public final static Specialisation Orderly = new Specialisation(1);
    public final static Specialisation PlasterSpecialist = new Specialisation(2);
    public final static Specialisation RESUSTeam = new Specialisation(3);
    public final static Specialisation Receptionist = new Specialisation(4);
    
    public Specialisation(int value) {
        this.value = value;
    }
    
    public boolean equals(Object condition) {
        Specialisation c = (Specialisation) condition;
        return c.value == value;
    }
    
    public String toString() {
        switch(value) {
            case 0: return "Radiologist";
            case 1: return "Orderly";
            case 2: return "PlasterSpecialist";
            case 3: return "RESUSTeam";
            default: return "Receptionist";
        }
    }
}
