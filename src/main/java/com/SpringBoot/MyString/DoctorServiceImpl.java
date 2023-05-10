package com.SpringBoot.MyString;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service

public class DoctorServiceImpl implements DoctorService{
    private DoctorRepository doctorRepository;
    @Override
    public Doctor createDoctor(Doctor doctor) {
        return DoctorRepository.Save(doctor);
    }

    @Override
    public Doctor getDoctorById(Long doctorId) {
        Optional<Doctor> optionalDoctor=doctorRepository.findById(doctorId);
        return optionalDoctor.get();
    }

    @Override
    public Object getDoctor(Long doctorId) {
        Optional<Doctor> optionalDoctor=doctorRepository.findById(doctorId);
        return optionalDoctor;
    }

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        Doctor existingDoctor=DoctorRepository.findById(doctor.getId()).get();
        existingDoctor.setName(doctor.getName());
        existingDoctor.setEmail(doctor.getEmail());
        Doctor updatedDoctor=doctorRepository.save(existingDoctor);
        return updatedDoctor;

        @Override
        void deleteDoctor(Long doctorId)
    }
