package com.hits.iternship.entities.students;

import com.hits.iternship.dto.StatusDto;
import com.hits.iternship.entities.companies.CompanyEntity;
import com.hits.iternship.entities.position.PositionEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "students")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer studentId;

    String name;

    String image;


    String status; // там статус какой-то странный но пока так

    Integer InterviewsCount;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentId", referencedColumnName = "studentId") //Один студент может пробовать себя во многих компаниях, но вот по итогу работать будет только в одной. Да и вообще в компаниях мы не отображаем студентов, так что тут оне ту мени
    List<CompanyEntity> companies;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentId", referencedColumnName = "studentId") //Один студент может пробовать себя во многих компаниях, но вот по итогу работать будет только в одной. Да и вообще в компаниях мы не отображаем студентов, так что тут оне ту мени
    List<PositionEntity> positions;

    Date lastActivity;



    // List<ContactsEntity> contacts;




}

