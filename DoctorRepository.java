package com.bridgelabz.hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepository {

    private static DoctorRepository doctorRepositoryInstance = new DoctorRepository();

    private DoctorRepository() {

    }

    public static DoctorRepository getInstance(){
        if(doctorRepositoryInstance == null){
            doctorRepositoryInstance = new DoctorRepository();
        }
        return doctorRepositoryInstance;
    }

    static List<Doctor> doctorList = new ArrayList<>();

    public void add(Doctor doctor)
    {
        doctorList.add(doctor);
    }

    public void remove(Doctor doctor){
        doctorList.remove(doctor);
    }

    public Doctor getDoctor(int id) {
        for(Doctor doctor:doctorList){
            if(doctor.id == id){
                return doctor;
            }
        }
        return null;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }
}
