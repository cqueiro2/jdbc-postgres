package entities;

public class Product {
      private Long id;
      private String name;
      private Double price;
      private String description;
      private String imageUrl;

  
	  public Product() {
	}


	  public Product(Long id, String name, Double price, String description, String imageUrl) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public Long getId() {
		return id;
    }
    
	public void setId(Long id) {
		this.id = id;
    }
    
	public String getName() {
		return name;
    }
    
	public void setName(String name) {
		this.name = name;
    }
    
	public Double getPrice() {
		return price;
    }
    
	public void setPrice(Double Price) {
		this.price = price;
    }
    
	public String getDescription() {
		return description;
    }
    
	public void setDescription(String description) {
		this.description = description;
    }
    
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	




	@Override
	public String toString() {
		return "Product [description=" + description + ", id=" + id + ", imageUrl=" + imageUrl + ", name=" + name
				+ ", price=" + price + "]";
	}

	
	
    
}