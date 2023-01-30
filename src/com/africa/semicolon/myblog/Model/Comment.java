package com.africa.semicolon.myblog.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Comment {
    private String commenterName;

    @Id
    private String id;
    private String comment;
}
