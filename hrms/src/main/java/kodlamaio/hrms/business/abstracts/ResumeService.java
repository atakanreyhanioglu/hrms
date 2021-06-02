package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Resume;

public interface ResumeService {
	DataResult<List<Resume>> getAll();
	DataResult<List<Resume>> getByCandidate_CandidateId(int candidateId);
	Result add(Resume resume);
	Result addImage(int id,MultipartFile file);

}
