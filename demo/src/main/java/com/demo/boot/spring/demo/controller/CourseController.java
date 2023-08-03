package com.demo.boot.spring.demo.controller;

import com.demo.boot.spring.demo.beans.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAll(){
        return Arrays.asList(
                new Course(1,"AWS","in for it"),
            new Course(2,"Java","in for it"),
            new Course(3,"Spring","in for it"),
                new Course(3,"Springboot","in for it")
        );
    }
}
