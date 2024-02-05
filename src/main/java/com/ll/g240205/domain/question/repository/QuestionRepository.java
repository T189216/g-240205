package com.ll.g240205.domain.question.repository;

import com.ll.g240205.domain.answer.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Answer, Integer> {
}