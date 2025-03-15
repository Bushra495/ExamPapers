package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Exam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")
public class ExamController {
    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){

    }
}
