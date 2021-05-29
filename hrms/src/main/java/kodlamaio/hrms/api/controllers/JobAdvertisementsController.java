package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {
		private JobAdvertisementService jobAdvertisementService;
		
		@Autowired
		public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
			super();
			this.jobAdvertisementService = jobAdvertisementService;
		}
		@GetMapping("/getall")
		public DataResult<List<JobAdvertisement>> getAll(){
			return this.jobAdvertisementService.getAll();
		}
		@GetMapping("/getAllSortedByDate")
		public DataResult<List<JobAdvertisement>> getAllSortedByDate(){
			return this.jobAdvertisementService.getAllSortedByDate();
		}
		@GetMapping("/getByEmployerEmployerId")
		public DataResult<List<JobAdvertisement>> getByEmployer_EmployerId(int employerId){
			return this.jobAdvertisementService.getByEmployer_EmployerId(employerId);
		}
		
		
		@PostMapping("/add")
		public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
			return this.jobAdvertisementService.add(jobAdvertisement);
		}
		@PostMapping("/delete")
		public Result delete(@RequestBody JobAdvertisement jobAdvertisement) {
			return this.jobAdvertisementService.delete(jobAdvertisement);
		}
		
}
