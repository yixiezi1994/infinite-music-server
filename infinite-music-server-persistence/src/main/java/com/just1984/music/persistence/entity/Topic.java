package com.just1984.music.persistence.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Topic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long originId;

    private String name;

    private String resourceIds;

    private String topSongInfos;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date updateTime;
}
