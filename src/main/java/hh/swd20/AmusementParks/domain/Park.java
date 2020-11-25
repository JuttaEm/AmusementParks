package hh.swd20.AmusementParks.domain;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Park {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long parkId;
	private String parkName;
	private int parkScore;
	private String webpage;
	private String country;
	private String city;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "park")
	@JsonIgnoreProperties("park")
	private List<Attraction> attractions;
	
	/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "park")
	@JsonIgnoreProperties("park")
	private List<Visit> visits;*/
	
	
	/*public Park(String parkName, int parkScore, String webpage, String country, String city, List<Attraction> attractions, List<Visit> visits) {
		super();
		this.parkName = parkName;
		this.parkScore = parkScore;
		this.webpage = webpage;
		this.country = country;
		this.city = city;
		this.attractions = attractions;
		this.visits = visits;
	}*/
	
	public Park(String parkName, int parkScore, String webpage, String country, String city, List<Attraction> attractions) {
		super();
		this.parkName = parkName;
		this.parkScore = parkScore;
		this.webpage = webpage;
		this.country = country;
		this.city = city;
		this.attractions = attractions;
		//this.visits = new ArrayList<>();
	}
	
	public Park(String parkName, int parkScore, String webpage, String country, String city) {
		super();
		this.parkName = parkName;
		this.parkScore = parkScore;
		this.webpage = webpage;
		this.country = country;
		this.city = city;
		this.attractions = new ArrayList<>();
		//this.visits = new ArrayList<>();
	}

	public Park() {
		super();
		this.parkName = null;
		this.parkScore = 0;
		this.webpage = null;
		this.country = null;
		this.city = null;
		this.attractions = new ArrayList<>();
		//this.visits = new ArrayList<>();
	}

	public long getParkId() {
		return parkId;
	}

	public String getParkName() {
		return parkName;
	}

	public int getParkScore() {
		return parkScore;
	}

	public String getWebpage() {
		return webpage;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}
	
	public List<Attraction> getAttractions() {
		return attractions;
	}

	/*public List<Visit> getVisits() {
		return visits;
	}*/

	public void setParkId(long parkId) {
		this.parkId = parkId;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public void setParkScore(int parkScore) {
		this.parkScore = parkScore;
	}

	public void setWebpage(String webpage) {
		this.webpage = webpage;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void setAttractions(List<Attraction> attractions) {
		this.attractions = attractions;
	}

	@Override
	public String toString() {
		return "Park [parkId=" + parkId + ", parkName=" + parkName + ", parkScore=" + parkScore + ", webpage=" + webpage
				+ ", country=" + country + ", city=" + city + "]";
	}

	/*public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

	@Override
	public String toString() {
		return "Park [parkId=" + parkId + ", parkName=" + parkName + ", parkScore=" + parkScore + ", webpage=" + webpage
				+ ", country=" + country + ", city=" + city + ", attractions=" + attractions + ", visits=" + visits
				+ "]";
	}*/
	
	
	


	
	
	
	
	
	
	

}
