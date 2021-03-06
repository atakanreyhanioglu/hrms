package kodlamaio.hrms.entities.concretes;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="job_titles")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class JobTitle {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="job_title_id")
		private int id;
		
		@Column(name="title",unique=true,nullable=false)
		private String title;
		
		
		@OneToMany(mappedBy="jobTitle")
		private List<JobAdvertisement> jobAdvertisement;

		
}
