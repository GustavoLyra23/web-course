package com.gustavo.webschool.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tb_task")
public class Task extends Lesson {
    @Serial
    private static final long serialVersionUID = 1L;

    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private Double weight;
    private Instant dueDate;


    public Task(Long id, String title, Integer position, Section section, String description, Integer questionCount, Integer approvalCount, Double weight, Instant dueDate) {
        super(id, title, position, section);
        this.description = description;
        this.questionCount = questionCount;
        this.approvalCount = approvalCount;
        this.weight = weight;
        this.dueDate = dueDate;
    }
}
