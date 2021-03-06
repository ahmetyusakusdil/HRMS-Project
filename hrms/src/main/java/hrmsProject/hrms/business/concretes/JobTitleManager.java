package hrmsProject.hrms.business.concretes;

import java.util.List;
import org.springframework.stereotype.Service;

import hrmsProject.hrms.business.abstracts.JobTitleService;
import hrmsProject.hrms.dataAccess.abstracts.JobTitleDao;
import hrmsProject.hrms.entities.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;
	
	
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public void save(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		
	}
	
	@Override
	public List<JobTitle> getAll() {
		
		return this.jobTitleDao.findAll();
	}

	@Override
	public void getById(int id) {
		
		this.jobTitleDao.findById(id);
		
	}

	@Override
	public void getByTitle(String title) {
	     
		this.jobTitleDao.findByTitle(title);
		
	}

	

	

}
