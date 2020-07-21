package emergencydep;

import java.util.Enumeration;

public class AESystem implements InvariantCheck {

    private VDMSequence Patients;
    private VDMSequence StaffList;
    private VDMSequence Consultants;
    private VDMSet Rooms;
    private WaitingList Waitinglist;
    private String hospital; 
    public AESystem(VDMSequence AllPatients, VDMSequence AllStaff,
        VDMSequence AllConsultants,VDMSet AllRooms) {
        Patients = AllPatients;
        StaffList = AllStaff;
        Consultants = AllConsultants;
        Rooms = AllRooms;
        Waitinglist = new WaitingList();
        
        VDM.invTest(this);
    }
    
    @Override
    public boolean inv() {
        return true;
    }
    
    //Operations
    
    //ADD
    public void addPatient(Patient p) throws VDMException{
        VDM.preTest(true);
        Patients = Patients.concat(new VDMSequence(p));
        System.out.println(Patients);
        VDM.invTest(this);
    }
    
    public void addStaff(Staff s) throws VDMException{
        VDM.preTest(true);
        StaffList = StaffList.concat(new VDMSequence(s));
        System.out.println(StaffList);
        
    }
    
    public void addConsultant(Consultant c) throws VDMException{
        VDM.preTest(true);
        Consultants = Consultants.concat(new VDMSequence(c));
        System.out.println(Consultants);
        VDM.invTest(this);
    }
    
    public void addRoom(Room r) throws VDMException{
        VDM.preTest(true);
        Rooms = Rooms.union(new VDMSet(r));
        System.out.println(Rooms);
        VDM.invTest(this);
    }
    
    public void addPatientTowaiting(Patient p) throws VDMException{
        VDM.preTest(true);
        Waitinglist.setPatientsList(Waitinglist.getPatientsList().concat(new VDMSequence(p)));
        System.out.println(Waitinglist.getPatientsList());
        VDM.invTest(this);
    }
    
    //remove from waiting list
    public void removeFromWaiting(int pID){
         VDM.preTest(true);
         VDMSequence newPatients = new VDMSequence();
         int count =1;
         while( count < Waitinglist.getPatientsList().len()){
             if(((Patient) Waitinglist.getPatientsList().index(count)).getId() != pID){
                 newPatients = newPatients.concat(new VDMSequence(Waitinglist.getPatientsList().index(count)));
                 
             }
            count++;
         }
         Waitinglist.setPatientsList(newPatients);
        
         System.out.println(Waitinglist.getPatientsList());
         VDM.invTest(this);
         
    }
    
    //SEND TO TREATMENT PLACE
    public void sendToWard(int pID, boolean home) throws VDMException{
        VDM.preTest(true);
        int count = 1;
        
        
        while(count < Patients.len()){
             
            if( ((Patient)Patients.index(count)).getId() == pID){
                if(!home){
                    if(((Patient)Patients.index(count)).getAge() > 17){
                        ((Patient)Patients.index(count)).setTreatmentPlace(TreatmentPlace.AdultWard);
                        System.out.println((Patient)Patients.index(count));
                    }
                    else if (((Patient)Patients.index(count)).getAge() < 18){
                        ((Patient)Patients.index(count)).setTreatmentPlace(TreatmentPlace.ChildWard);
                        System.out.println((Patient)Patients.index(count));
                    }
                }
                else if (home){
                    ((Patient)Patients.index(count)).setTreatmentPlace(TreatmentPlace.Home);
                    System.out.println((Patient)Patients.index(count));
                }
                
            }
            count++;
        }
                
        
    } 
    
    //Change the Status of the patient True -> is served False -> not served
    public void changePatientStatus(int pID, boolean status ){
        VDM.preTest(true);
        int  count =1;
        while (count < Patients.len()){
             if( ((Patient)Patients.index(count)).getId() == pID){
                  ((Patient)Patients.index(count)).setIsServed(status);
                  break;
             }
             count++;
        }
        System.out.println(((Patient)Patients.index(count)));
        VDM.invTest(this);
    }
    
    //set Condition
    public void setCondition(int pID, Condition c) {
        VDM.preTest(true);
        int count =1;
        while (count < Patients.len()){
            if( ((Patient)Patients.index(count)).getId() == pID){
                ((Patient)Patients.index(count)).getTreatmentCourse().setCondition(c);
                break;
            }
          count++;
        }
        System.out.println(((Patient)Patients.index(count)).getTreatmentCourse());
        VDM.invTest(this);
    }
    
    //add to the treatment list
    public void addTreatment(int pID, Treatment t){
        VDM.preTest(true);
        int count = 1;
        while (count < Patients.len()){
             if( ((Patient)Patients.index(count)).getId() == pID){
                 
                 ((Patient)Patients.index(count)).getTreatmentCourse().setTratmentLitst(((Patient)Patients.index(count)).getTreatmentCourse().getTratmentLitst().union(new VDMSet(t)));
                 break;
             }
             count++;            
        }
        System.out.println(((Patient)Patients.index(count)));
        VDM.invTest(this);
        
    }
    
    //get tratment List
    public void getTreatmentCourse(int pID){
        VDM.preTest(true);
        int count = 1;
        while (count < Patients.len()){
            if( ((Patient)Patients.index(count)).getId() == pID){
               
                System.out.println( ((Patient)Patients.index(count)).getTreatmentCourse().getTratmentLitst());        
                break;
            }
            count ++;
        }
        VDM.invTest(this);
    }

    //set patient severity
    public void addSevirety(int pID, Severity s){
        VDM.preTest(true);
        int count = 1;
        while (count < Patients.len()){
             if( ((Patient)Patients.index(count)).getId() == pID){
                  ((Patient)Patients.index(count)).getTreatmentCourse().setSevirity(s);
                  System.out.println( ((Patient)Patients.index(count)));
                 
             }
          count ++;
        }
         VDM.invTest(this);
        
    }
    
    //get severity
    public void getSevirety(int pID){
        VDM.preTest(true);
        int count = 1;
        while (count < Patients.len()){
            if( ((Patient)Patients.index(count)).getId() == pID){
                  System.out.println( ((Patient)Patients.index(count)).getTreatmentCourse().getSevirity());
                  
            }
            count++;
        }
        
        VDM.invTest(this);
        
    }
    
    //getStaffAvailability
    public void setStaffAvailability(int sID, boolean a){
        VDM.preTest(true);
        int count =1;
        while(count < StaffList.len()){
            if(((Staff)StaffList.index(count)).getId() == sID){
                ((Staff)StaffList.index(count)).setAvailability(a);
                System.out.println(((Staff)StaffList.index(count)));
            }
            count++;
        }
        VDM.invTest(this);
    }
    
    //setStaffAvailaibility
    public void getStaffAvailability(int sID){
        VDM.preTest(true);
        int count =1;
        while(count < StaffList.len()){
            if(((Staff)StaffList.index(count)).getId() == sID){
                
                System.out.println(((Staff)StaffList.index(count)).isAvailability());
            }
            count++;
        }
        VDM.invTest(this);
    }
    
    // assign patient to consultant
    public void assignPatientToConsultant(int pID, int consID){
        VDM.preTest(true);
        int count =1;
        Patient p =  new Patient();
         while (count < Patients.len()){
            if( ((Patient)Patients.index(count)).getId() == pID){
                p = ((Patient)Patients.index(count));
            }
            count ++;
         }
         count = 1;
         while (count < Consultants.len()){
             if( ((Consultant)Consultants.index(count)).getId() == consID){
                 
                 ((Consultant)Consultants.index(count)).setCurrentPatient(p);
                 ((Consultant)Consultants.index(count)).setAvailability(false);
                 System.out.println(((Consultant)Consultants.index(count)));
             }
             count++;
         }
          VDM.invTest(this);
    }
    
    // get first Avilable staff
    public void getFirstAvilableStaff(Specialisation s){
        VDM.preTest(true);
        int count =1;
        while(count < StaffList.len()){
           if(((Staff)StaffList.index(count)).getSpecialisation() == s && ((Staff)StaffList.index(count)).isAvailability() == true){
                System.out.println(((Staff)StaffList.index(count)));
                break;
           }
            count ++;
        }   
        VDM.invTest(this);
    }
    
    // get first avliable cons
    public void getFirstAvilableCons( ){
         VDM.preTest(true);
         int count =1;
         while(count < Consultants.len()){
             if(((Consultant)Consultants.index(count)).isAvailability() == true){
                 System.out.println(((Consultant)Consultants.index(count)));
                 break;
             }
             count ++;
         }
        VDM.invTest(this);
    }
    
    // get Equipment at certain room
    public void getEquipment(int roomID){
        
    }
    
    // interrupt consultant
    public void  interuptConsultant(){
        VDM.preTest(true);
         int count =1;
         while(count < Consultants.len()){
              if(((Consultant)Consultants.index(count)).getCurrentPatient().getPriority()<3){
                  ((Consultant)Consultants.index(count)).setAvailability(true);
                  addPatientTowaiting(((Consultant)Consultants.index(count)).getCurrentPatient());
                  ((Consultant)Consultants.index(count)).setCurrentPatient(null);
                  break;
              }
             count++;
         }
        VDM.invTest(this);
    }
    
    // setPriority
    public void serPriority(int pID, int priority){
        VDM.preTest(true);
        int  count =1;
        while (count < Patients.len()){
             if( ((Patient)Patients.index(count)).getId() == pID){
                  ((Patient)Patients.index(count)).setPriority(priority);
                  break;
             }
             count++;
        }
        System.out.println(((Patient)Patients.index(count)));
        VDM.invTest(this);
    }
    
    // send 3 consultants to resus
    public void addConsultantsToResus(int roomID){
        VDM.preTest(true);
        int count =1 , consNum =0;
        Room r = new Room();
        while(count < Consultants.len()){
            if(((Consultant)Consultants.index(count)).isAvailability() == true && consNum <3){
                r = getRoomById(roomID);
                removeRoom(roomID);
                r.setConsultantInCharge(r.getConsultantInCharge().union(new VDMSet(((Consultant)Consultants.index(count)))));
                addRoom(r);
                consNum++;
                
            }
            count++;
        }
         VDM.invTest(this);
    } 
    
    //add Equipment to room
    public void addEquipmentToRoom(int roomID, Equipment e){
        VDM.preTest(true);
        Room r = getRoomById(roomID);
        Rooms.difference(new VDMSet(r));
        r.setEquipment(r.getEquipment().union(new VDMSet(e)));
        Rooms.union(new VDMSet(r));
        VDM.invTest(this);
       
    }
    
    //remove Equipment
    public void removeEquipmentFromRoom(int roomID, Equipment e){
        VDM.preTest(true);
        Room r = getRoomById(roomID);
        Rooms.difference(new VDMSet(r));
        r.setEquipment(r.getEquipment().difference(new VDMSet(e)));
        Rooms.union(new VDMSet(r));
        VDM.invTest(this);
        
    }
    
    //set rooom avilable or not
    public void setRoomAvailibility(int roomID, boolean a){
        VDM.preTest(true);
        Room r = getRoomById(roomID);
        Rooms.difference(new VDMSet(r));
        r.setAvailablity(a);
        Rooms.union(new VDMSet(r));
        System.out.println(r.isAvailablity());
        VDM.invTest(this);
    }
    
    //get room avilable or not
    public void getRoomAvailability(int roomID){
        VDM.preTest(true);
        Room r = getRoomById(roomID);
        System.out.println(r.isAvailablity());
        VDM.invTest(this);
    }

    //assign staff to room
    public void addStafftoRoom(int roomID, Staff s){
        VDM.preTest(true);
        Room r = getRoomById(roomID);
        Rooms.difference(new VDMSet(r));
        r.setStaffInCharge(r.getStaffInCharge().union(new VDMSet(s)) );
        Rooms.union(new VDMSet(r));
        VDM.invTest(this);
    }
    
    // assign consultatnt to room
    public void addPatientToRoom(int roomID, Patient p){
        VDM.preTest(true);
        Room r = getRoomById(roomID);
        Rooms.difference(new VDMSet(r));
        r.setPatient(p);
        Rooms.union(new VDMSet(r));
        VDM.invTest(this);
    }
    
    //all patient list
    public void getPatientList(){
        System.out.println(Patients);
    }
    
    //get number of all patient
    public int getNumberOfPatient(){
        System.out.println(Patients.len());
        return Patients.len();
     
    }
    
    // get Consultant past Patients
    public void getConsultatPatients(int cID){
        
        VDM.preTest(true);
        int count =1;
        while(count < Consultants.len()){
            if(((Consultant)Consultants.index(count)).getId()== cID){
                System.out.println(((Consultant)Consultants.index(count)).getTreatedPatients());
                
            }
        }
        
    }
    
    //remove patient from room
    public void removePatientFromRoom(int rID){
        VDM.preTest(true);
         VDMSequence newPatients = new VDMSequence();
         int count =1;
         Room r = getRoomById(rID);
         Rooms = Rooms.difference(new VDMSet(r));
         r.setPatient(null);
         Rooms = Rooms.union(new VDMSet(r));
         VDM.invTest(this);
    }
    
    
   // omarrr
    
    public void removePatient(int id) {
        int count = 1;
        VDMSequence newPatients = new VDMSequence();
        
        while (count < Patients.len()) {
            Patient temp = (Patient) Patients.index(count);
            if (temp.getId() != id) {
                newPatients = newPatients.concat(new VDMSequence(temp));
            }
        }
        
        VDM.invTest(this);
    }
    
    public void removeStaff(int id) {
        int count = 1;
        VDMSequence newStaffList = new VDMSequence();
        
        while (count < StaffList.len()) {
            Staff temp = (Staff) StaffList.index(count);
            if (temp.getId() != id) {
                newStaffList = newStaffList.concat(new VDMSequence(temp));
            }
        }
        
        VDM.invTest(this);
    }
    
    public void removeConsultant(int id) {
        int count = 1;
        VDMSequence newConsultants = new VDMSequence();
        
        while (count < Consultants.len()) {
            Consultant temp = (Consultant) Consultants.index(count);
            if (temp.getId() != id) {
                newConsultants = newConsultants.concat(new VDMSequence(temp));
            }
        }
        
        VDM.invTest(this);
    }
    
    public void removeRoom(int id) {
        for (int i = 1; i < Rooms.theSet.size(); i++) {
            Room temp = (Room) Rooms.theSet.get(i);
            if (temp.getId() == id)
                Rooms = Rooms.difference(new VDMSet(temp));
        }
        VDM.invTest(this);
    }
    
    public Patient getPatientById(int patientID) {
        VDM.preTest(true);
        Patient temp_Patient = new Patient();
        for (int i = 1; i < Patients.len(); i++) {
            Patient p = (Patient) Patients.index(i);
            if (p.getId() == patientID) {
                temp_Patient = p;
                System.out.println(temp_Patient);
                return temp_Patient;
            }
        }
        VDM.invTest(this);
        return null;
        
    }
    
    public Staff getStaffById(int staffID) {
        Staff temp_Staff = new Staff();
        for (int i = 1; i < StaffList.len(); i++) {
            Staff s = (Staff) StaffList.index(i);
            if (s.getId() == staffID) {
                temp_Staff = s;
                
                System.out.println(temp_Staff);
                return temp_Staff;
            }
        }
        VDM.invTest(this);
        return null;
    }
    
    public Consultant getConsultantById(int ConsultantID) {
        Consultant temp_Consultant = new Consultant();
        for (int i = 1; i < Consultants.len(); i++) {
            Consultant c = (Consultant) Consultants.index(i);
            if (c.getId() == ConsultantID) {
                temp_Consultant = c;
                System.out.println(temp_Consultant);
                return temp_Consultant;
            }
        }
        VDM.invTest(this);
        return null;
    }
    
    public Room getRoomById(int id) {
        for (int i = 1; i < Rooms.theSet.size(); i++) {
            Room temp = (Room)Rooms.theSet.get(i);
            if (temp.getId() == id) {
                System.out.println(temp);
                return temp;
            }
        }
        VDM.invTest(this);
        return null;
    }
    
    public Patient getCurrentPatientOfConsultant(int id) {
        int count = 1;
        while (count < Consultants.len()) {
            Consultant temp = (Consultant) Consultants.index(count);
            if (temp.getId() == id)
                return temp.getCurrentPatient();
            count++;
        }
        VDM.invTest(this);
        return null;
    }
    
    public Patient getCurrentPatientOfStaff(int id) {
        int count = 1;
        
        while (count < StaffList.len()) {
            Staff temp = (Staff) StaffList.index(count);
            if (temp.getId() == id) 
                return temp.getCurrentPatient();
            count++;
        }
        VDM.invTest(this);
        return null;
    }
    
    public Consultant getAssignedConsultant(int id) {
        int count = 1;
        while (count < Consultants.len()) {
            Consultant temp = (Consultant) Consultants.index(count);
            if (temp.getCurrentPatient().getId() == id)
                return temp;
            count++;
        }
        VDM.invTest(this);
        return null;
    }
    
    public Staff getAssignedStaff(int id) {
        int count = 1;
        
        while (count < StaffList.len()) {
            Staff temp = (Staff) StaffList.index(count);
            if (temp.getCurrentPatient().getId() == id)
                return temp;
            count++;
        }
        VDM.invTest(this);
        return null;
    }
    
    public Room locateStaff(int id) {
        for (int i = 1; i < Rooms.theSet.size(); i++) {
            Room temp = (Room)Rooms.theSet.get(i);
            if (temp.getStaffInCharge() != null) {
                for (int j = 1; j < temp.getStaffInCharge().theSet.size(); j++) {
                    Staff s = (Staff) temp.getStaffInCharge().theSet.get(j);
                    if (s.getId() == id)
                        return temp;
                }
            }
        }
        VDM.invTest(this);
        return null;
    }
    
    public Room locateConsultant(int id) {
        for (int i = 1; i < Rooms.theSet.size(); i++) {
            Room temp = (Room)Rooms.theSet.get(i);
            if (temp.getConsultantInCharge() != null) {
                for (int j = 1; j < temp.getConsultantInCharge().theSet.size(); j++) {
                    Consultant c = (Consultant) temp.getConsultantInCharge().theSet.get(j);
                    if (c.getId() == id)
                        return temp;
                }
            }
        }
        VDM.invTest(this);
        return null;
    }
    
    public Room locatePatient(int id) {
        for (int i = 0; i < Rooms.theSet.size(); i++) {
            Room temp = (Room)Rooms.theSet.get(i);
            if (temp.getPatient().getId() == id) 
                return temp;
        }
        VDM.invTest(this);
        return null;
    }
    
    public TreatmentPlace decideAgeCategory(int a) {
        VDM.invTest(this);
        if (a > 18)
            return new TreatmentPlace(1);
        else return new TreatmentPlace(0);
    }
    
}
