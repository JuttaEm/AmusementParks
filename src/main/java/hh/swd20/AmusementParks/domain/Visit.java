/*package hh.swd20.AmusementParks.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Visit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long visitId;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date visitDate;
	
	@ManyToOne
	@JsonIgnoreProperties("visits")
	@JoinColumn(name = "parkId")
	private Park park;

	public Visit(Date visitDate, Park park) {
		super();
		this.visitDate = visitDate;
		this.park = park;
	}

	public Visit(Date visitDate) {
		super();
		this.visitDate = visitDate;
		this.park = null;
	}

	public Visit() {
		super();
		this.visitDate = null;
		this.park = null;
	}

	public long getVisitId() {
		return visitId;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public Park getPark() {
		return park;
	}

	public void setVisitId(long visitId) {
		this.visitId = visitId;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	@Override
	public String toString() {
		return "Visit [visitId=" + visitId + ", visitDate=" + visitDate + ", park=" + park + "]";
	}
	
	
	
	
	
	

}*/
