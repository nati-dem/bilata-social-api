package com.bilata.bilatasocialapi.model;

public class Influencer extends User{
	
	private int userId;
	private String igUserName;
	private String fbUserName;
	private String bio;
	public Influencer(int userId, String igUserName, String fbUserName, String bio) {
		super();
		this.userId = userId;
		this.igUserName = igUserName;
		this.fbUserName = fbUserName;
		this.bio = bio;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getIgUserName() {
		return igUserName;
	}
	public void setIgUserName(String igUserName) {
		this.igUserName = igUserName;
	}
	public String getFbUserName() {
		return fbUserName;
	}
	public void setFbUserName(String fbUserName) {
		this.fbUserName = fbUserName;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	@Override
	public String toString() {
		return "Influencer [userId=" + userId + ", igUserName=" + igUserName + ", fbUserName=" + fbUserName + ", bio="
				+ bio + "]";
	}
	
}
