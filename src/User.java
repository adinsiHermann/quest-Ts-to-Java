import java.util.Date;
import java.util.List;

public class User {
	
   private Date birthdate ;
   private Integer size;
   private List<Photo> photo;
   private Address address;
   

   
   public User (Date birthdate, Integer size, List<Photo> photo,Address address) {
	  
	   this.birthdate = birthdate;
	   this.size = size;
	   this.photo = photo;
	   this.address = address;
			   
		
	   
   }



public Date getBirthdate() {
	return birthdate;
}



public void setBirthdate(Date birthdate) {
	this.birthdate = birthdate;
}



public Integer getSize() {
	return size;
}



public void setSize(Integer size) {
	this.size = size;
}



public List<Photo> getPhoto() {
	return photo;
}



public void setPhoto(List<Photo> photo) {
	this.photo = photo;
}



public Address getAddress() {
	return address;
}



public void setAddress(Address address) {
	this.address = address;
}

   

}


