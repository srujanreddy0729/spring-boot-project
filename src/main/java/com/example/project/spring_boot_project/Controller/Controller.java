package com.example.project.spring_boot_project.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Java","Smith"),
                new Course(2,"Python","John"),
                new Course(3,"C++","Candy"));
    }
}
