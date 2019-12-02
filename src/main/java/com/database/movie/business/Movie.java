package com.database.movie.business;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(uniqueConstraints=@UniqueConstraint(name="UIDX_director", columnNames={"director"}))
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="Director", nullable = false)
	private Director director;
	@Column(name = "Name", nullable = false)
	private String name;
	@Column(name = "Runtime", nullable = false)
	private String runtime;
	@Column(name = "Genre", nullable = false)
	private String genre;
	@Column(name="Price", nullable = false)
	private double price;
	
	public Movie() {}

	public Movie(int id, String name,
			String runtime, String genre, double price) {
		super();
		this.id = id;
		//this.director = director;
		this.name = name;
		this.runtime = runtime;
		this.genre = genre;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Director getDirector() {
//		return director;
//	}

//	public void setDirector(Director director) {
//		this.director = director;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id 
				//+ ", director=" + director 
				+ ", name=" + name + ", runtime=" + runtime 
				+ ", genre="+ genre + ", price=" + price + "]";
	}
	
}
