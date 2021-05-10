package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.WorkingPositionService;
import kodlamaio.hrms.entities.concretes.WorkingPosition;

@RestController
@RequestMapping("/api/workingpositions")
public class WorkingPositionsController {
	
	private WorkingPositionService workingPositionService;
	
	@Autowired
	public WorkingPositionsController(WorkingPositionService workingPositionService) {
		super();
		this.workingPositionService = workingPositionService;
	}

	@GetMapping("/getall")
	public List<WorkingPosition> getAll(){
		return this.workingPositionService.getAll();
	}
	
}
