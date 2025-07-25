package com.MH.book_management2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard {
    private Long authorId;
    private String authorName;
    private Long bookCount;
}