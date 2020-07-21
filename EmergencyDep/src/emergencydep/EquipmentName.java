package emergencydep;

public class EquipmentName {
    private int value;
    
    public final static EquipmentName Plaster = new EquipmentName(0);
    public final static EquipmentName XRayMachine = new EquipmentName(1);
    public final static EquipmentName SpineBoard = new EquipmentName(2);
    public final static EquipmentName TrolleyBed = new EquipmentName(3);
    public final static EquipmentName Wheelchair = new EquipmentName(4);
    public final static EquipmentName Ultrasound = new EquipmentName(5);
    public final static EquipmentName Defibrillator = new EquipmentName(6);
    public final static EquipmentName Oxygen = new EquipmentName(7);
    public final static EquipmentName ECG = new EquipmentName(8);
    
    
    public EquipmentName(int value) {
        this.value = value;
    }
    
    public boolean equals(Object condition) {
        EquipmentName c = (EquipmentName) condition;
        return c.value == value;
    }
    
    public String toString() {
        switch(value) {
            case 0: return "Plaster";
            case 1: return "XRayMachine";
            case 2: return "SpineBoard";
            case 3: return "TrolleyBed";
            case 4: return "Wheelchair";
            case 5: return "Ultrasound";
            case 6: return "Defibrillator";
            case 7: return "Oxygen";
            default: return "ECG";
        }
    }
}
