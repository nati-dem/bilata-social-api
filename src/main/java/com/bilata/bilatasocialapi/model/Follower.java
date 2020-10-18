package com.bilata.bilatasocialapi.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "followers")
@Table(name = "followers")
public class Follower {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "target_user_id")
	private Integer target_user_id;
	
//    private Set<Influencer> influencers;
	
	public Follower() {
		super();
	}

	public Follower(Integer id, Integer userId, Integer targetUserId) {
		super();
		this.id = id;
		this.userId = userId;
		this.target_user_id = targetUserId;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Column(name = "target_user_id")
	public Integer getTarget_user_id() {
		return target_user_id;
	}
	
	public void setTarget_user_id(Integer targetUserId) {
		this.target_user_id = target_user_id;
	}
	//	@OneToMany(mappedBy = "followers", cascade = CascadeType.ALL)
//	public Set<Influencer> getInfluencers() {
//		return influencers;
//	}
//	public void setInfluencers(Set<Influencer> influencers) {
//		this.influencers = influencers;
//	}
	@Override
	public String toString() {
		return "Follower [id=" + id + ", userId=" + userId + ", target_userId=" + target_user_id + "]";
	}
	  
}
