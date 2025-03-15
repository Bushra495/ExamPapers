package edu.icet.ecom.service;

import edu.icet.ecom.dto.Exam;

import java.util.List;

public interface ExamService {
    void createExam(Exam exam);
    Exam getExamByCourseId(Integer id);
    Exam getExamById(Integer id);
    List<Exam> getAll();
    void updateExam(Exam exam);
    void deleteExamById(Integer id);
    void deleteExamByCourseId(Integer id);
}
