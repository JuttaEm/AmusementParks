package hh.swd20.AmusementParks.domain;

public class Category {
	
	private long categoryId;
	private String categoryName;
	
	
	public Category(long categoryId, String categoryName) {
		super();
		this.categoryId = 0;
		this.categoryName = categoryName;
	}


	public Category() {
		super();
		this.categoryId = 0;
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
