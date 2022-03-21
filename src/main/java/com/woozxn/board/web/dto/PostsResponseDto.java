package com.woozxn.board.web.dto;

import com.woozxn.board.domain.posts.Posts;
import jdk.nashorn.internal.objects.annotations.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
