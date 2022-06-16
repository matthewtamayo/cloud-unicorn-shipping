package com.telus.shipping.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.telus.shipping.model.Code;

/**
 * The {@link Code} REST controller.
 *
 * @author John Dexter Reyes
 */
@RestController
@RequestMapping("/code")
@Tag(name = "code")
public class CodeController {

	@GetMapping
	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	public List<Code> get() {
		return null;
	}

}
