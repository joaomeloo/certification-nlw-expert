package com.jhzn.certification.modules.certifications.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhzn.certification.modules.students.entities.CertificationStudentEntity;
import com.jhzn.certification.modules.students.repositories.CertificationStudentRepository;

@Service
public class Top10RankingUseCase {
    

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;
    
    public List<CertificationStudentEntity> execute() {
        var result = this.certificationStudentRepository.findTop10ByOrderByGradeDesc();
        return result;
    }

}
