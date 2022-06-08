package com.bridgelabz.hospitalmanagement;

import java.util.List;

public class Doctor {

    String name;
    String specialization;
    int id;
    long phoneNo;
    String emailId;
    List<Patient> patientList;

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", id=" + id +
                ", phoneNo=" + phoneNo +
                ", emailId='" + emailId + '\'' +
                ", patientList=" + patientList +
                '}';
    }
}
