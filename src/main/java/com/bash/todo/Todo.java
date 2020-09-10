/**
 * 
 */
package com.bash.todo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author purip
 *
 */
@JsonIgnoreProperties (ignoreUnknown = true)
public class Todo {
	@JsonProperty("userId")
	private String userId;
	@JsonProperty("id")
	private String id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("completed")
	private boolean completed;
	
	@JsonProperty("userId")
	public String getUserId() {
		return userId;
	}
	
	@JsonProperty("userId")
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}
	
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}
	
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	@JsonProperty("completed")
	public boolean isCompleted() {
		return completed;
	}
	
	@JsonProperty("completed")
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	
	

}
