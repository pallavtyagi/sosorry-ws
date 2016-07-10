/**
 * 
 */
package com.sosorryservice.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sosorryservice.model.Image;

/**
 * @author Pallav
 * @created Jul 9, 2016
 * 
 */

@RestController
@RequestMapping("/img/json")
public class ImageController {

	
	@RequestMapping(method=RequestMethod.GET, value="/images")
	List<Image> getImages()
	{
		
		List<Image> l = new ArrayList<>();
		l.add(new Image((long) 1, "name1", "imageLink1", "thumbnail1", "caption", new Date()));
		return l;
	}
}
