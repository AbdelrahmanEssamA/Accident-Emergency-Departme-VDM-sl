package emergencydep;

public class EmergencyDep {

    public static void main(String[] args) {
        TreatmentSystem treatmentSystem1 = new TreatmentSystem(1, new Condition(0), 1, new Severity(0), new Time(2, 3, 59), new Time(5, 3, 52), 0, new VDMSet(new Treatment(0)));
        TreatmentSystem treatmentSystem2 = new TreatmentSystem(2, new Condition(3), 1, new Severity(0), new Time(4, 6, 10), new Time(5, 3, 52), 0, new VDMSet());
        TreatmentSystem treatmentSystem3 = new TreatmentSystem(3, new Condition(2), 1, new Severity(0), new Time(2, 3, 59), new Time(5, 3, 52), 0, new VDMSet());
        TreatmentSystem treatmentSystem4 = new TreatmentSystem(4, new Condition(1), 1, new Severity(0), new Time(2, 3, 59), new Time(5, 3, 52), 0, new VDMSet());
        TreatmentSystem treatmentSystem5 = new TreatmentSystem(5, new Condition(1), 1, new Severity(0), new Time(2, 3, 59), new Time(5, 3, 52), 0, new VDMSet());
        TreatmentSystem treatmentSystem6 = new TreatmentSystem(6, new Condition(1), 1, new Severity(0), new Time(2, 3, 59), new Time(5, 3, 52), 0, new VDMSet());
        TreatmentSystem treatmentSystem7 = new TreatmentSystem(7, new Condition(0), 1, new Severity(0), new Time(2, 3, 59), new Time(5, 3, 52), 0, new VDMSet());
        TreatmentSystem treatmentSystem8 = new TreatmentSystem(8, new Condition(0), 1, new Severity(0), new Time(2, 3, 59), new Time(5, 3, 52), 0, new VDMSet());
        TreatmentSystem treatmentSystem9 = new TreatmentSystem(9, new Condition(0), 1, new Severity(0), new Time(2, 3, 59), new Time(5, 3, 52), 0, new VDMSet());
        
        VDMSequence AllTreatments = new VDMSequence(new TreatmentSystem [] {treatmentSystem1,treatmentSystem2,treatmentSystem3,treatmentSystem4,treatmentSystem5,treatmentSystem6,treatmentSystem7,treatmentSystem8,treatmentSystem9});
        
       
        
        Patient patient1 = new Patient(1, "Abelrahman   Samy", "01018603222", new Gender(0), 20, "5b,Daher", false, "note-p1", 1, treatmentSystem1, new TreatmentPlace(2));
        Patient patient2 = new Patient(2, "Ayman   Medhat", "01018603222", new Gender(0), 32, "6a,Nasr City", true, "note-p2", 4, treatmentSystem2, null);
        Patient patient3 = new Patient(3, "Hassan   Talaat", "01018603222", new Gender(0), 40, "56g,Giza", false, "note-p3", 3, treatmentSystem3, null);
        Patient patient4 = new Patient(4, "Dina   Shreef", "01018603222", new Gender(1), 51, "4d,Zamalek", false, "note-p4", 2, treatmentSystem4, null);
        Patient patient5 = new Patient(5, "Salma   Motaz", "01018603222", new Gender(1), 21, "13g,Heliples", false, "note-p5", 1, treatmentSystem5, null);
        Patient patient6 = new Patient(6, "Mahmoud   Seif", "01018603222", new Gender(0), 13, "23,Almaza", false, "note-p6", 5, treatmentSystem6, null);
        Patient patient7 = new Patient(7, "Nabil   Sharaf", "01018603222", new Gender(0), 19, "45t,NewCairo", false, "note-p7", 1, treatmentSystem7, null);
        Patient patient8 = new Patient(8, "Sady   Shreef", "01018603222", new Gender(0), 21, "4c,Tagamo", false, "note-p8", 4, treatmentSystem8, null);
        Patient patient9 = new Patient(9, "May   Shady", "01018603222", new Gender(1), 8, "43,Ramses", false, "note-p9", 2, treatmentSystem9, null);
        
       
        VDMSequence AllPatients = new VDMSequence(new Patient[]{patient1,patient2,patient3,patient4,patient5,patient6,patient7,patient8});
        
        
        Staff staff1 = new Staff(1, "Amir",  new Gender(0), new Specialisation(4), false, new VDMSequence(), patient2);
        Staff staff2 = new Staff(2, "Salah", new Gender(0), new Specialisation(2), true, new VDMSequence(), null);
        Staff staff3 = new Staff(3, "Ali",   new Gender(0), new Specialisation(0), true, new VDMSequence(), null);
        Staff staff4 = new Staff(4, "Donia", new Gender(1), new Specialisation(0), true, new VDMSequence(), null);
        Staff staff5 = new Staff(5, "Amr",   new Gender(0), new Specialisation(1), true, new VDMSequence(), null);
        Staff staff6 = new Staff(6, "Sarah", new Gender(1), new Specialisation(3), true, new VDMSequence(), null);
        Staff staff7 = new Staff(7, "Salma", new Gender(1), new Specialisation(3), true, new VDMSequence(), null);
        Staff staff8 = new Staff(8, "Doaa",  new Gender(1), new Specialisation(1), true, new VDMSequence(), null);
        
        VDMSequence AllStaff = new VDMSequence( new Staff[]{staff1,staff2,staff3,staff4,staff5,staff6,staff7});
        
 
        Consultant Consultant1 = new Consultant(1, "Samy", "01119948470", new Gender(0), false, new VDMSequence(),patient1);
        Consultant Consultant2 = new Consultant(2, "Sayed", "01204498470", new Gender(0), true, new VDMSequence(),null);
        Consultant Consultant3 = new Consultant(3, "Adel", "01119948470", new Gender(0), true, new VDMSequence(),null);
        Consultant Consultant4 = new Consultant(4, "Sonia", "01119948470", new Gender(1), true, new VDMSequence(),null);
        Consultant Consultant5 = new Consultant(5, "Tamer", "01119948470", new Gender(0), true, new VDMSequence(),null);
        Consultant Consultant6 = new Consultant(6, "Soad", "01119948470", new Gender(1), true, new VDMSequence(),null);
        Consultant Consultant7 = new Consultant(7, "Sandy", "01119948470", new Gender(1), true, new VDMSequence(),null);
        
        VDMSequence AllConsultants = new VDMSequence(new Consultant[]{Consultant1,Consultant2,Consultant3,Consultant4,Consultant5,Consultant6,Consultant7});
       
        
        Equipment Equipment1 = new Equipment(1, EquipmentName.Plaster);
        Equipment Equipment2 = new Equipment(2, EquipmentName.XRayMachine);
        Equipment Equipment3 = new Equipment(3, EquipmentName.SpineBoard);
        Equipment Equipment4 = new Equipment(4, EquipmentName.TrolleyBed);
        Equipment Equipment5 = new Equipment(5, EquipmentName.Wheelchair);
        Equipment Equipment6 = new Equipment(6, EquipmentName.Ultrasound);
        Equipment Equipment7 = new Equipment(7, EquipmentName.Defibrillator);
        Equipment Equipment8 = new Equipment(8, EquipmentName.Oxygen);
        Equipment Equipment9 = new Equipment(9, EquipmentName.ECG);
        Equipment Equipment10 = new Equipment(10, EquipmentName.Plaster);
        Equipment Equipment11 = new Equipment(11, EquipmentName.XRayMachine);
        Equipment Equipment12 = new Equipment(12, EquipmentName.SpineBoard);
        Equipment Equipment13 = new Equipment(13, EquipmentName.TrolleyBed);
        Equipment Equipment14 = new Equipment(14, EquipmentName.Wheelchair);
        Equipment Equipment15 = new Equipment(15, EquipmentName.Ultrasound);
        Equipment Equipment16 = new Equipment(16, EquipmentName.Defibrillator);
        Equipment Equipment17 = new Equipment(17, EquipmentName.Oxygen);
        Equipment Equipment18 = new Equipment(18, EquipmentName.ECG);
        Equipment Equipment19 = new Equipment(19, EquipmentName.TrolleyBed);
        Equipment Equipment20 = new Equipment(20, EquipmentName.Wheelchair);
        Equipment Equipment21 = new Equipment(21, EquipmentName.TrolleyBed);
        Equipment Equipment22 = new Equipment(22, EquipmentName.Wheelchair);
        Equipment Equipment23 = new Equipment(23, EquipmentName.TrolleyBed);
        Equipment Equipment24 = new Equipment(24, EquipmentName.Wheelchair);
        Equipment Equipment25 = new Equipment(25, EquipmentName.TrolleyBed);
        Equipment Equipment26 = new Equipment(26, EquipmentName.Wheelchair);
        Equipment Equipment27 = new Equipment(27, EquipmentName.TrolleyBed);
        Equipment Equipment28 = new Equipment(28, EquipmentName.Wheelchair);
        Equipment Equipment29 = new Equipment(29, EquipmentName.TrolleyBed);
        Equipment Equipment30 = new Equipment(30, EquipmentName.Wheelchair);
        Equipment Equipment31 = new Equipment(31, EquipmentName.Plaster);
        Equipment Equipment32 = new Equipment(32, EquipmentName.XRayMachine);
        Equipment Equipment33 = new Equipment(33, EquipmentName.SpineBoard);
        Equipment Equipment34 = new Equipment(34, EquipmentName.TrolleyBed);
        Equipment Equipment35 = new Equipment(35, EquipmentName.Wheelchair);
        Equipment Equipment36 = new Equipment(36, EquipmentName.Ultrasound);
        Equipment Equipment37 = new Equipment(37, EquipmentName.Defibrillator);
        Equipment Equipment38 = new Equipment(38, EquipmentName.Oxygen);
        Equipment Equipment39 = new Equipment(39, EquipmentName.ECG);
        
        VDMSequence AllEquipments = new VDMSequence();
        
        AllEquipments.concat(new VDMSequence(Equipment1));
        AllEquipments.concat(new VDMSequence(Equipment2));
        AllEquipments.concat(new VDMSequence(Equipment3));
        AllEquipments.concat(new VDMSequence(Equipment4));
        AllEquipments.concat(new VDMSequence(Equipment5));
        AllEquipments.concat(new VDMSequence(Equipment6));
        AllEquipments.concat(new VDMSequence(Equipment7));
        AllEquipments.concat(new VDMSequence(Equipment8));
        AllEquipments.concat(new VDMSequence(Equipment9));
        AllEquipments.concat(new VDMSequence(Equipment10));
        AllEquipments.concat(new VDMSequence(Equipment11));
        AllEquipments.concat(new VDMSequence(Equipment12));
        AllEquipments.concat(new VDMSequence(Equipment13));
        AllEquipments.concat(new VDMSequence(Equipment14));
        AllEquipments.concat(new VDMSequence(Equipment15));
        AllEquipments.concat(new VDMSequence(Equipment16));
        AllEquipments.concat(new VDMSequence(Equipment17));
        AllEquipments.concat(new VDMSequence(Equipment18));
        AllEquipments.concat(new VDMSequence(Equipment19));
        AllEquipments.concat(new VDMSequence(Equipment20));
        AllEquipments.concat(new VDMSequence(Equipment21));
        AllEquipments.concat(new VDMSequence(Equipment22));
        AllEquipments.concat(new VDMSequence(Equipment23));
        AllEquipments.concat(new VDMSequence(Equipment24));
        AllEquipments.concat(new VDMSequence(Equipment25));
        AllEquipments.concat(new VDMSequence(Equipment26));
        AllEquipments.concat(new VDMSequence(Equipment27));
        AllEquipments.concat(new VDMSequence(Equipment28));
        AllEquipments.concat(new VDMSequence(Equipment29));
        AllEquipments.concat(new VDMSequence(Equipment30));
        AllEquipments.concat(new VDMSequence(Equipment31));
        AllEquipments.concat(new VDMSequence(Equipment32));
        AllEquipments.concat(new VDMSequence(Equipment33));
        AllEquipments.concat(new VDMSequence(Equipment34));
        AllEquipments.concat(new VDMSequence(Equipment35));
        AllEquipments.concat(new VDMSequence(Equipment36));
        AllEquipments.concat(new VDMSequence(Equipment37));
        AllEquipments.concat(new VDMSequence(Equipment38));
        AllEquipments.concat(new VDMSequence(Equipment39));
        
        Room room1 = new Room(1, RoomName.Consulting, new VDMSet(Equipment4).union(new VDMSet(Equipment5)), true, new VDMSet(), new VDMSet(Consultant1), patient1);
        Room room2 = new Room(2, RoomName.Consulting, new VDMSet(Equipment13).union(new VDMSet(Equipment14)), true, new VDMSet(), new VDMSet(Consultant1), null);
        Room room3 = new Room(3, RoomName.Consulting, new VDMSet(Equipment19).union(new VDMSet(Equipment20)), true, new VDMSet(), new VDMSet(Consultant1), null);
        Room room4 = new Room(4, RoomName.Consulting, new VDMSet(Equipment21).union(new VDMSet(Equipment22)), true, new VDMSet(), new VDMSet(Consultant1), null);
        Room room5 = new Room(5, RoomName.Consulting, new VDMSet(Equipment22).union(new VDMSet(Equipment23)), true, new VDMSet(), new VDMSet(Consultant1), null);
        Room room6 = new Room(6, RoomName.Consulting, new VDMSet(Equipment24).union(new VDMSet(Equipment25)), true, new VDMSet(), new VDMSet(Consultant1), null);
        Room room7 = new Room(7, RoomName.Resus, new VDMSet(Equipment7).union(new VDMSet(Equipment8)).union(new VDMSet(Equipment9)).union(new VDMSet(Equipment27)).union(new VDMSet(Equipment3)), true, new VDMSet(staff6).union(new VDMSet(staff7)), new VDMSet(Consultant1), null);
        Room room8 = new Room(8, RoomName.Radio, new VDMSet(Equipment2).union(new VDMSet(Equipment6)), true, new VDMSet(staff4).union(new VDMSet(staff5)), new VDMSet(Consultant1), null);
        Room room9 = new Room(9, RoomName.Plaster, new VDMSet(Equipment1), true, new VDMSet(staff2).union(new VDMSet(staff8)), new VDMSet(), null);
        
        VDMSet AllRooms = new VDMSet(new Room []{room1,room2,room3,room4,room5,room6,room7,room8,room9});
        
    
        
        AESystem mySystem = new AESystem(AllPatients, AllStaff, AllConsultants, AllRooms);
        System.out.println("Welcome");
        
        //code run testing
        
        //mySystem.getPatientById(1);
        //mySystem.getConsultantById(2);
        //mySystem.getStaffById(3);
        //mySystem.getRoomById(2);
        //mySystem.addPatient(patient9);
        //mySystem.addConsultant(Consultant7);
        //mySystem.addStaff(staff8);
        //mySystem.addRoom(room9);
        //mySystem.addPatientTowaiting(patient4);
        //mySystem.removeFromWaiting(4);
        //mySystem.sendToWard(4, false);
        //mySystem.sendToWard(4, true);
        //mySystem.changePatientStatus(6, true);
        //mySystem.setCondition(4, Condition.Cardiac);
        //mySystem.addTreatment(3, Treatment.ECG);
        //mySystem.getTreatmentCourse(3);
        //mySystem.addSevirety(2, Severity.Sever);
        //mySystem.getSevirety(3);
        //mySystem.setStaffAvailability(4, false);
        //mySystem.getStaffAvailability(4);
        //mySystem.assignPatientToConsultant(2, 4);
       //mySystem.getFirstAvilableStaff(Specialisation.RESUSTeam);
        //mySystem.getFirstAvilableCons();
//        mySystem.getEquipment(2);
//        mySystem.interuptConsultant();
//        mySystem.serPriority(2, 3);
//        mySystem.addConsultantsToResus(3);
//        mySystem.addEquipmentToRoom(3, Equipment9);
//        mySystem.removeEquipmentFromRoom(3, Equipment9);
//        mySystem.setRoomAvailibility(2, true);
//        mySystem.getRoomAvailability(3);
//        mySystem.addStafftoRoom(3, staff8);
//        mySystem.addPatientToRoom(2, patient9);
//        mySystem.getPatientList();
//        mySystem.getNumberOfPatient();
//        mySystem.getConsultatPatients(4);
//        mySystem.removePatientFromRoom(2);
//        mySystem.removePatient(3);
//        mySystem.removeConsultant(5);
//        mySystem.removeStaff(3);
//        mySystem.removeRoom(2);
//        mySystem.getCurrentPatientOfConsultant(2);
//        mySystem.getAssignedConsultant(1);
//        mySystem.getAssignedStaff(4);
//        mySystem.locateConsultant(1);
//        mySystem.locatePatient(1);
//        mySystem.locateStaff(2);
//        mySystem.decideAgeCategory(18);
        
                
        
    
        
        
                
        
        
        
        
        
        
        
                
     
    }
    
}
