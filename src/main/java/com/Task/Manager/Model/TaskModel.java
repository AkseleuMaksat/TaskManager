package com.Task.Manager.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "task_hiber")
@Getter
@Setter
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;
    @Column (name = "name")
    private String name;
    @Column(name = "deadline")
    private String deadline;
    @Column(name = "completed")
    private String completed;
    @Column(name =  "description")
    private String description;
}
