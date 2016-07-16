package com.sosorryservice.controller;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sosorryservice.exception.NotFoundException;
import com.sosorryservice.model.Image;
import com.sosorryservice.model.Video;
import com.sosorryservice.service.VideoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping(value = "/videos", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/videos", description = "the videos API")
public class VideosController {

	@Autowired
	private VideoRepository repository;
	
  @ApiOperation(value = "Videos list", notes = "This api will provide the list of Videos. ", response = Video.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "An array of videos.", response = Video.class),
    @ApiResponse(code = 200, message = "Unexpected error", response = Video.class) })
  @RequestMapping(value = "/get",produces = { "application/json" },method = RequestMethod.GET)
  public ResponseEntity<List<Video>> videosGet() throws NotFoundException { 
      return new ResponseEntity<List<Video>>(repository.findAll(),HttpStatus.OK);
  }

  @ApiOperation(value = "Insert Videos list", notes = "This api will insert Videos list ", response = Video.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Response", response = Image.class),
    @ApiResponse(code = 200, message = "Unexpected error", response = Image.class) })
  @RequestMapping(value = "/post", method = RequestMethod.POST)
  public ResponseEntity<List<Video>> imagesPost(@ApiParam(value = "List of Videos" ,required=true ) @RequestBody List<Video> videos)
  {
	  for (Video video : videos) {
		repository.save(video);
	}
	  return new ResponseEntity<List<Video>>(HttpStatus.OK);
  }
}
