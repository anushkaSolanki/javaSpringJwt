package com.springmongo.springboot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Books,Integer>{
    
}
