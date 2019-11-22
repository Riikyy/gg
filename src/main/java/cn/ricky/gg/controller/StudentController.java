package cn.ricky.gg.controller;

import cn.ricky.gg.mapper.StudentMapper;
import cn.ricky.gg.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("listStudent")
    public String listStudent(Model model){
        List<Student>list=studentMapper.findAll();
        model.addAttribute("students",list);
        return "listStudent";
    }
}
