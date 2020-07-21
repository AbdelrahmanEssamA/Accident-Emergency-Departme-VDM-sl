package emergencydep;

public class RoomName {
    private int value;
    
    public final static RoomName Consulting = new RoomName(0);
    public final static RoomName Resus = new RoomName(1);
    public final static RoomName Radio = new RoomName(2);
    public final static RoomName Plaster = new RoomName(3);
    public final static RoomName Waiting = new RoomName(4);
    
    public RoomName(int value) {
        this.value = value;
    }
    
    public boolean equals(Object condition) {
        RoomName c = (RoomName) condition;
        return c.value == value;
    }
    
    public String toString() {
        switch(value) {
            case 0: return "Consulting";
            case 1: return "Resus";
            case 2: return "Radio";
            case 3: return "Plaster";
            default: return "Waiting";
        }
    }
}
