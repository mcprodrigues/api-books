package com.example.api_example.feign;

import com.example.api_example.domain.BooksResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "book-api", url = "https://example-books-api.s3.eu-north-1.amazonaws.com")
public interface BookClient {
        @GetMapping("/books.json")
        BooksResponse getBooks();
}
