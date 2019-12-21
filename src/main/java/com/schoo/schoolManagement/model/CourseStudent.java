package com.schoo.schoolManagement.model;

//import lombok.Data;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;

@Data  // for Lombok
@Entity
@Table(name="COURSE_STUDENT")
public class CourseStudent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="STUDENT_ID",referencedColumnName = "id")
    private UserInfo student;


    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="COURSE_ID",referencedColumnName = "id")
    private Course course;

}
