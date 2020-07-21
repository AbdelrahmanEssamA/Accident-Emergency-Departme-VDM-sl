package emergencydep;

public class Room {
    private int id;
    private RoomName type;
    private VDMSet equipment;
    private boolean availablity;
    private VDMSet staffInCharge;
    private VDMSet consultantInCharge;
    private Patient patient;

    public Room() {
        this.id = 0;
        this.type = new RoomName(0);
        this.equipment = new VDMSet();
        this.availablity = true;
        this.staffInCharge = new VDMSet();
        this.consultantInCharge = new VDMSet();
        this.patient = new Patient();
    }
    
    public Room(int id, RoomName type, VDMSet equipment, boolean availablity, VDMSet staffInCharge, VDMSet consultantInCharge, Patient patient) {
        this.id = id;
        this.type = type;
        this.equipment = equipment;
        this.availablity = availablity;
        this.staffInCharge = staffInCharge;
        this.consultantInCharge = consultantInCharge;
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoomName getType() {
        return type;
    }

    public void setType(RoomName type) {
        this.type = type;
    }

    public VDMSet getEquipment() {
        return equipment;
    }

    public void setEquipment(VDMSet equipment) {
        this.equipment = equipment;
    }

    public boolean isAvailablity() {
        return availablity;
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }

    public VDMSet getStaffInCharge() {
        return staffInCharge;
    }

    public void setStaffInCharge(VDMSet staffInCharge) {
        this.staffInCharge = staffInCharge;
    }

    public VDMSet getConsultantInCharge() {
        return consultantInCharge;
    }

    public void setConsultantInCharge(VDMSet consultantInCharge) {
        this.consultantInCharge = consultantInCharge;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", type=" + type + ", equipment=" + equipment + ", availablity=" + availablity + ", staffInCharge=" + staffInCharge + ", consultantInCharge=" + consultantInCharge + ", patient=" + patient + '}';
    }
    
    
}
