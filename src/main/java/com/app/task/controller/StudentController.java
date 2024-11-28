package com.app.task.controller;

import com.app.task.domain.StudentDTO;
import com.app.task.domain.StudentVO;
import com.app.task.mapper.StudentMapper;
import com.app.task.service.StudentService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/student/*")
public class StudentController {

    @Autowired
    public final StudentService studentService;
    @Autowired
    public final StudentMapper studentMapper;
    @Autowired
    public final HttpSession session;

//학생정보받기
    @GetMapping("write")
    public void goToWrite(StudentVO studentVO) {;}



    @PostMapping("write")
    public RedirectView insertStudent(StudentVO studentVO) {
        studentService.insertStudentInfo(studentVO);
        return new RedirectView("/student/write");
    }

    //    리스트 보여줘기
    @GetMapping("list")
    public void goToList(Model model) {
        model.addAttribute("students", studentService.showStudents());
    }

//    하나만 보여주기
    @GetMapping("read")
    public void goToRead(@RequestParam Long id, Model model) {;}

    @PostMapping("read")
    public RedirectView readStudent(@RequestParam Long id, Model model) {
        model.addAttribute("student", studentService.showOneStudent(id));
        return new RedirectView("/student/read");
    }

}
