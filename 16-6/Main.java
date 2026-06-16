package pkg16.pkg6;

public class Main {
    public static void main(String[] args) {

        PatientRecord patient = new PatientRecord.Builder()
                .setPatientname("Nitheesh")
                .setAge(23)
                .setDisease("Corona")
                .setDoctorName("Dr.Veera")
                .setRoomNo(101)
                .setBillAmount(1500000)
                .build();

        patient.displayDetails();
    }
}