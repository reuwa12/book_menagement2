package com.MH.book_management2.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Book {
    private Long id;
    private String title;
    private Long authorId;
    private String authorName;
    private LocalDate publishedDate;
}