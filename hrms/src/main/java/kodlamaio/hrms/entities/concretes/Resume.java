package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name="resumes")
@AllArgsConstructor
@NoArgsConstructor
public class Resume {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "resume_id")
		private int id;
		
		@ManyToOne()
		@JoinColumn(name = "candidate_id")
		private Candidate candidate;
		
		@Column(name = "github_adress", nullable=true)
		private String githubAdress;
		
		@Column(name = "linkedin_adress", nullable=true)
		private String linkedinAdress;	
		
		@Column(name = "image_url")
		private String imageUrl;
		
		
		@OneToMany(mappedBy = "resume")
		private List<WorkExperience> workExperiences;
		
		@OneToMany(mappedBy = "resume")
		private List<ForeignLanguage> foreignLanguages;
		
		@OneToMany(mappedBy = "resume")
		private List<Technologie> technologies;
		
		@OneToMany(mappedBy = "resume")
		private List<CoverLetter> coverLetters;
		
		@OneToMany(mappedBy = "resume")
		private List<Education> educations;
		
		
		
		
		
}
