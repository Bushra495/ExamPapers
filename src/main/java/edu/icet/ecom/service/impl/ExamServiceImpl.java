package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Exam;
import edu.icet.ecom.entity.ExamEntity;
import edu.icet.ecom.repository.ExamRepository;
import edu.icet.ecom.service.ExamService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {
    final ExamRepository repository;
    final ModelMapper mapper;
    @Override
    public void createExam(Exam exam) {
        repository.save(mapper.map(exam, ExamEntity.class));
    }

    @Override
    public Exam getExamByCourseId(Integer id) {
        ExamEntity examEntity=repository.getByCourseId(id);
        return mapper.map(examEntity, Exam.class);
    }

    @Override
    public Exam getExamById(Integer id) {
        return null;
    }

    @Override
    public List<Exam> getAll() {
        return List.of();
    }

    @Override
    public void updateExam(Exam exam) {

    }

    @Override
    public void deleteExamById(Integer id) {

    }

    @Override
    public void deleteExamByCourseId(Integer id) {

    }
}
