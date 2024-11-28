package com.app.task.service;

import com.app.task.domain.StudentDTO;
import com.app.task.domain.StudentVO;

import java.util.List;
import java.util.Optional;

public interface StudentService {


//    정보 받아
    public void insertStudentInfo(StudentVO studentVO);

//    전체 보여줘
    public List<StudentDTO> showStudents();

//    하나만
    public Optional<StudentDTO> showOneStudent(Long id);
}
