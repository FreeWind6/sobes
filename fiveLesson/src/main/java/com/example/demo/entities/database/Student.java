package com.example.demo.entities.database;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mark", nullable = false)
    private String mark;

    public Student(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }
}
