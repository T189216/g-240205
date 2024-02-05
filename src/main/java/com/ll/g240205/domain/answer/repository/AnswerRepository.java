package com.ll.g240205.domain.answer.repository;

import com.ll.g240205.domain.answer.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}