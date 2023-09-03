package com.example.myhealthrecord;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

    @GetMapping("src/main/resources/templates/add-patient.html")
    public String showAddPatientForm() {
        return "src/main/resources/templates/add-patient.html";
    }
}
