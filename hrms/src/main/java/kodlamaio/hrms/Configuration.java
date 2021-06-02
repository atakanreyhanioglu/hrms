package kodlamaio.hrms;

import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.utilities.helpers.imageHelper.CloudinaryManager;
import kodlamaio.hrms.core.utilities.helpers.imageHelper.ImageService;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public ImageService imageService() {
		return new CloudinaryManager(cloudinary());
	}

	@Bean
	public Cloudinary cloudinary() {
		return new Cloudinary(ObjectUtils.asMap("cloud_name", "kodlamaio",
				"api_key", "828786576546177", "api_secret","P43D8sflhgU_yhVhRZI2l8AEYUQ"));
	}

}
