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


@PrimaryKeyJoinColumn(name="employer_id",referencedColumnName = "id")
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class Employer extends User {
	@Column(name="web_adress",nullable=false)
	private String webAdress;
		
	@Column(name="phone_number",nullable=false)
	private String phoneNumber;
	
	@Column(name="company_name",nullable=false)
	private String companyName;
	
	@OneToMany(mappedBy="employer")
	private List<JobAdvertisement> jobAdvertisement;
}
