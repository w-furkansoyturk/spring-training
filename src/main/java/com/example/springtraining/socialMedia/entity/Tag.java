package com.example.springtraining.socialMedia.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity(name = "Tag")
@Table(name = "tag")
@Getter
@Setter
@ToString
public class Tag extends BaseEntity {

    @Column
    private String tagName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Tag tag = (Tag) o;
        return super.getId() != null && Objects.equals(super.getId(), tag.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
