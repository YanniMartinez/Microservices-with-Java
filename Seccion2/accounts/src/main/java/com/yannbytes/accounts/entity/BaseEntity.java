package com.yannbytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

//Below annotations from loombok help us to generate getter/setter/toString internally
@MappedSuperclass //Indica que podrá ser usada como super clase en otras clases
@Getter @Setter @ToString
public class BaseEntity {

    @Column(updatable = false) //indicate the name of the column in the database, updateble false means that this column will not be updated auto
    private LocalDateTime createdAt;

    @Column(updatable = false) //Not auto populate into the database
    private String createdBy;

    @Column(updatable = false)
    private LocalDateTime updatedAt;

    @Column(updatable = false)
    private String updatedBy;

}
