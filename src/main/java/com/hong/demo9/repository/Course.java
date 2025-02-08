package com.hong.demo9.repository;

// import lombok.NoArgsConstructor;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
import lombok.Data;


import java.util.List;
// import java.util.UUID;

// @Builder
// @AllArgsConstructor
// @NoArgsConstructor
@Data
public class Course {
    private Integer courseId;

    private String uuid;  // UUID.randomUUID().toString()
    private String description;

    private List<Student> students;
}
