package com.hits.iternship.dto.interview;

import com.hits.iternship.dto.comments.CommentDto;
import com.hits.iternship.dto.interview.CompanyInterviewDto;
import lombok.Data;

import java.util.List;

@Data
public class InterviewsDto {

    CompanyInterviewDto company;

    String position;

    String status;

    List<CommentDto> comments;
}
