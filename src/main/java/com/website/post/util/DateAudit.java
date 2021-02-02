package com.website.post.util;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class DateAudit<U> {

	@CreatedDate
	@Column(name="date_created")
	private Date dateCreated;
	
	@LastModifiedDate
	@Column(name="date_updated")
	private Date dateUpdated;
	
	@LastModifiedBy
    @Column(name = "last_modified_by")
    private U lastModifiedBy;
}
