package com.app.task.mapper;

import com.app.task.domain.StudentDTO;
import com.app.task.domain.StudentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Mapper
public interface StudentMapper {

//    학생 정보 넣기
    public void insert(StudentVO studentVO);

//    리스트로 뽑기
    public List<StudentDTO> selectAll();


//    학생 하나만 보여주기
    public Optional<StudentDTO> select();
}
