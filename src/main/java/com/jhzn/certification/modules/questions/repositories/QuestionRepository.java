package com.jhzn.certification.modules.questions.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhzn.certification.modules.questions.entities.QuestionEntity;
import java.util.List;


public interface QuestionRepository extends JpaRepository<QuestionEntity, UUID> {

    List<QuestionEntity> findByTechnology(String technology);
}
