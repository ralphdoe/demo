package co.pyxisportal.demo.dtos;

import java.util.Date;

public class DemoDTO {
	private Long id;
	private String name;
	private String description;
	private Date actualDate;

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
