package ma.emsi.projetstagebokking.Service;

import ma.emsi.projetstagebokking.entites.Jobs;
import ma.emsi.projetstagebokking.repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsService {

    private final JobsRepository jobsRepository;

    @Autowired
    public JobsService(JobsRepository jobsRepository) {
        this.jobsRepository = jobsRepository;
    }

    public List<Jobs> getAllJobs(){
        return jobsRepository.findAll();
    }

    public Jobs addJobs(Jobs jobs){
        return jobsRepository.save(jobs);
    }

    public Jobs updateJobs(Jobs jobs){
        return jobsRepository.save(jobs);
    }

    public Jobs getJobsById(Long id){
        return jobsRepository.findJobsById(id);
    }

    public void deleteJobs(Long id){
        jobsRepository.deleteById(id);
    }
}
