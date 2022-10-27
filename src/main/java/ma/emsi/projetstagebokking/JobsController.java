package ma.emsi.projetstagebokking;

import ma.emsi.projetstagebokking.Service.JobsService;
import ma.emsi.projetstagebokking.entites.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Jobs")
public class JobsController {
    private final JobsService jobsService;

    @Autowired
    public JobsController(JobsService jobsService) {
        this.jobsService = jobsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Jobs>> getAllJobs(){
        List<Jobs> jobs = jobsService.getAllJobs();
        return new ResponseEntity<>(jobs,HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Jobs> getJobsById(@PathVariable("id") Long id){
        Jobs jobs=jobsService.getJobsById(id);
        return new ResponseEntity<>(jobs,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Jobs> addJobs(@RequestBody Jobs jobs){
        Jobs newJob = jobsService.addJobs(jobs);
        return new ResponseEntity<>(newJob,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Jobs> updateJob(@RequestBody Jobs jobs){
        Jobs newJob = jobsService.updateJobs(jobs);
        return new ResponseEntity<>(newJob,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteJob(@PathVariable("id") Long id){
        jobsService.deleteJobs(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
