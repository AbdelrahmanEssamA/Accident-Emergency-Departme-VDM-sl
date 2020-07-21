package emergencydep;

public class TreatmentSystem {
    private int id;
    private Condition condition;
    private int priority;
    private Severity sevirity;
    private Time startSessionTime;
    private Time endSessionTime;
    private int actualSessionTime;
    private VDMSet tratmentLitst; // Set of Treatment Objects

    public TreatmentSystem() {
        this.id = 0;
        this.condition = new Condition(0);
        this.priority = 0;
        this.sevirity = new Severity(0);
        this.startSessionTime = new Time();
        this.endSessionTime = new Time();
        this.actualSessionTime = 0;
        this.tratmentLitst = new VDMSet();
    }
    
    public TreatmentSystem(int id, Condition condition, int priority, Severity sevirity, Time startSessionTime, Time endSessionTime, int actualSessionTime, VDMSet tratmentLitst) {
        this.id = id;
        this.condition = condition;
        this.priority = priority;
        this.sevirity = sevirity;
        this.startSessionTime = startSessionTime;
        this.endSessionTime = endSessionTime;
        this.actualSessionTime = actualSessionTime;
        this.tratmentLitst = tratmentLitst;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Severity getSevirity() {
        return sevirity;
    }

    public void setSevirity(Severity sevirity) {
        this.sevirity = sevirity;
    }

    public Time getStartSessionTime() {
        return startSessionTime;
    }

    public void setStartSessionTime(Time startSessionTime) {
        this.startSessionTime = startSessionTime;
    }

    public Time getEndSessionTime() {
        return endSessionTime;
    }

    public void setEndSessionTime(Time endSessionTime) {
        this.endSessionTime = endSessionTime;
    }

    public int getActualSessionTime() {
        return actualSessionTime;
    }

    public void setActualSessionTime(int actualSessionTime) {
        this.actualSessionTime = actualSessionTime;
    }

    public VDMSet getTratmentLitst() {
        return tratmentLitst;
    }

    public void setTratmentLitst(VDMSet tratmentLitst) {
        this.tratmentLitst = tratmentLitst;
    }

    @Override
    public String toString() {
        return "TreatmentSystem{" + "id=" + id + ", condition=" + condition + ", priority=" + priority + ", sevirity=" + sevirity + ", startSessionTime=" + startSessionTime + ", endSessionTime=" + endSessionTime + ", actualSessionTime=" + actualSessionTime + ", tratmentLitst=" + tratmentLitst + '}';
    }
    
    
}
