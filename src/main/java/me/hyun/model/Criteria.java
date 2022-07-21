package me.hyun.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Criteria {
	private int page;
	private int perPageNum;
	
	private String keyword;
	private String type;
	
	public Criteria() {
		this(1,10);
	}
	
	public Criteria(int page, int perPageNum) {
		this.page = page;
		this.perPageNum = perPageNum;
	}
	
	public int getPageStart() { // #{pageStart}
		return (this.page-1) * perPageNum;
	}
	
	public void setPage(int page) {
		if(page<0) {
			this.page=1;
			return;
		}
		this.page=page;
	}
	
	// type = 'TC' ===> [T,C] collectiontype
	public String[] getTypeCollection() {
		return type !=null ? type.split("") : new String[] {};
	}
	
	
}
