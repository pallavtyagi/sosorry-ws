/**
 * 
 */
package com.sosorryservice.configuration;

import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sosorryservice.model.Image;

/**
 * @author Pallav
 * @created Aug 21, 2016
 * 
 */
public class Validation implements Validator{

	private Validator validator;
	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return List.class.equals(clazz);
	}

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(Object target, Errors errors) {
		
		List imageList = (List) target;
		imageList.stream().forEach(image -> {Image image1 = (Image)image; validator.validate(image1, errors);});
		
		ValidationUtils.rejectIfEmpty(errors, "url", "url.empty");
	}

}
