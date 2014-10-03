package com.jpl.teleweb.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * A user.
 */

@Document(collection = "T_RAW_LINE")
public class RawLine implements Serializable {

	@NotNull
	@Id
	private final ObjectId id = ObjectId.get();

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	@NotNull
	@Size(min = 0, max = 100)
	private String line;

	@CreatedDate
	@Field("created_date")
	private DateTime createdDate = DateTime.now();

	public DateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		RawLine rawLine = (RawLine) o;

		if (!id.equals(rawLine.id)) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		return (id).hashCode();
	}

	@Override
	public String toString() {
		return "User{" + "line='" + line + '\'' + ", createdDate='" + createdDate + '\'' + "}";
	}
}
