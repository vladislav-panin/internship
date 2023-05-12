package com.hits.iternship.service;

import com.hits.iternship.dto.students.StudentsListDto;
import com.hits.iternship.entities.students.StudentEntity;
import com.hits.iternship.mapper.PositionsMapper;
import com.hits.iternship.mapper.StudentsMapper;
import com.hits.iternship.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    private final StudentsMapper studentsMapper;


    public List<StudentsListDto> findAllStudents()
    {
        List<StudentEntity> studentEntityList = studentRepository.findAll();
        return studentsMapper.toStudentsListDto(studentEntityList);



    }
}
