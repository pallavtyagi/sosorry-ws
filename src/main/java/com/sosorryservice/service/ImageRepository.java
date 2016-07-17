/**
 * 
 */
package com.sosorryservice.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sosorryservice.model.Image;

/**
 * @author Pallav
 * @created Jul 16, 2016
 * 
 */
@Repository
public interface ImageRepository extends MongoRepository<Image, String> {

	//TODO create methods to find patter search.
}
