package emergencydep;

public class Staff {
    private int id;
    private String name;
    private Gender gender;
    private Specialisation specialisation;
    private boolean availability;
    private VDMSequence treatedPatients;
    private Patient currentPatient;

    public Staff(int id, String name, Gender gender, Specialisation specialisation, boolean availability, VDMSequence treatedPatients, Patient currentPatient) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.specialisation = specialisation;
        this.availability = availability;
        this.treatedPatients = treatedPatients;
        this.currentPatient = currentPatient;
    }

    Staff() {
        this.id = 0;
        this.name = "";
        this.gender = new Gender(0);
        this.specialisation = new Specialisation(0);
        this.availability = true;
        this.treatedPatients = new VDMSequence();
        this.currentPatient = new Patient();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Specialisation getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(Specialisation specialisation) {
        this.specialisation = specialisation;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public VDMSequence getTreatedPatients() {
        return treatedPatients;
    }

    public void setTreatedPatients(VDMSequence treatedPatients) {
        this.treatedPatients = treatedPatients;
    }

    public Patient getCurrentPatient() {
        return currentPatient;
    }

    public void setCurrentPatient(Patient currentPatient) {
        this.currentPatient = currentPatient;
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", specialisation=" + specialisation + ", availability=" + availability + ", treatedPatients=" + treatedPatients + ", currentPatient=" + currentPatient + '}';
    }
    
    
}
