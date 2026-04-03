package homework5;

public class Therapist extends Doctor {
    Surgeon surgeon = new Surgeon();
    Dentist dentist = new Dentist();

    public Therapist() {
        super("Therapist", "treating");
    }

    public void setDoctor(Patient patient) {
        if (patient.getHealPlan() == 1) {
            patient.setAssignedDoctor(surgeon);
            patient.getAssignedDoctor().heal(patient);
        } else if (patient.getHealPlan() == 2) {
            patient.setAssignedDoctor(dentist);
            patient.getAssignedDoctor().heal(patient);
        } else {
            patient.setAssignedDoctor(this);
            patient.getAssignedDoctor().heal(patient);
        }
    }
}
