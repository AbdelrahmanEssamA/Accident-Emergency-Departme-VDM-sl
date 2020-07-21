package emergencydep;

public class Equipment {
    private int id;
    private EquipmentName name;

    public Equipment(int id, EquipmentName name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EquipmentName getName() {
        return name;
    }

    public void setName(EquipmentName name) {
        this.name = name;
    }
    
    
}
