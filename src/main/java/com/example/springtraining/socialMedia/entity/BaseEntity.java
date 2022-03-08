package com.example.springtraining.socialMedia.entity;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@MappedSuperclass
@Getter
@Setter
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Integer version;

    @CreatedBy
    private Long createdBy;

    @CreationTimestamp
    private Date createdDateTime;

    @LastModifiedBy
    private Long updatedBy;

    @LastModifiedDate
    private Date updated_date_time;

}
