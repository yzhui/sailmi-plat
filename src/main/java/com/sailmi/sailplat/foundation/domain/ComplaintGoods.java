package com.sailmi.sailplat.foundation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sailmi.database.domain.IdEntity;
/**
 * 举报商品
 * @author 
 *
 */
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "tbl_complaint_goods")
public class ComplaintGoods extends IdEntity {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 688451202252628683L;
	
	//商品
	@ManyToOne
	private Goods goods;
	
	//内容
	@Column(columnDefinition = "LongText")
	private String content;
	
	//举报
	@ManyToOne
	private Complaint complaint;

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Complaint getComplaint() {
		return this.complaint;
	}

	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}
}
