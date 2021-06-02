package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.TechnologieService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Technologie;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
	private TechnologieService technologieService;
	@Autowired
	public TechnologiesController(TechnologieService technologieService) {
		super();
		this.technologieService = technologieService;
	}
	@GetMapping("/getall")
	public DataResult<List<Technologie>> getAll(){
		return this.technologieService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Technologie technologie) {
		return this.technologieService.add(technologie);
	}
}
