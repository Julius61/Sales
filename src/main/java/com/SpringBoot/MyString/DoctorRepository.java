package com.SpringBoot.MyString;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository  extends JpaRepository<Doctor,Long> {
    static Doctor Save(Doctor doctor) {
    }
}
