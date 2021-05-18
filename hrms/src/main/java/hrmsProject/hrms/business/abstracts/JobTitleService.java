package hrmsProject.hrms.business.abstracts;

import java.util.List;

import hrmsProject.hrms.entities.concretes.JobTitle;

public interface JobTitleService {

	void save(JobTitle jobTitle);
	List<JobTitle> getAll();
	void getById(int id);
	void getByTitle(String title);
}
