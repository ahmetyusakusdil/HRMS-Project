package hrmsProject.hrms.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import hrmsProject.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

	Optional<JobTitle> findByTitle(@Param("title") String title);
}
