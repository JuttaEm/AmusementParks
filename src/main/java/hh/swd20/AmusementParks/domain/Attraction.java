package hh.swd20.AmusementParks.domain;

public class Attraction {
	
	private long attractionId;
	private String attractionName;
	private int attractionScore;
	private String comment;
	
	
	public Attraction(long attractionId, String attractionName, int attractionScore, String comment) {
		super();
		this.attractionId = 0;
		this.attractionName = attractionName;
		this.attractionScore = attractionScore;
		this.comment = comment;
	}


	public Attraction() {
		super();
		this.attractionId = 0;
		this.attractionName = null;
		this.attractionScore = 0;
		this.comment = null;
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


	@Override
	public String toString() {
		return "Attraction [attractionId=" + attractionId + ", attractionName=" + attractionName + ", attractionScore="
				+ attractionScore + ", comment=" + comment + "]";
	}
	
	
	
	
	
	
	

}
