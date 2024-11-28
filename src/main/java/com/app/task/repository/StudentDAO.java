package com.app.task.repository;

import com.app.task.domain.StudentDTO;
import com.app.task.domain.StudentVO;
import com.app.task.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class StudentDAO {
    @Autowired
    private final StudentMapper studentMapper;


//    학생 정보 기입
    public void save(StudentVO studentVO) {
        studentMapper.insert(studentVO);
    }


//    리스트로 뿌렬
    public List<StudentDTO> showList() {
        return studentMapper.selectAll();
    }

//    학생 하나만
    public Optional<StudentDTO> showOne() {
        return studentMapper.select();
    }

}
