package emergencydep;

public class WaitingList {
    private static Staff receptionist;
    private static Room waitingRoom;
    private static VDMSequence patientsList;

    public WaitingList() {
        WaitingList.receptionist = new Staff();
        WaitingList.waitingRoom = new Room();
        WaitingList.patientsList = new VDMSequence();
    }
    
    public  WaitingList(Staff receptionist, Room waitingRoom, VDMSequence patientsList) {
        WaitingList.receptionist = receptionist;
        WaitingList.waitingRoom = waitingRoom;
        WaitingList.patientsList = patientsList;
    }

    public Staff getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Staff receptionist) {
        WaitingList.receptionist = receptionist;
    }

    public Room getWaitingRoom() {
        return waitingRoom;
    }

    public void setWaitingRoom(Room waitingRoom) {
        WaitingList.waitingRoom = waitingRoom;
    }

    public VDMSequence getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(VDMSequence patientsList) {
        WaitingList.patientsList = patientsList;
    }
    
    
}
