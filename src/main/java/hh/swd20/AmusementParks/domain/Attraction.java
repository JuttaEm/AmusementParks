package hh.swd20.AmusementParks.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Attraction {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long attractionId;
	private String attractionName;
	private int attractionScore;
	private String comment;
	
	
	@ManyToOne
	@JsonIgnoreProperties("attractions")
	@JoinColumn(name = "parkId")
	private Park park;
	
	
	@ManyToOne
	@JsonIgnoreProperties("attractions")
	@JoinColumn(name = "categoryId")
	private Category category;
	
	
	public Attraction(String attractionName, int attractionScore, String comment, Category category, Park park) {
		super();
		this.attractionName = attractionName;
		this.attractionScore = attractionScore;
		this.comment = comment;
		this.category = category;
		this.park = park;
	}
	
	public Attraction(String attractionName, int attractionScore, String comment, Category category) {
		super();
		this.attractionName = attractionName;
		this.attractionScore = attractionScore;
		this.comment = comment;
		this.category = category;
		this.park = null;
	}


	public Attraction() {
		super();
		this.attractionName = null;
		this.attractionScore = 0;
		this.comment = null;
		this.category = null;
		this.park = null;
	}


	public long getAttractionId() {
		return attractionId;
	}


	public String getAttractionName() {
		return attractionName;
	}


	public int getAttractionScore() {
		return attractionScore;
	}


	public String getComment() {
		return comment;
	}
	
	
	public Category getCategory() {
		return category;
	}
	
	
	public Park getPark() {
		return park;
	}

	public void setAttractionId(long attractionId) {
		this.attractionId = attractionId;
	}

	public void setAttractionName(String attractionName) {
		this.attractionName = attractionName;
	}


	public void setAttractionScore(int attractionScore) {
		this.attractionScore = attractionScore;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}
	

	public void setCategory(Category category) {
		this.category = category;
	}
	

	public void setPark(Park park) {
		this.park = park;
	}


	@Override
	public String toString() {
		if (this.category != null && this.park != null)
			return "Attraction [attractionId=" + attractionId + ", attractionName=" + attractionName + ", attractionScore="
					+ attractionScore + ", comment=" + comment + ", category=" + category + ", park=" + park + "]";
		else
			return "Attraction [attractionId=" + attractionId + ", attractionName=" + attractionName + ", attractionScore="
				+ attractionScore + ", comment=" + comment + "]";
	}
	
	
	
	
	
	
	

}
