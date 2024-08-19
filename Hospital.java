import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    public Hospital() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    // Add a patient
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient);
    }

    // Add a doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added: " + doctor);
    }

    // Schedule an appointment
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled: " + appointment);
    }

    // List all patients
    public void listPatients() {
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    // List all doctors
    public void listDoctors() {
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    // List all appointments
    public void listAppointments() {
        System.out.println("Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    // Get a patient by ID
    public Patient getPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    // Get a doctor by ID
    public Doctor getDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }
}