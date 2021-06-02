package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.helpers.imageHelper.ImageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeDao;
import kodlamaio.hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService{

	private ResumeDao resumeDao;
	private ImageService imageService;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao, ImageService imageService) {
		super();
		this.resumeDao = resumeDao;
		this.imageService = imageService;
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(),"All Resumes Listed!");
	}

	@Override
	public Result add(Resume resume) {
		this.resumeDao.save(resume);
		return new SuccessResult("Resume Added!");
	}

	@Override
	public DataResult<List<Resume>> getByCandidate_CandidateId(int candidateId) {
		return new SuccessDataResult<List<Resume>>(
				this.resumeDao.getByCandidate_Id(candidateId),"All Resumes Listed By Candidate!");
	}

	@Override
	public Result addImage(int resumeId, MultipartFile file) {
		Map<String, String> result = (Map<String, String>) imageService.save(file).getData();
		Resume resume = this.resumeDao.getOne(resumeId);
		resume.setImageUrl(result.get("url"));
		this.resumeDao.save(resume);
		return new SuccessResult("Image Added!");
	}

}
