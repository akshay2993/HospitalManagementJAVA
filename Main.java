package com.bridgelabz.hospitalmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Hospital Management System");

        /*Doctor d1 = new Doctor();
        d1.patientList = new ArrayList<>();
        d1.name =  "Prakash";
        d1.specialization = "Eye";
        d1.id = 1001;
        d1.phoneNo = 982332232;
        d1.emailId = "prakash@a.com";

        Doctor d2 = new Doctor();
        d1.patientList = new ArrayList<>();
        d2.name =  "Aman";
        d2.specialization = "ENT";
        d2.id = 121;
        d2.phoneNo = 98234471;
        d2.emailId = "aman@abs.com";

        Patient p1 = new Patient();
        p1.doctorList = new ArrayList<>();
        p1.name = "Ajay";
        p1.age = 21;
        p1.id = 11;
        p1.phoneNo = 781245723;
        p1.email = "ajay21@rhg.com";
        p1.address = "Shimla , Himachal Pradesh";
        p1.bedNo = 21;
        p1.billAmount = 8674;

        Patient p2 = new Patient();
        p2.doctorList = new ArrayList<>();
        p2.name = "Aditya";
        p2.age = 26;
        p2.id = 72;
        p2.phoneNo = 893245774;
        p2.email = "aditya0001@rhg.com";
        p2.address = "Chandigarh, India";
        p2.bedNo = 15;
        p2.billAmount = 749;

        d1.patientList.add(p1);
        d1.patientList.add(p2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("Removing Aditya from d1:");

        d1.patientList.remove(p2);

        System.out.println(d1);*/
        UserInterface ui = UserInterface.getInstance();
        Main main = new Main();
        int selection = 0;
        while(selection != 9) {
            selection = ui.showMainMenu();
            main.handleUserSelection(selection);
        }

    }

    public void handleUserSelection(int selection){
        Scanner sc = new Scanner(System.in);
        DoctorRepository doctorRepository = DoctorRepository.getInstance();
        UserInterface userinterface = UserInterface.getInstance();
        switch(selection){
            case 1:
                Doctor doctor = userinterface.createDoctor();
                doctorRepository.add(doctor);
                System.out.println("Doctor Added!");
                break;
            case 2:
                System.out.println("Enter the doctor id to remove:");
                int id = sc.nextInt();
                Doctor doctor1 = doctorRepository.getDoctor(id);
                if(doctorRepository.getDoctorList().contains(doctor1)){
                    doctorRepository.remove(doctor1);
                    System.out.println("Doctor with id "+ id +" removed successfully!");
                }else{
                    System.out.println("Doctor not found!");
                }
                break;
            case 3:
                System.out.println("Enter the id of doctor to update:");
                int id1 = sc.nextInt();
                Doctor doctor2 = doctorRepository.getDoctor(id1);
                if(doctorRepository.getDoctorList().contains(doctor2)){
                    userinterface.update(doctor2);
                }else {
                    System.out.println("Doctor not found.");
                }
                break;

            case 4:
                if( doctorRepository.getDoctorList().size() > 0){

                    userinterface.printDoctors(doctorRepository.getDoctorList());
                }else{
                    System.out.println("No doctor found.");
                }
                break;
            case 9:
                break;
            default:
                System.out.println("Enter a proper choice(1-10)");
                break;
        }
    }
}
