package javaapplication57;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioDataFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("biodata.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            // Personal Details
            System.out.println("===== ENTER PERSONAL DETAILS =====");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Date of Birth (DD-MM-YYYY): ");
            String dob = sc.nextLine();

            System.out.print("Blood Group: ");
            String bloodGroup = sc.nextLine();

            // Educational Details
            System.out.println("\n===== ENTER EDUCATIONAL DETAILS =====");

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("College Name: ");
            String college = sc.nextLine();

            System.out.print("Percentage / CGPA: ");
            String cgpa = sc.nextLine();

            // Professional Details
            System.out.println("\n===== ENTER PROFESSIONAL DETAILS =====");

            System.out.print("Skills: ");
            String skills = sc.nextLine();

            System.out.print("Experience (Years): ");
            String experience = sc.nextLine();

            // Contact Details
            System.out.println("\n===== ENTER CONTACT DETAILS =====");

            System.out.print("Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Email ID: ");
            String email = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            // Family Details
            System.out.println("\n===== ENTER FAMILY DETAILS =====");

            System.out.print("Father Name: ");
            String fatherName = sc.nextLine();

            System.out.print("Mother Name: ");
            String motherName = sc.nextLine();

            FileWriter writer = new FileWriter(file);

            writer.write("=========== BIO DATA ===========\n\n");

            writer.write("👤 Personal Details\n");
            writer.write("Name : " + name + "\n");
            writer.write("Age : " + age + "\n");
            writer.write("Gender : " + gender + "\n");
            writer.write("DOB : " + dob + "\n");
            writer.write("Blood Group : " + bloodGroup + "\n\n");

            writer.write("🎓 Education\n");
            writer.write("Qualification : " + qualification + "\n");
            writer.write("College : " + college + "\n");
            writer.write("CGPA : " + cgpa + "\n\n");

            writer.write("💼 Professional Details\n");
            writer.write("Skills : " + skills + "\n");
            writer.write("Experience : " + experience + " Year(s)\n\n");

            writer.write("📞 Contact\n");
            writer.write("Phone : " + phone + "\n");
            writer.write("Email : " + email + "\n");
            writer.write("Address : " + address + "\n\n");

            writer.write("👨‍👩‍👧 Family\n");
            writer.write("Father Name : " + fatherName + "\n");
            writer.write("Mother Name : " + motherName + "\n");

            writer.write("\n================================\n");

            writer.close();
            sc.close();

            System.out.println("\nBio Data saved successfully in biodata.txt");

        } catch (IOException e) {
            System.out.println("Error while writing file: " + e.getMessage());
        }
    }
}