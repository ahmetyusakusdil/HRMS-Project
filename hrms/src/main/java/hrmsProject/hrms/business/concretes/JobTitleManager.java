package hrmsProject.hrms.business.concretes;

import java.util.List;

import hrmsProject.hrms.business.abstracts.JobTitleService;
import hrmsProject.hrms.entities.concretes.JobTitle;

public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;
	
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public void add(JobTitle jobTitle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getByTitle(String title) {
		// TODO Auto-generated method stub
		
	}

}
