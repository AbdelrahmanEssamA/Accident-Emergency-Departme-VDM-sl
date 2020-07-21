package emergencydep;

public class Treatment {
    private int value;
    
    public final static Treatment Plaster = new Treatment(0);
    public final static Treatment DischargeHome = new Treatment(1);
    public final static Treatment StitchBandage = new Treatment(2);
    public final static Treatment PlasterCast = new Treatment(3);
    public final static Treatment Medication = new Treatment(4);
    public final static Treatment MoveAdultWard = new Treatment(5);
    public final static Treatment MoveChildrenWard = new Treatment(6);
    public final static Treatment ECG = new Treatment(7);
    public final static Treatment Bed = new Treatment(8);
    public final static Treatment Monitoring = new Treatment(9);
    public final static Treatment RESUS = new Treatment(10);
    
    
    public Treatment(int value) {
        this.value = value;
    }
    
    public boolean equals(Object condition) {
        Treatment c = (Treatment) condition;
        return c.value == value;
    }
    
    public String toString() {
        switch(value) {
            case 0: return "Plaster";
            case 1: return "DischargeHome";
            case 2: return "StitchBandage";
            case 3: return "PlasterCast";
            case 4: return "Medication";
            case 5: return "MoveAdultWard";
            case 6: return "MoveChildrenWard";
            case 7: return "ECG";
            case 8: return "Bed";
            case 9: return "Monitoring";
            default: return "RESUS";
        }
    }
}
