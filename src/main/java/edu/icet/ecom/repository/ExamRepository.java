package edu.icet.ecom.repository;

import edu.icet.ecom.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<ExamEntity,Integer>{

    ExamEntity getByCourseId(Integer id);
}
