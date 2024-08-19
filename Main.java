import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. List Patients");
            System.out.println("5. List Doctors");
            System.out.println("6. List Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Patient
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Patient Ailment: ");
                    String ailment = scanner.nextLine();
                    hospital.addPatient(new Patient(patientId, patientName, patientAge, ailment));
                    break;

                case 2:
                    // Add Doctor
                    System.out.print("Enter Doctor ID: ");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter Doctor Specialization: ");
                    String specialization = scanner.nextLine();
                    hospital.addDoctor(new Doctor(doctorId, doctorName, specialization));
                    break;

                case 3:
                    // Schedule Appointment
                    System.out.print("Enter Appointment ID: ");
                    int appointmentId = scanner.nextInt();
                    System.out.print("Enter Patient ID: ");
                    patientId = scanner.nextInt();
                    System.out.print("Enter Doctor ID: ");
                    doctorId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();

                    Patient patient = hospital.getPatientById(patientId);
                    Doctor doctor = hospital.getDoctorById(doctorId);

                    if (patient != null && doctor != null) {
                        hospital.scheduleAppointment(new Appointment(appointmentId, patient, doctor, date));
                    } else {
                        System.out.println("Invalid Patient ID or Doctor ID");
                    }
                    break;

                case 4:
                    hospital.listPatients();
                    break;

                case 5:
                    hospital.listDoctors();
                    break;

                case 6:
                    hospital.listAppointments();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}