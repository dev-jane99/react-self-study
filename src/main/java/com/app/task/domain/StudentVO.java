package com.app.task.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StudentVO {
    private Long id;
    private String studentName;
    private String schoolName;
    private int eng;
    private int kor;
    private int math;
}
