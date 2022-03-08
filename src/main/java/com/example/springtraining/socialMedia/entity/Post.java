package com.example.springtraining.socialMedia.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity(name = "Post")
@Table(name = "post")
@Getter
@Setter
@ToString
@RequiredArgsConstructor

public class Post extends BaseEntity{

    @Column
    @NotNull
    private String username;

    @Column
    @NotNull
    private String password;

    @Column
    private String createdByName;

    @Column
    private String content;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Post post = (Post) o;
        return super.getId() != null && Objects.equals(super.getId(), post.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
