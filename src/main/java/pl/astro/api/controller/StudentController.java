package pl.astro.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.astro.api.Student;
import pl.astro.api.StudentDao;

import java.util.List;


@RequestMapping("/api/students")
@RestController
public class StudentController {


    @Autowired
    private StudentDao studentDao;

    /*
    Szuka klasy, która implemetuje interfejs
    StudentDao oraz adnotacja Compponent

    StudentDao = new StudentDaoImplementation();
     */
    @GetMapping("/")
    public List<Student> findAll()

    {
        return studentDao.findAll();
    }

    @PostMapping("/")
    public Student add(@ModelAttribute Student student)
    {
        studentDao.addStudent(student);
        return student;
    }

}
