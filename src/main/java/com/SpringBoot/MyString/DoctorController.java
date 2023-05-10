package com.SpringBoot.MyString;

//import com.doctor.doctor.entity.Doctor;
//import com.doctor.doctor.service.DoctorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/doctor")

public class DoctorController {
    private DoctorService doctorService;

    //build create doctor
    @PostMapping
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor){
        Doctor savedDoctor=doctorService.createDoctor(doctor);
        return new ResponseEntity<>(savedDoctor, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Doctor> getDoctorById(@PathVariable("id") Long doctorId){
        Doctor doctor1=doctorService.getDoctorById(doctorId);
        return new ResponseEntity<>(doctor1,HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Doctor>> getAllDoctor(){
        List<Doctor> doctor=doctorService.getAllDoctor();
        return new ResponseEntity<>(doctor,HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<doctor> updateDoctor(@RequestBody Doctor doctor, @PathVariable("id") Long doctorId){
        doctor.setId(doctorId);
        Doctor updatedDoctor=doctorService.updateDoctor(doctor);
        DoctorController.doctor updated = null;
        return new ResponseEntity<>(updated doctor,HttpStatus.OK);    }
    @DeleteMapping
    public ResponseEntity<String> deleteDoctor(@PathVariable("id") Long DoctorId){
        Long doctorId = null;
        doctorService.deleteDoctor(doctorId);
        return new ResponseEntity<>("Doctor deleted successfully!", HttpStatus.OK);
    }

    private class doctor {
    }
}
