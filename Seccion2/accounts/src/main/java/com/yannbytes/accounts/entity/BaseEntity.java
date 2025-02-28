package com.yannbytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.actuate.audit.listener.AuditListener;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

//Below annotations from loombok help us to generate getter/setter/toString internally
@MappedSuperclass //Indica que podrá ser usada como super clase en otras clases
@EntityListeners(AuditListener.class) //Spring monitorea los cambios en la base de datos
@Getter @Setter @ToString
public class BaseEntity {

    @CreatedDate
    @Column(updatable = false) //indicate the name of the column in the database, updateble false means that this column will not be updated auto
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(updatable = false) //Not auto populate into the database
    private String createdBy;

    @LastModifiedDate
    @Column(updatable = false)
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(updatable = false)
    private String updatedBy;

}
