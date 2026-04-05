package homework5;

public class Patient {
    private final String name;
    private int healPlan;
    private Doctor assignedDoctor;

    public Patient(String name, int healPlan) {
        this.name = name;
        this.healPlan = healPlan;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public String getName() {
        return name;
    }

    public int getHealPlan() {
        return healPlan;
    }
}
