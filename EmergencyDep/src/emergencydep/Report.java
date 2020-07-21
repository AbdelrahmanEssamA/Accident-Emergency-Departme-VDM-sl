package emergencydep;

public class Report {
    private VDMSequence patientsList;
    private VDMSequence staffList;
    private VDMSequence consultantsList;
    private VDMSet roomsList;
    private VDMSet equipList;

    public Report(VDMSequence patientsList, VDMSequence staffList, VDMSequence consultantsList, VDMSet roomsList, VDMSet equipList) {
        this.patientsList = patientsList;
        this.staffList = staffList;
        this.consultantsList = consultantsList;
        this.roomsList = roomsList;
        this.equipList = equipList;
    }

    public VDMSequence getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(VDMSequence patientsList) {
        this.patientsList = patientsList;
    }

    public VDMSequence getStaffList() {
        return staffList;
    }

    public void setStaffList(VDMSequence staffList) {
        this.staffList = staffList;
    }

    public VDMSequence getConsultantsList() {
        return consultantsList;
    }

    public void setConsultantsList(VDMSequence consultantsList) {
        this.consultantsList = consultantsList;
    }

    public VDMSet getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(VDMSet roomsList) {
        this.roomsList = roomsList;
    }

    public VDMSet getEquipList() {
        return equipList;
    }

    public void setEquipList(VDMSet equipList) {
        this.equipList = equipList;
    }
    
    
}
