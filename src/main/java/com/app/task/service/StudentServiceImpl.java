package com.app.task.service;


import com.app.task.domain.StudentDTO;
import com.app.task.domain.StudentVO;
import com.app.task.mapper.StudentMapper;
import com.app.task.repository.StudentDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {

    private final StudentDAO studentDAO;
//    private final StudentDTO studentDTO;



    @Override
    public void insertStudentInfo(StudentVO studentVO) {
        studentDAO.save(studentVO);
    }

    @Override
    public List<StudentDTO> showStudents() {
        return studentDAO.showList();
    }


    @Override
    public Optional<StudentDTO> showOneStudent(Long id) {
        return studentDAO.showOne();
    }
}
