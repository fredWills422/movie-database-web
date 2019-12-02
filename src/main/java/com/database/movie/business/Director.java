package com.database.movie.business;

import java.sql.Date;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Director {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToMany(targetEntity=Movie.class, mappedBy="director", 
			cascade=CascadeType.ALL)
	@Column(name="Movies")
	private Map<Director, Movie> movies;
	@Column(name= "First_Name", nullable=false)
	private String firstName;
	@Column(name= "Last_Name", nullable=false)
	private String lastName;
	@Column(name= "Date_of_Birth", nullable=false)
	private Date dateOfBirth;
	@Column(name="Supporting_Studio")
	private String supportinStudio;
	
	public Director() {}

	public Director(int id, Map<Director, Movie> movies, String firstName,
			String lastName, Date dateOfBirth, String supportinStudio) {
		super();
		this.id = id;
		this.movies = movies;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.supportinStudio = supportinStudio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Director, Movie> getMovies() {
		return movies;
	}

	public void setMovies(Map<Director, Movie> movies) {
		this.movies = movies;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSupportinStudio() {
		return supportinStudio;
	}

	public void setSupportinStudio(String supportinStudio) {
		this.supportinStudio = supportinStudio;
	}

	@Override
	public String toString() {
		return "Director [id=" + id 
				//+ ", movie=" + movie 
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", supportinStudio=" 
				+ supportinStudio + "]";
	}

	
	
	
}
