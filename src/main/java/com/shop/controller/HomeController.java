/**
 * Copyright @ of 101 Digital 2023
 */
package com.shop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haitrand
 *
 */
@RestController
public class HomeController {
	@GetMapping(value = "/")
	public ResponseEntity<String> home() {
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
}
