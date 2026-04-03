package homework5;

public class Main {

    public static void main(String[] args) {
        Therapist therapist = new Therapist();
        Patient patient1 = new Patient("Petya",1);
        Patient patient2 = new Patient("Vasia",2);
        Patient patient3 = new Patient("Masha",3);

        therapist.setDoctor(patient1);
        therapist.setDoctor(patient2);
        therapist.setDoctor(patient3);
    }
}
