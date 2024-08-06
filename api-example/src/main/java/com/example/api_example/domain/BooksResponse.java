package com.example.api_example.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class BooksResponse {
    public List<Book> books;

}
