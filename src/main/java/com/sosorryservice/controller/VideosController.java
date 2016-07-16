package com.sosorryservice.controller;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sosorryservice.exception.NotFoundException;
import com.sosorryservice.model.Video;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/videos", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/videos", description = "the videos API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-07-16T13:50:38.043Z")
public class VideosController {

  @ApiOperation(value = "Videos list", notes = "This api will provide the list of Videos. ", response = Video.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "An array of videos.", response = Video.class),
    @ApiResponse(code = 200, message = "Unexpected error", response = Video.class) })
  @RequestMapping(value = "",
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<List<Video>> videosGet()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Video>>(HttpStatus.OK);
  }

}
