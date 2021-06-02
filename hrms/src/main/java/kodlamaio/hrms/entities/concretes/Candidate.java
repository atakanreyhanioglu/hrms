package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@PrimaryKeyJoinColumn(name="candidate_id",referencedColumnName = "id")
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name="candidates")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume"})
public class Candidate extends User{
		
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name",nullable=false)
	private String lastName;
	
	@Column(name="identity_number",nullable=false)
	private String identityNumber;
	
	@Column(name="birth_year",nullable=false)
	private int birthYear;
	
	@OneToMany(mappedBy="candidate")
	private List<Resume> resume;

	
	
}
