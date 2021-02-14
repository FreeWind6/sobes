package com.example.demo.service;

import com.example.demo.entities.database.Student;
import com.example.demo.repositories.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ScheduledTasksService {

    StudentRepository studentRepository;

    @Autowired
    public void setTestRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Scheduled(fixedDelayString = "5000")
    public void scheduler() {
        try {
            Student student = null;
            for (int i = 0; i < 100; i++) {
                student = new Student("Вася" + i, "mark" + i);
                saveOrUpdate(student);
            }
            findById(student);
            findAll();
            deleteById(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void findById(Student student) {
        studentRepository.findById(student.getId());
    }

    private void findAll() {
        studentRepository.findAll();
    }

    private void deleteById(Student student) {
        studentRepository.deleteById(student.getId());
    }

    private void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }

}