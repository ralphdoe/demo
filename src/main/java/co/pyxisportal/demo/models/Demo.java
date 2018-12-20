package co.pyxisportal.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Demo {
	private Long id;
	private String name;
	private String description;
	private Date actualDate;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Date getActualDate() {
		return actualDate;
	}

	public void setActualDate(final Date actualDate) {
		this.actualDate = actualDate;
	}

}
