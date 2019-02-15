package com.sailmi.sailplat.foundation.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.sailmi.sailplat.core.domain.IdEntity;

@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "tbl_group_class")
public class GroupClass extends IdEntity {
	// 分组类型名称
	private String gc_name;
	// 分组类型序列
	private int gc_sequence;

	// 分组父类型
	@ManyToOne(cascade = { CascadeType.ALL })
	private GroupClass parent;

	// 分组子类型
	@OneToMany(mappedBy = "parent", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@OrderBy("gc_sequence asc")
	@Fetch(FetchMode.SUBSELECT)
	private List<GroupClass> childs = new ArrayList();

	@OneToMany(mappedBy = "gg_gc", cascade = {javax.persistence.CascadeType.REMOVE })
	@Fetch(FetchMode.SUBSELECT)
	private List<GroupGoods> ggs = new ArrayList();


	// 分组类型水平
	private int gc_level;

	public List<GroupGoods> getGgs() {
		return this.ggs;
	}

	public void setGgs(List<GroupGoods> ggs) {
		this.ggs = ggs;
	}

	public int getGc_level() {
		return this.gc_level;
	}

	public void setGc_level(int gc_level) {
		this.gc_level = gc_level;
	}

	public String getGc_name() {
		return this.gc_name;
	}

	public void setGc_name(String gc_name) {
		this.gc_name = gc_name;
	}

	public int getGc_sequence() {
		return this.gc_sequence;
	}

	public void setGc_sequence(int gc_sequence) {
		this.gc_sequence = gc_sequence;
	}

	public GroupClass getParent() {
		return this.parent;
	}

	public void setParent(GroupClass parent) {
		this.parent = parent;
	}

	public List<GroupClass> getChilds() {
		return this.childs;
	}

	public void setChilds(List<GroupClass> childs) {
		this.childs = childs;
	}


}
