package kodlamaio.hrms.core.utilities.helpers.imageHelper;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;

public class CloudinaryManager implements ImageService{

	private Cloudinary cloudinary;
	@Autowired
    public CloudinaryManager(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }
	@Override
	public DataResult<Map> save(MultipartFile file) { try {
		 Map uploadResult = cloudinary.uploader().upload(file.getBytes(),ObjectUtils.emptyMap());

         return new SuccessDataResult<Map>(uploadResult);
     } catch (IOException e) {

         e.printStackTrace();
     }
	 return new ErrorDataResult<Map>();
}

}
