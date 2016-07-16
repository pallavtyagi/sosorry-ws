/**
 * 
 */
package com.sosorryservice.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sosorryservice.model.Video;

/**
 * @author Pallav
 * @created Jul 16, 2016
 * 
 */
@Repository
public interface VideoRepository extends MongoRepository<Video, String> {

	//TODO create methods to find patter search.
}
