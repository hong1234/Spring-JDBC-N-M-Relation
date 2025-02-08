package com.hong.demo9.repository;

// import lombok.*;
// import lombok.NoArgsConstructor;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
import lombok.Data;

// import java.util.UUID;
// import java.util.Map;
import java.util.List;

// @Builder
// @AllArgsConstructor
// @NoArgsConstructor
@Data
public class Student {
    private Integer studentId;

    private String name;
    private Integer age;

    private List<Course> courses;
    // private Map<String, Course> courses;
}
