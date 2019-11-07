package com.codeman.springclouddemo.controller;

import com.codeman.springclouddemo.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RequestMapping("/consumer")
@RestController
public class StudentHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, Student.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
    }

    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        Map<String, String> map = new HashMap<>();
        for (String s : queue) {

        }
        queue.add("1");
        queue.add("2");
        queue.push("3");
        queue.pop();
        int head = (0 - 1) & (16 - 1);

        System.out.println(head);

    }
}
