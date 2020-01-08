package com.hcl.model;

public class Community {
	
	private String communityId;
	private String communityName;
	
	public Community(String communityId,String communityName){
		this.communityId=communityId;
		this.communityName=communityName;
		
	}
	
	public String getCommunityId() {
		return communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	
	
}
