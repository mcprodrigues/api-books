package com.example.api_example.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String title;
    public String author;
    public String area;
    public String image;
    public String publisher;
    @JsonProperty("publication_year")
    public int publicationYear;
    public String isbn;
}
