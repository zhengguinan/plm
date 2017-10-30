package org.zgn.plm.beans;

import lombok.Data;

import java.io.Serializable;

@Data
public class Config implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name, description, value;

	private long id;
	
	/**
	 * 创建者，demo使用字符串，实际上应该用对象id
	 */
	private String creator;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
}
