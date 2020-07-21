package emergencydep;

public class Patient {
    private int id;
    private String name;
    private String phone;
    private Gender gender;
    private int age;
    private String address;
    private boolean isServed;
    private String ReceptionistNote;
    private int priority;
    private TreatmentSystem treatmentCourse;
    private TreatmentPlace treatmentPlace;
    
    public Patient() {
        this.id = 0;
        this.name = "";
        this.phone = "";
        this.gender = new Gender(0);
        this.age = 0;
        this.address = "";
        this.isServed = false;
        this.ReceptionistNote = "";
        this.priority = 0;
        this.treatmentCourse = new TreatmentSystem();
        this.treatmentPlace = new TreatmentPlace(0);
    }

    public Patient(int id, String name, String phone, Gender gender, int age, String address, boolean isServed, String ReceptionistNote, int priority, TreatmentSystem treatmentCourse, TreatmentPlace treatmentPlace) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.isServed = isServed;
        this.ReceptionistNote = ReceptionistNote;
        this.priority = priority;
        this.treatmentCourse = treatmentCourse;
        this.treatmentPlace = treatmentPlace;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsServed() {
        return isServed;
    }

    public void setIsServed(boolean isServed) {
        this.isServed = isServed;
    }

    public String getReceptionistNote() {
        return ReceptionistNote;
    }

    public void setReceptionistNote(String ReceptionistNote) {
        this.ReceptionistNote = ReceptionistNote;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public TreatmentSystem getTreatmentCourse() {
        return treatmentCourse;
    }

    public void setTreatmentCourse(TreatmentSystem treatmentCourse) {
        this.treatmentCourse = treatmentCourse;
    }

    public TreatmentPlace getTreatmentPlace() {
        return treatmentPlace;
    }

    public void setTreatmentPlace(TreatmentPlace treatmentPlace) {
        this.treatmentPlace = treatmentPlace;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", gender=" + gender + ", age=" + age + ", address=" + address + ", isServed=" + isServed + ", ReceptionistNote=" + ReceptionistNote + ", priority=" + priority + ", treatmentCourse=" + treatmentCourse + ", treatmentPlace=" + treatmentPlace + '}';
    }
    
}
