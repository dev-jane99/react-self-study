package com.app.task.student;

import com.app.task.domain.StudentDTO;
import com.app.task.mapper.StudentMapper;
import com.app.task.repository.StudentDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class StudentTests {
    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    private StudentDTO studentDTO;


    @Test
    public void test() {
    ;}
}

