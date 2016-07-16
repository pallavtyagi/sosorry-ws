package com.sosorryservice.controller;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sosorryservice.exception.NotFoundException;
import com.sosorryservice.model.Image;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping(value = "/images", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/images", description = "the images API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-07-16T13:50:38.043Z")
public class ImagesController {

  @ApiOperation(value = "Images list", notes = "This api will provide the list of images. ", response = Image.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "An array of images", response = Image.class),
    @ApiResponse(code = 200, message = "Unexpected error", response = Image.class) })
  @RequestMapping(value = "",
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<List<Image>> imagesGet()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Image>>(HttpStatus.OK);
  }

}
