package com.schoolmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.scheduling.annotation.Async;

import com.schoolmanager.model.School;
import com.schoolmanager.repository.SchoolRepository;
import java.util.concurrent.CompletableFuture;

@Controller
@RequestMapping(path="/api/school")
public class SchoolController {
	@Autowired
	private SchoolRepository schoolRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addNewSchool(@RequestParam String name, @RequestParam String location) {
		School school = new School();
		school.setName(name);
		school.setLocation(location);
		
		schoolRepository.save(school);
		
		return "Saved";
	}
	
	
	@Async
	@GetMapping(path="/all")
	public @ResponseBody CompletableFuture<Iterable<School>> getAllSchools() {
		return CompletableFuture
				.completedFuture(schoolRepository.findAll());
	}
	
}
