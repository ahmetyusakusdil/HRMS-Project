package hrmsProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsProject.hrms.business.abstracts.JobTitleService;
import hrmsProject.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/job-titles")
public class JobTitlesController {

	private JobTitleService jobTitleService;

	@Autowired
	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@PostMapping("save")
	public void save(@RequestBody JobTitle jobTitle) {
		
		jobTitleService.save(jobTitle);
	}
	
	@GetMapping("getall")
	public List<JobTitle> getAll(){
		return jobTitleService.getAll();
	}
	
	@GetMapping("getbyid/{id}")
	public void getById(@PathVariable int id) {
		jobTitleService.getById(id);
	}
	
	@GetMapping("getbytitle/{title}") 
	public void getByTitle(@PathVariable String title) {
		jobTitleService.getByTitle(title);
	}
	
}
