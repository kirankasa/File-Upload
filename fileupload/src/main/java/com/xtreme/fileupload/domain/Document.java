package com.xtreme.fileupload.domain;

import javax.persistence.Basic;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Document {

	@NotNull
	@Size(max = 100)
	private String name;

	@NotNull
	@Size(max = 500)
	private String description;

	private String filename;

	private String contentType;

	@NotNull
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] content;

	private java.lang.Long size;
	@Transient
	@Size(max = 100)
	private String url;
}
