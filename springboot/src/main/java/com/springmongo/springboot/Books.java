package com.springmongo.springboot;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection = "user")
public class Books {

    @Id
    private Integer bookId;
    private String bookName;
    private String bookOwner;
    
}