package com.schoo.schoolManagement.model;

//import lombok.Data;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="COURSE")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="COURSE")
    private String courseName;


    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="INSTRUCTOR_ID",referencedColumnName="id")
    private UserInfo instructor;


}
