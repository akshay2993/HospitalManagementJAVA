package com.bridgelabz.hospitalmanagement;

import javax.print.Doc;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static UserInterface userInterfaceInstance;

    private UserInterface() {

    }

    public static UserInterface getInstance(){
        if (userInterfaceInstance == null){
            userInterfaceInstance = new UserInterface();
        }
        return userInterfaceInstance;
    }

    public int showMainMenu(){
        System.out.println("Enter your choice:\n1.Add Doctor \n2.Remove Doctor\n3.Update Doctor\n4.Print Doctors" +
                "\n5.Add Patient \n6.Remove Patient\n7.Update Patient\n8.Print Patients\n9.Exit\n");
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();

        return selection;
    }

    public Doctor createDoctor(){
        Doctor doctor = new Doctor();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of doctor:");
        doctor.name = sc.nextLine();
        System.out.println("Enter the id of doctor:");
        doctor.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the specialization of doctor:");
        doctor.specialization = sc.nextLine();
        System.out.println("Enter the phone no. of doctor:");
        doctor.phoneNo = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the email-id of doctor:");
        doctor.emailId = sc.nextLine();

        return doctor;
    }

    public void printDoctors(List<Doctor> doctorList){
        for (int i=0; i< doctorList.size();i++) {
            Doctor doctor = doctorList.get(i);
            System.out.println(doctor);
        }
        System.out.println("\n");
    }

    public void update(Doctor doctor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n1.Update name\n2.Id\n3.Phone no.\n4.Email\n5.specialization");
        int updateChoice = sc.nextInt();
        switch (updateChoice){
            case 1:
                System.out.println("Update Name:");
                doctor.name = sc.nextLine();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
