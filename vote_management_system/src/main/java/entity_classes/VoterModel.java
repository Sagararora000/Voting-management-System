package entity_classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoterModel {
	@Id
	private int voter_id;
	private String voter_name;
	private String voter_address;
	private int voter_age;
	private String voter_gender;
	private String father_name;
	private String mother_name;
	
	public VoterModel() {
		// TODO Auto-generated constructor stub
	}

	public VoterModel(int voter_id, String voter_name, String voter_address, int voter_age, String voter_gender,
			String father_name, String mother_name) {
		super();
		this.voter_id = voter_id;
		this.voter_name = voter_name;
		this.voter_address = voter_address;
		this.voter_age = voter_age;
		this.voter_gender = voter_gender;
		this.father_name = father_name;
		this.mother_name = mother_name;
	}

	public int getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(int voter_id) {
		this.voter_id = voter_id;
	}

	public String getVoter_name() {
		return voter_name;
	}

	public void setVoter_name(String voter_name) {
		this.voter_name = voter_name;
	}

	public String getVoter_address() {
		return voter_address;
	}

	public void setVoter_address(String voter_address) {
		this.voter_address = voter_address;
	}

	public int getVoter_age() {
		return voter_age;
	}

	public void setVoter_age(int voter_age) {
		this.voter_age = voter_age;
	}

	public String getVoter_gender() {
		return voter_gender;
	}

	public void setVoter_gender(String voter_gender) {
		this.voter_gender = voter_gender;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	@Override
	public String toString() {
		return "Voter [voter_id=" + voter_id + ", voter_name=" + voter_name + ", voter_address=" + voter_address
				+ ", voter_age=" + voter_age + ", voter_gender=" + voter_gender + ", father_name=" + father_name
				+ ", mother_name=" + mother_name + "]";
	}
}
