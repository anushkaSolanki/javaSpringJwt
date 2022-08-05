package com.springmongo.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/find")
    public List<Books> getAllBooks(){
        return bookRepository.findAll();
    }

    @PostMapping("/save")
    public String saveBook(@RequestBody Books book)
    {
        bookRepository.save(book);
        return "Book saved with id: "+book.getBookId();
    }

    @GetMapping("/find/{id}")
    public Optional<Books> getBookById(@PathVariable Integer id){
        return bookRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id)
    {
        bookRepository.deleteById(id);
        return "Book deleted having id: "+id;
    }
    
}
