package com.ll.g240205.domain.answer.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AnswerDTO {
    private Integer id;

    private String content;

    private LocalDateTime createDate;

    private Integer authorId;

    private LocalDateTime modifyDate;

    // Question 연결해야 함
}