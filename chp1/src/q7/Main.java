
// #CHATGPT

//package q7;
////Abstract Class representing a general entity in the hospital
//abstract class HospitalEntity {
// protected int id;
// protected String name;
// protected String address;
// protected String contactNumber;
// protected String email;
//
// public HospitalEntity(int id, String name, String address, String contactNumber, String email) {
//     this.id = id;
//     this.name = name;
//     this.address = address;
//     this.contactNumber = contactNumber;
//     this.email = email;
// }
//
// // Abstract method (Implemented in subclasses)
// public abstract void displayInfo();
//}
//
////Doctor Class (Inherits HospitalEntity)
//class Doctor extends HospitalEntity {
// private String specialization;
// private int experience;
// private String schedule;
// private double fees;
// private boolean availability;
//
// public Doctor(int id, String name, String address, String contactNumber, String email,
//               String specialization, int experience, String schedule, double fees, boolean availability) {
//     super(id, name, address, contactNumber, email);
//     this.specialization = specialization;
//     this.experience = experience;
//     this.schedule = schedule;
//     this.fees = fees;
//     this.availability = availability;
// }
//
// // Overriding display method (Polymorphism)
// @Override
// public void displayInfo() {
//     System.out.println("Doctor: " + name + " | Specialization: " + specialization + " | Experience: " + experience + " years");
// }
//
// // Doctor Operations
// public void diagnose() { System.out.println(name + " is diagnosing a patient."); }
// public void prescribeMedicine() { System.out.println(name + " prescribed medicine."); }
// public void performSurgery() { System.out.println(name + " performed surgery."); }
// public void consultPatient() { System.out.println(name + " is consulting a patient."); }
// public void updateSchedule(String newSchedule) { schedule = newSchedule; }
//}
//
////Patient Class
//class Patient extends HospitalEntity {
// private int age;
// private String gender;
// private String disease;
// private String admissionDate;
// private String dischargeDate;
//
// public Patient(int id, String name, String address, String contactNumber, String email,
//                int age, String gender, String disease, String admissionDate, String dischargeDate) {
//     super(id, name, address, contactNumber, email);
//     this.age = age;
//     this.gender = gender;
//     this.disease = disease;
//     this.admissionDate = admissionDate;
//     this.dischargeDate = dischargeDate;
// }
//
// @Override
// public void displayInfo() {
//     System.out.println("Patient: " + name + " | Age: " + age + " | Disease: " + disease);
// }
//
// // Patient Operations
// public void admitPatient() { System.out.println(name + " has been admitted."); }
// public void dischargePatient() { System.out.println(name + " has been discharged."); }
// public void updateMedicalHistory() { System.out.println(name + "'s medical history updated."); }
// public void bookAppointment() { System.out.println(name + " booked an appointment."); }
// public void payBill() { System.out.println(name + " paid the bill."); }
//}
//
////Nurse Class
//class Nurse extends HospitalEntity {
// private String shift;
// private String department;
// private int experience;
// private String assignedDoctor;
// private String contact;
//
// public Nurse(int id, String name, String address, String contactNumber, String email,
//              String shift, String department, int experience, String assignedDoctor, String contact) {
//     super(id, name, address, contactNumber, email);
//     this.shift = shift;
//     this.department = department;
//     this.experience = experience;
//     this.assignedDoctor = assignedDoctor;
//     this.contact = contact;
// }
//
// @Override
// public void displayInfo() {
//     System.out.println("Nurse: " + name + " | Shift: " + shift + " | Assigned Doctor: " + assignedDoctor);
// }
//
// // Nurse Operations
// public void assistDoctor() { System.out.println(name + " is assisting a doctor."); }
// public void monitorPatient() { System.out.println(name + " is monitoring a patient."); }
// public void administerMedicine() { System.out.println(name + " administered medicine."); }
// public void updateRecords() { System.out.println(name + " updated patient records."); }
// public void checkVitals() { System.out.println(name + " checked patient vitals."); }
//}
//
////Main Class to Test
//public class Main {
// public static void main(String[] args) {
//     // Creating Objects
//     Doctor doc = new Doctor(1, "Dr. Abhay", "Mumbai", "1234567890", "abhay@hospital.com", 
//                             "Cardiologist", 10, "10 AM - 5 PM", 1000, true);
//
//     Patient pat = new Patient(101, "Rahul", "Pune", "9876543210", "rahul@gmail.com", 
//                               25, "Male", "Fever", "2025-02-01", "2025-02-05");
//
//     Nurse nurse = new Nurse(201, "Sonia", "Delhi", "1122334455", "sonia@hospital.com", 
//                             "Night", "ICU", 5, "Dr. Abhay", "6677889900");
//
//     // Displaying Information
//     doc.displayInfo();
//     pat.displayInfo();
//     nurse.displayInfo();
//
//     // Performing Operations
//     doc.diagnose();
//     pat.bookAppointment();
//     nurse.checkVitals();
// }
//}
//
