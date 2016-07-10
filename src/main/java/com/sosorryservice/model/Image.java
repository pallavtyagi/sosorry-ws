/**
 * 
 */
package com.sosorryservice.model;

import java.util.Date;

/**
 * @author Pallav
 * @created Jul 9, 2016
 * 
 */


public class Image {
	
	private Long id;
	private String name;
	private String imageLink;
	private String thumbnail;
	private String caption;
	private Date createdDate;
	
	

	public Image() {
		super();
	}
	
	public Image(Long id, String name, String imageLink, String thumbnail, String caption, Date createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.imageLink = imageLink;
		this.thumbnail = thumbnail;
		this.caption = caption;
		this.createdDate = createdDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getImageLink() {
		return imageLink;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public String getCaption() {
		return caption;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", imageLink=" + imageLink + ", thumbnail=" + thumbnail
				+ ", caption=" + caption + ", createdDate=" + createdDate + "]";
	}

}
