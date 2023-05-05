package com.hits.iternship.dto.comments;



import lombok.Data;

import java.util.Date;

@Data
public class CommentDto {

    AuthorDto author;

    Date timestamp;

    String text;
}
