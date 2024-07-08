package entity_classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserModel {
	@Id
	private int u_id;
	private String name;
	private int age;
	private String password;
	@OneToOne
	private VoterModel voter;
	
	public UserModel() {
		// TODO Auto-generated constructor stub
	}
	public UserModel(int u_id, String name, int age, String password, VoterModel voter) {
		super();
		this.u_id = u_id;
		this.name = name;
		this.age = age;
		this.password = password;
		this.voter = voter;
	}
	@Override
	public String toString() {
		return "UserModel [u_id=" + u_id + ", name=" + name + ", age=" + age + ", password=" + password + ", voter="
				+ voter + "]";
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public VoterModel getVoter() {
		return voter;
	}
	public void setVoter(VoterModel voter) {
		this.voter = voter;
	}
	
	
}
