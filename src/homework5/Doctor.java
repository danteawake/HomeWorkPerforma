package homework5;

public class Doctor {
    String name;
    String healMethod;

    public Doctor(String name, String healMethod) {
        this.name = name;
        this.healMethod = healMethod;
    }

    public void heal(Patient patient) {
        System.out.println(name + " start " + healMethod + " on " + patient.getName());
    }
}


