package pkg16.pkg6;

public class PatientRecord {
    private String patientname;
    private int age;
    private String disease;
    private String doctorName;
    private int roomNo;
    private int billAmount;
    private PatientRecord (Builder builder)
    {
        this.age=builder.age;
        this.billAmount=builder.billAmount;
        this.disease=builder.disease;
        this.doctorName=builder.doctorName;
        this.patientname=builder.patientname;
        this.roomNo=builder.roomNo;
    }
     public void displayDetails() {
        System.out.println("----- Patient Record -----");
        System.out.println("Patient Name : " + patientname);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
        System.out.println("Doctor Name  : " + doctorName);
        System.out.println("Room Type    : " + roomNo);
        System.out.println("Bill Amount  : " + billAmount);
    }
    public static class Builder
            {
                 private String patientname;
                 private int age;
                 private String disease;
                 private String doctorName;
                 private int roomNo;
                 private int billAmount;

        public Builder setPatientname(String patientname) {
            this.patientname = patientname;
                     return this;
        }

        public Builder setAge(int age) {
            this.age = age;
              return this;
        }

        public Builder setDisease(String disease) {
            this.disease = disease;
              return this;
        }

        public Builder setDoctorName(String doctorName) {
            this.doctorName = doctorName;
              return this;
        }

        public Builder setRoomNo(int roomNo) {
            this.roomNo = roomNo;  return this;
        }

        public Builder setBillAmount(int billAmount) {
            this.billAmount = billAmount;  return this;
        }
                  public PatientRecord build() {
            return new PatientRecord(this);
        }
                 
    }
}
