package com.sosorryservice.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class Video  {
  
  private String url = null;
  private String thumbnailUrl = null;
  private String caption = null;
  private String createdDate = null;

  /**
   * Url of the video location
   **/
  @ApiModelProperty(value = "Url of the video location")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Url of the thumbnail of the video.
   **/
  @ApiModelProperty(value = "Url of the thumbnail of the video.")
  @JsonProperty("thumbnail_url")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  /**
   * Caption for the thumbnail or video.
   **/
  @ApiModelProperty(value = "Caption for the thumbnail or video.")
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
    Video video = (Video) o;
    return Objects.equals(url, video.url) &&
        Objects.equals(thumbnailUrl, video.thumbnailUrl) &&
        Objects.equals(caption, video.caption) &&
        Objects.equals(createdDate, video.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, thumbnailUrl, caption, createdDate);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  thumbnailUrl: ").append(thumbnailUrl).append("\n");
    sb.append("  caption: ").append(caption).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
