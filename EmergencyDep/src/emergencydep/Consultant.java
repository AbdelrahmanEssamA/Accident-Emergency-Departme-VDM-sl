package emergencydep;

public class Consultant {
    private int id;
    private String name;
    private String phone;
    private Gender gender;
    private boolean availability;
    private VDMSequence treatedPatients;
    private Patient currentPatient;

    public Consultant() {
        this.id = 0;
        this.name = "";
        this.phone = "";
        this.gender = new Gender(0);
        this.availability = true;
        this.treatedPatients = new VDMSequence();
        this.currentPatient = new Patient();
    }
    
    public Consultant(int id, String name, String phone, Gender gender, boolean availability, VDMSequence treatedPatients, Patient currentPatient) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.availability = availability;
        this.treatedPatients = treatedPatients;
        this.currentPatient = currentPatient;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
        return "Consultant{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", gender=" + gender + ", availability=" + availability + ", treatedPatients=" + treatedPatients + ", currentPatient=" + currentPatient + '}';
    }
    
    
}
