package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblBrandcategory generated by hbm2java
 */
@Entity
@Table(name = "tbl_brandcategory", catalog = "sailplat")
public class TblBrandcategory implements java.io.Serializable {

	private Long id;
	private Date addTime;
	private boolean deleteStatus;
	private String name;
	private int sequence;
	private Set<TblGoodsbrand> tblGoodsbrands = new HashSet<TblGoodsbrand>(0);

	public TblBrandcategory() {
	}

	public TblBrandcategory(boolean deleteStatus, int sequence) {
		this.deleteStatus = deleteStatus;
		this.sequence = sequence;
	}

	public TblBrandcategory(Date addTime, boolean deleteStatus, String name, int sequence,
			Set<TblGoodsbrand> tblGoodsbrands) {
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.name = name;
		this.sequence = sequence;
		this.tblGoodsbrands = tblGoodsbrands;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "addTime", length = 19)
	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	@Column(name = "deleteStatus", nullable = false)
	public boolean isDeleteStatus() {
		return this.deleteStatus;
	}

	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sequence", nullable = false)
	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblBrandcategory")
	public Set<TblGoodsbrand> getTblGoodsbrands() {
		return this.tblGoodsbrands;
	}

	public void setTblGoodsbrands(Set<TblGoodsbrand> tblGoodsbrands) {
		this.tblGoodsbrands = tblGoodsbrands;
	}

}