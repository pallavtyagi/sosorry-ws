package com.sosorryservice.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class Image  {
  
  @Id	
  private String id;	
	
  private String url = null;
  private String thumbnailUrl = null;
  private String caption = null;
  private String createdDate = null;

  /**
   * Url of the image location
   **/
  @ApiModelProperty(value = "Url of the image location")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Url of the thumbnail of the image.
   **/
  @ApiModelProperty(value = "Url of the thumbnail of the image.")
  @JsonProperty("thumbnail_url")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  /**
   * Caption for the thumbnail or image.
   **/
  @ApiModelProperty(value = "Caption for the thumbnail or image.")
  @JsonProperty("caption")
  public String getCaption() {
    return caption;
  }
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * Creation time of this image entry in the system.
   **/
  @ApiModelProperty(value = "Creation time of this image entry in the system.")
  @JsonProperty("created_date")
  public String getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(url, image.url) &&
        Objects.equals(thumbnailUrl, image.thumbnailUrl) &&
        Objects.equals(caption, image.caption) &&
        Objects.equals(createdDate, image.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, thumbnailUrl, caption, createdDate);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  thumbnailUrl: ").append(thumbnailUrl).append("\n");
    sb.append("  caption: ").append(caption).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
