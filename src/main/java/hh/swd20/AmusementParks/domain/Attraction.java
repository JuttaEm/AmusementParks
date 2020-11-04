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
	@JsonIgnoreProperties ("attractions")
	@JoinColumn(name = "categoryId")
	private Category category;
	
	public Attraction(String attractionName, int attractionScore, String comment, Category category) {
		super();
		this.attractionId = 0;
		this.attractionName = attractionName;
		this.attractionScore = attractionScore;
		this.comment = comment;
		this.category = category;
	}


	public Attraction() {
		super();
		this.attractionId = 0;
		this.attractionName = null;
		this.attractionScore = 0;
		this.comment = null;
		this.category = null;
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


	@Override
	public String toString() {
		if (this.category != null)
			return "Attraction [attractionId=" + attractionId + ", attractionName=" + attractionName + ", attractionScore="
					+ attractionScore + ", comment=" + comment + ", category=" + category + "]";
		else
			return "Attraction [attractionId=" + attractionId + ", attractionName=" + attractionName + ", attractionScore="
				+ attractionScore + ", comment=" + comment + "]";
	}
	
	
	
	
	
	
	

}
