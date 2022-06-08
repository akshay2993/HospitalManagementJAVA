package com.bridgelabz.hospitalmanagement;

import java.util.List;

public class Patient {

    String name;
    int age;
    int id;
    long phoneNo;
    String email;
    String address;
    int bedNo;
    double billAmount;
    List<Doctor> doctorList;

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", bedNo=" + bedNo +
                ", billAmount=" + billAmount +
                ", doctorList=" + doctorList +
                '}';
    }
}
