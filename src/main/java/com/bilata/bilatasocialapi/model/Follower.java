package com.bilata.bilatasocialapi.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "followers")
public class Follower {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "userId")
	private String userId;
	@Column(name = "target_userId")
	private String target_userId;
	
	private Set Influencer;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTarget_userId() {
		return target_userId;
	}
	public void setTarget_userId(String target_userId) {
		this.target_userId = target_userId;
	}
	
	public Set getInfluencer() {
		return Influencer;
	}
	public void setInfluencer(Set influencer) {
		Influencer = influencer;
	}
	
	@ManyToMany
	@JoinTable(name = "userId",
	joinColumns = @JoinColumn(name = "userId"),
	inverseJoinColumns = @JoinColumn(name = "userId"))
	
	@Override
	public String toString() {
		return "Follower [id=" + id + ", userId=" + userId + ", target_userId=" + target_userId + "]";
	}

}
