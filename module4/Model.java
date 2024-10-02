package module4;
public class Model {
	 private String firstname;
	 private String lastname;
	 public Model(String firstname, String lastname) {
	  this.firstname = firstname;
	  this.lastname = lastname;
	 }
	 public String getFirstname() {
	  return firstname;
	 }
	 public void setFirstname(String firstname) {
	  this.firstname = firstname;
	 }
	 public String getLastname() {
	  return lastname;
	 }
	 public void setLastname(String lastname) {
	  this.lastname = lastname;
	 }
	}