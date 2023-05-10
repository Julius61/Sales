package com.SpringBoot.MyString;

import java.util.List;
import java.util.Optional;

public interface DoctorService {
  Doctor createDoctor(Doctor doctor);
    Doctor getDoctorById(Long doctorId);

    //Object getDoctor(Long doctorId);

    List<Doctor> getAllDoctor();
    Doctor updateDoctor(Doctor doctor);
    void deleteDoctor(Long doctorId);
}
