package hh.swd20.AmusementParks.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryId;
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	@JsonIgnoreProperties("category")
	private List<Attraction> attractions;
	
	
	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}


	public Category() {
		super();
		this.categoryName = null;
	}


	public long getCategoryId() {
		return categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}
	
	
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

		
	
	
	
	

}
