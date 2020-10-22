package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblStore generated by hbm2java
 */
@Entity
@Table(name = "tbl_store", catalog = "sailplat")
public class TblStore implements java.io.Serializable {

	private Long id;
	private TblAccessory tblAccessoryByCardId;
	private TblAccessory tblAccessoryByWeixinQrImgId;
	private TblAccessory tblAccessoryByStoreWeixinLogoId;
	private TblAccessory tblAccessoryByStoreLicenseId;
	private TblAccessory tblAccessoryByStoreLogoId;
	private TblAccessory tblAccessoryByStoreBannerId;
	private TblArea tblArea;
	private TblStoreclass tblStoreclass;
	private TblStoregrade tblStoregradeByGradeId;
	private TblStoregrade tblStoregradeByUpdateGradeId;
	private Date addTime;
	private boolean deleteStatus;
	private boolean cardApprove;
	private boolean realstoreApprove;
	private String storeAddress;
	private int storeCredit;
	private String storeInfo;
	private String storeMsn;
	private String storeName;
	private String storeOwer;
	private String storeOwerCard;
	private String storeQq;
	private boolean storeRecommend;
	private Date storeRecommendTime;
	private String storeSeoDescription;
	private String storeSeoKeywords;
	private int storeStatus;
	private String storeTelephone;
	private String storeZip;
	private String template;
	private Date validity;
	private String violationReseaon;
	private Integer domainModifyCount;
	private String storeSecondDomain;
	private Integer favoriteCount;
	private BigDecimal storeLat;
	private BigDecimal storeLng;
	private String storeWw;
	private String mapType;
	private Date deliveryBeginTime;
	private Date deliveryEndTime;
	private Date combinBeginTime;
	private Date combinEndTime;
	private Date weixinBeginTime;
	private Date weixinEndTime;
	private Integer weixinStatus;
	private String weixinAppId;
	private String weixinAppSecret;
	private String weixinToken;
	private String weixinWelecomeContent;
	private String weixinAccount;
	private String weixinStoreName;
	private Set<TblCombinLog> tblCombinLogs = new HashSet<TblCombinLog>(0);
	private Set<TblVmessage> tblVmessages = new HashSet<TblVmessage>(0);
	private Set<TblPayment> tblPayments = new HashSet<TblPayment>(0);
	private Set<TblStoreNav> tblStoreNavs = new HashSet<TblStoreNav>(0);
	private Set<TblVmenu> tblVmenus = new HashSet<TblVmenu>(0);
	private Set<TblStorePartner> tblStorePartners = new HashSet<TblStorePartner>(0);
	private Set<TblTransport> tblTransports = new HashSet<TblTransport>(0);
	private Set<TblStorecart> tblStorecarts = new HashSet<TblStorecart>(0);
	private Set<TblShipping> tblShippings = new HashSet<TblShipping>(0);
	private Set<TblDynamic> tblDynamics = new HashSet<TblDynamic>(0);
	private Set<TblStoreSlide> tblStoreSlides = new HashSet<TblStoreSlide>(0);
	private Set<TblUser> tblUsers = new HashSet<TblUser>(0);
	private Set<TblStoregradeLog> tblStoregradeLogs = new HashSet<TblStoregradeLog>(0);
	private Set<TblOrderform> tblOrderforms = new HashSet<TblOrderform>(0);
	private Set<TblGoodsclassstaple> tblGoodsclassstaples = new HashSet<TblGoodsclassstaple>(0);
	private Set<TblGoods> tblGoodses = new HashSet<TblGoods>(0);
	private Set<TblDeliveryLog> tblDeliveryLogs = new HashSet<TblDeliveryLog>(0);
	private Set<TblDocument> tblDocuments = new HashSet<TblDocument>(0);
	private Set<TblFavorite> tblFavorites = new HashSet<TblFavorite>(0);
	private Set<TblWatermark> tblWatermarks = new HashSet<TblWatermark>(0);
	private Set<TblVlog> tblVlogs = new HashSet<TblVlog>(0);
	private Set<TblStorePoint> tblStorePoints = new HashSet<TblStorePoint>(0);

	public TblStore() {
	}

	public TblStore(boolean deleteStatus, boolean cardApprove, boolean realstoreApprove, int storeCredit,
			boolean storeRecommend, int storeStatus) {
		this.deleteStatus = deleteStatus;
		this.cardApprove = cardApprove;
		this.realstoreApprove = realstoreApprove;
		this.storeCredit = storeCredit;
		this.storeRecommend = storeRecommend;
		this.storeStatus = storeStatus;
	}

	public TblStore(TblAccessory tblAccessoryByCardId, TblAccessory tblAccessoryByWeixinQrImgId,
			TblAccessory tblAccessoryByStoreWeixinLogoId, TblAccessory tblAccessoryByStoreLicenseId,
			TblAccessory tblAccessoryByStoreLogoId, TblAccessory tblAccessoryByStoreBannerId, TblArea tblArea,
			TblStoreclass tblStoreclass, TblStoregrade tblStoregradeByGradeId,
			TblStoregrade tblStoregradeByUpdateGradeId, Date addTime, boolean deleteStatus, boolean cardApprove,
			boolean realstoreApprove, String storeAddress, int storeCredit, String storeInfo, String storeMsn,
			String storeName, String storeOwer, String storeOwerCard, String storeQq, boolean storeRecommend,
			Date storeRecommendTime, String storeSeoDescription, String storeSeoKeywords, int storeStatus,
			String storeTelephone, String storeZip, String template, Date validity, String violationReseaon,
			Integer domainModifyCount, String storeSecondDomain, Integer favoriteCount, BigDecimal storeLat,
			BigDecimal storeLng, String storeWw, String mapType, Date deliveryBeginTime, Date deliveryEndTime,
			Date combinBeginTime, Date combinEndTime, Date weixinBeginTime, Date weixinEndTime, Integer weixinStatus,
			String weixinAppId, String weixinAppSecret, String weixinToken, String weixinWelecomeContent,
			String weixinAccount, String weixinStoreName, Set<TblCombinLog> tblCombinLogs,
			Set<TblVmessage> tblVmessages, Set<TblPayment> tblPayments, Set<TblStoreNav> tblStoreNavs,
			Set<TblVmenu> tblVmenus, Set<TblStorePartner> tblStorePartners, Set<TblTransport> tblTransports,
			Set<TblStorecart> tblStorecarts, Set<TblShipping> tblShippings, Set<TblDynamic> tblDynamics,
			Set<TblStoreSlide> tblStoreSlides, Set<TblUser> tblUsers, Set<TblStoregradeLog> tblStoregradeLogs,
			Set<TblOrderform> tblOrderforms, Set<TblGoodsclassstaple> tblGoodsclassstaples, Set<TblGoods> tblGoodses,
			Set<TblDeliveryLog> tblDeliveryLogs, Set<TblDocument> tblDocuments, Set<TblFavorite> tblFavorites,
			Set<TblWatermark> tblWatermarks, Set<TblVlog> tblVlogs, Set<TblStorePoint> tblStorePoints) {
		this.tblAccessoryByCardId = tblAccessoryByCardId;
		this.tblAccessoryByWeixinQrImgId = tblAccessoryByWeixinQrImgId;
		this.tblAccessoryByStoreWeixinLogoId = tblAccessoryByStoreWeixinLogoId;
		this.tblAccessoryByStoreLicenseId = tblAccessoryByStoreLicenseId;
		this.tblAccessoryByStoreLogoId = tblAccessoryByStoreLogoId;
		this.tblAccessoryByStoreBannerId = tblAccessoryByStoreBannerId;
		this.tblArea = tblArea;
		this.tblStoreclass = tblStoreclass;
		this.tblStoregradeByGradeId = tblStoregradeByGradeId;
		this.tblStoregradeByUpdateGradeId = tblStoregradeByUpdateGradeId;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.cardApprove = cardApprove;
		this.realstoreApprove = realstoreApprove;
		this.storeAddress = storeAddress;
		this.storeCredit = storeCredit;
		this.storeInfo = storeInfo;
		this.storeMsn = storeMsn;
		this.storeName = storeName;
		this.storeOwer = storeOwer;
		this.storeOwerCard = storeOwerCard;
		this.storeQq = storeQq;
		this.storeRecommend = storeRecommend;
		this.storeRecommendTime = storeRecommendTime;
		this.storeSeoDescription = storeSeoDescription;
		this.storeSeoKeywords = storeSeoKeywords;
		this.storeStatus = storeStatus;
		this.storeTelephone = storeTelephone;
		this.storeZip = storeZip;
		this.template = template;
		this.validity = validity;
		this.violationReseaon = violationReseaon;
		this.domainModifyCount = domainModifyCount;
		this.storeSecondDomain = storeSecondDomain;
		this.favoriteCount = favoriteCount;
		this.storeLat = storeLat;
		this.storeLng = storeLng;
		this.storeWw = storeWw;
		this.mapType = mapType;
		this.deliveryBeginTime = deliveryBeginTime;
		this.deliveryEndTime = deliveryEndTime;
		this.combinBeginTime = combinBeginTime;
		this.combinEndTime = combinEndTime;
		this.weixinBeginTime = weixinBeginTime;
		this.weixinEndTime = weixinEndTime;
		this.weixinStatus = weixinStatus;
		this.weixinAppId = weixinAppId;
		this.weixinAppSecret = weixinAppSecret;
		this.weixinToken = weixinToken;
		this.weixinWelecomeContent = weixinWelecomeContent;
		this.weixinAccount = weixinAccount;
		this.weixinStoreName = weixinStoreName;
		this.tblCombinLogs = tblCombinLogs;
		this.tblVmessages = tblVmessages;
		this.tblPayments = tblPayments;
		this.tblStoreNavs = tblStoreNavs;
		this.tblVmenus = tblVmenus;
		this.tblStorePartners = tblStorePartners;
		this.tblTransports = tblTransports;
		this.tblStorecarts = tblStorecarts;
		this.tblShippings = tblShippings;
		this.tblDynamics = tblDynamics;
		this.tblStoreSlides = tblStoreSlides;
		this.tblUsers = tblUsers;
		this.tblStoregradeLogs = tblStoregradeLogs;
		this.tblOrderforms = tblOrderforms;
		this.tblGoodsclassstaples = tblGoodsclassstaples;
		this.tblGoodses = tblGoodses;
		this.tblDeliveryLogs = tblDeliveryLogs;
		this.tblDocuments = tblDocuments;
		this.tblFavorites = tblFavorites;
		this.tblWatermarks = tblWatermarks;
		this.tblVlogs = tblVlogs;
		this.tblStorePoints = tblStorePoints;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "card_id")
	public TblAccessory getTblAccessoryByCardId() {
		return this.tblAccessoryByCardId;
	}

	public void setTblAccessoryByCardId(TblAccessory tblAccessoryByCardId) {
		this.tblAccessoryByCardId = tblAccessoryByCardId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "weixin_qr_img_id")
	public TblAccessory getTblAccessoryByWeixinQrImgId() {
		return this.tblAccessoryByWeixinQrImgId;
	}

	public void setTblAccessoryByWeixinQrImgId(TblAccessory tblAccessoryByWeixinQrImgId) {
		this.tblAccessoryByWeixinQrImgId = tblAccessoryByWeixinQrImgId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_weixin_logo_id")
	public TblAccessory getTblAccessoryByStoreWeixinLogoId() {
		return this.tblAccessoryByStoreWeixinLogoId;
	}

	public void setTblAccessoryByStoreWeixinLogoId(TblAccessory tblAccessoryByStoreWeixinLogoId) {
		this.tblAccessoryByStoreWeixinLogoId = tblAccessoryByStoreWeixinLogoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_license_id")
	public TblAccessory getTblAccessoryByStoreLicenseId() {
		return this.tblAccessoryByStoreLicenseId;
	}

	public void setTblAccessoryByStoreLicenseId(TblAccessory tblAccessoryByStoreLicenseId) {
		this.tblAccessoryByStoreLicenseId = tblAccessoryByStoreLicenseId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_logo_id")
	public TblAccessory getTblAccessoryByStoreLogoId() {
		return this.tblAccessoryByStoreLogoId;
	}

	public void setTblAccessoryByStoreLogoId(TblAccessory tblAccessoryByStoreLogoId) {
		this.tblAccessoryByStoreLogoId = tblAccessoryByStoreLogoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_banner_id")
	public TblAccessory getTblAccessoryByStoreBannerId() {
		return this.tblAccessoryByStoreBannerId;
	}

	public void setTblAccessoryByStoreBannerId(TblAccessory tblAccessoryByStoreBannerId) {
		this.tblAccessoryByStoreBannerId = tblAccessoryByStoreBannerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "area_id")
	public TblArea getTblArea() {
		return this.tblArea;
	}

	public void setTblArea(TblArea tblArea) {
		this.tblArea = tblArea;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sc_id")
	public TblStoreclass getTblStoreclass() {
		return this.tblStoreclass;
	}

	public void setTblStoreclass(TblStoreclass tblStoreclass) {
		this.tblStoreclass = tblStoreclass;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grade_id")
	public TblStoregrade getTblStoregradeByGradeId() {
		return this.tblStoregradeByGradeId;
	}

	public void setTblStoregradeByGradeId(TblStoregrade tblStoregradeByGradeId) {
		this.tblStoregradeByGradeId = tblStoregradeByGradeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "update_grade_id")
	public TblStoregrade getTblStoregradeByUpdateGradeId() {
		return this.tblStoregradeByUpdateGradeId;
	}

	public void setTblStoregradeByUpdateGradeId(TblStoregrade tblStoregradeByUpdateGradeId) {
		this.tblStoregradeByUpdateGradeId = tblStoregradeByUpdateGradeId;
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

	@Column(name = "card_approve", nullable = false)
	public boolean isCardApprove() {
		return this.cardApprove;
	}

	public void setCardApprove(boolean cardApprove) {
		this.cardApprove = cardApprove;
	}

	@Column(name = "realstore_approve", nullable = false)
	public boolean isRealstoreApprove() {
		return this.realstoreApprove;
	}

	public void setRealstoreApprove(boolean realstoreApprove) {
		this.realstoreApprove = realstoreApprove;
	}

	@Column(name = "store_address")
	public String getStoreAddress() {
		return this.storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	@Column(name = "store_credit", nullable = false)
	public int getStoreCredit() {
		return this.storeCredit;
	}

	public void setStoreCredit(int storeCredit) {
		this.storeCredit = storeCredit;
	}

	@Column(name = "store_info")
	public String getStoreInfo() {
		return this.storeInfo;
	}

	public void setStoreInfo(String storeInfo) {
		this.storeInfo = storeInfo;
	}

	@Column(name = "store_msn")
	public String getStoreMsn() {
		return this.storeMsn;
	}

	public void setStoreMsn(String storeMsn) {
		this.storeMsn = storeMsn;
	}

	@Column(name = "store_name")
	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	@Column(name = "store_ower")
	public String getStoreOwer() {
		return this.storeOwer;
	}

	public void setStoreOwer(String storeOwer) {
		this.storeOwer = storeOwer;
	}

	@Column(name = "store_ower_card")
	public String getStoreOwerCard() {
		return this.storeOwerCard;
	}

	public void setStoreOwerCard(String storeOwerCard) {
		this.storeOwerCard = storeOwerCard;
	}

	@Column(name = "store_qq")
	public String getStoreQq() {
		return this.storeQq;
	}

	public void setStoreQq(String storeQq) {
		this.storeQq = storeQq;
	}

	@Column(name = "store_recommend", nullable = false)
	public boolean isStoreRecommend() {
		return this.storeRecommend;
	}

	public void setStoreRecommend(boolean storeRecommend) {
		this.storeRecommend = storeRecommend;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "store_recommend_time", length = 19)
	public Date getStoreRecommendTime() {
		return this.storeRecommendTime;
	}

	public void setStoreRecommendTime(Date storeRecommendTime) {
		this.storeRecommendTime = storeRecommendTime;
	}

	@Column(name = "store_seo_description")
	public String getStoreSeoDescription() {
		return this.storeSeoDescription;
	}

	public void setStoreSeoDescription(String storeSeoDescription) {
		this.storeSeoDescription = storeSeoDescription;
	}

	@Column(name = "store_seo_keywords")
	public String getStoreSeoKeywords() {
		return this.storeSeoKeywords;
	}

	public void setStoreSeoKeywords(String storeSeoKeywords) {
		this.storeSeoKeywords = storeSeoKeywords;
	}

	@Column(name = "store_status", nullable = false)
	public int getStoreStatus() {
		return this.storeStatus;
	}

	public void setStoreStatus(int storeStatus) {
		this.storeStatus = storeStatus;
	}

	@Column(name = "store_telephone")
	public String getStoreTelephone() {
		return this.storeTelephone;
	}

	public void setStoreTelephone(String storeTelephone) {
		this.storeTelephone = storeTelephone;
	}

	@Column(name = "store_zip")
	public String getStoreZip() {
		return this.storeZip;
	}

	public void setStoreZip(String storeZip) {
		this.storeZip = storeZip;
	}

	@Column(name = "template")
	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "validity", length = 19)
	public Date getValidity() {
		return this.validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

	@Column(name = "violation_reseaon")
	public String getViolationReseaon() {
		return this.violationReseaon;
	}

	public void setViolationReseaon(String violationReseaon) {
		this.violationReseaon = violationReseaon;
	}

	@Column(name = "domain_modify_count")
	public Integer getDomainModifyCount() {
		return this.domainModifyCount;
	}

	public void setDomainModifyCount(Integer domainModifyCount) {
		this.domainModifyCount = domainModifyCount;
	}

	@Column(name = "store_second_domain")
	public String getStoreSecondDomain() {
		return this.storeSecondDomain;
	}

	public void setStoreSecondDomain(String storeSecondDomain) {
		this.storeSecondDomain = storeSecondDomain;
	}

	@Column(name = "favorite_count")
	public Integer getFavoriteCount() {
		return this.favoriteCount;
	}

	public void setFavoriteCount(Integer favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	@Column(name = "store_lat", precision = 6)
	public BigDecimal getStoreLat() {
		return this.storeLat;
	}

	public void setStoreLat(BigDecimal storeLat) {
		this.storeLat = storeLat;
	}

	@Column(name = "store_lng", precision = 6)
	public BigDecimal getStoreLng() {
		return this.storeLng;
	}

	public void setStoreLng(BigDecimal storeLng) {
		this.storeLng = storeLng;
	}

	@Column(name = "store_ww")
	public String getStoreWw() {
		return this.storeWw;
	}

	public void setStoreWw(String storeWw) {
		this.storeWw = storeWw;
	}

	@Column(name = "map_type")
	public String getMapType() {
		return this.mapType;
	}

	public void setMapType(String mapType) {
		this.mapType = mapType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "delivery_begin_time", length = 19)
	public Date getDeliveryBeginTime() {
		return this.deliveryBeginTime;
	}

	public void setDeliveryBeginTime(Date deliveryBeginTime) {
		this.deliveryBeginTime = deliveryBeginTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "delivery_end_time", length = 19)
	public Date getDeliveryEndTime() {
		return this.deliveryEndTime;
	}

	public void setDeliveryEndTime(Date deliveryEndTime) {
		this.deliveryEndTime = deliveryEndTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "combin_begin_time", length = 19)
	public Date getCombinBeginTime() {
		return this.combinBeginTime;
	}

	public void setCombinBeginTime(Date combinBeginTime) {
		this.combinBeginTime = combinBeginTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "combin_end_time", length = 19)
	public Date getCombinEndTime() {
		return this.combinEndTime;
	}

	public void setCombinEndTime(Date combinEndTime) {
		this.combinEndTime = combinEndTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "weixin_begin_time", length = 10)
	public Date getWeixinBeginTime() {
		return this.weixinBeginTime;
	}

	public void setWeixinBeginTime(Date weixinBeginTime) {
		this.weixinBeginTime = weixinBeginTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "weixin_end_time", length = 10)
	public Date getWeixinEndTime() {
		return this.weixinEndTime;
	}

	public void setWeixinEndTime(Date weixinEndTime) {
		this.weixinEndTime = weixinEndTime;
	}

	@Column(name = "weixin_status")
	public Integer getWeixinStatus() {
		return this.weixinStatus;
	}

	public void setWeixinStatus(Integer weixinStatus) {
		this.weixinStatus = weixinStatus;
	}

	@Column(name = "weixin_appId")
	public String getWeixinAppId() {
		return this.weixinAppId;
	}

	public void setWeixinAppId(String weixinAppId) {
		this.weixinAppId = weixinAppId;
	}

	@Column(name = "weixin_appSecret")
	public String getWeixinAppSecret() {
		return this.weixinAppSecret;
	}

	public void setWeixinAppSecret(String weixinAppSecret) {
		this.weixinAppSecret = weixinAppSecret;
	}

	@Column(name = "weixin_token")
	public String getWeixinToken() {
		return this.weixinToken;
	}

	public void setWeixinToken(String weixinToken) {
		this.weixinToken = weixinToken;
	}

	@Column(name = "weixin_welecome_content")
	public String getWeixinWelecomeContent() {
		return this.weixinWelecomeContent;
	}

	public void setWeixinWelecomeContent(String weixinWelecomeContent) {
		this.weixinWelecomeContent = weixinWelecomeContent;
	}

	@Column(name = "weixin_account")
	public String getWeixinAccount() {
		return this.weixinAccount;
	}

	public void setWeixinAccount(String weixinAccount) {
		this.weixinAccount = weixinAccount;
	}

	@Column(name = "weixin_store_name")
	public String getWeixinStoreName() {
		return this.weixinStoreName;
	}

	public void setWeixinStoreName(String weixinStoreName) {
		this.weixinStoreName = weixinStoreName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblCombinLog> getTblCombinLogs() {
		return this.tblCombinLogs;
	}

	public void setTblCombinLogs(Set<TblCombinLog> tblCombinLogs) {
		this.tblCombinLogs = tblCombinLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblVmessage> getTblVmessages() {
		return this.tblVmessages;
	}

	public void setTblVmessages(Set<TblVmessage> tblVmessages) {
		this.tblVmessages = tblVmessages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblPayment> getTblPayments() {
		return this.tblPayments;
	}

	public void setTblPayments(Set<TblPayment> tblPayments) {
		this.tblPayments = tblPayments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblStoreNav> getTblStoreNavs() {
		return this.tblStoreNavs;
	}

	public void setTblStoreNavs(Set<TblStoreNav> tblStoreNavs) {
		this.tblStoreNavs = tblStoreNavs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblVmenu> getTblVmenus() {
		return this.tblVmenus;
	}

	public void setTblVmenus(Set<TblVmenu> tblVmenus) {
		this.tblVmenus = tblVmenus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblStorePartner> getTblStorePartners() {
		return this.tblStorePartners;
	}

	public void setTblStorePartners(Set<TblStorePartner> tblStorePartners) {
		this.tblStorePartners = tblStorePartners;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblTransport> getTblTransports() {
		return this.tblTransports;
	}

	public void setTblTransports(Set<TblTransport> tblTransports) {
		this.tblTransports = tblTransports;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblStorecart> getTblStorecarts() {
		return this.tblStorecarts;
	}

	public void setTblStorecarts(Set<TblStorecart> tblStorecarts) {
		this.tblStorecarts = tblStorecarts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblShipping> getTblShippings() {
		return this.tblShippings;
	}

	public void setTblShippings(Set<TblShipping> tblShippings) {
		this.tblShippings = tblShippings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblDynamic> getTblDynamics() {
		return this.tblDynamics;
	}

	public void setTblDynamics(Set<TblDynamic> tblDynamics) {
		this.tblDynamics = tblDynamics;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblStoreSlide> getTblStoreSlides() {
		return this.tblStoreSlides;
	}

	public void setTblStoreSlides(Set<TblStoreSlide> tblStoreSlides) {
		this.tblStoreSlides = tblStoreSlides;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblUser> getTblUsers() {
		return this.tblUsers;
	}

	public void setTblUsers(Set<TblUser> tblUsers) {
		this.tblUsers = tblUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblStoregradeLog> getTblStoregradeLogs() {
		return this.tblStoregradeLogs;
	}

	public void setTblStoregradeLogs(Set<TblStoregradeLog> tblStoregradeLogs) {
		this.tblStoregradeLogs = tblStoregradeLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblOrderform> getTblOrderforms() {
		return this.tblOrderforms;
	}

	public void setTblOrderforms(Set<TblOrderform> tblOrderforms) {
		this.tblOrderforms = tblOrderforms;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblGoodsclassstaple> getTblGoodsclassstaples() {
		return this.tblGoodsclassstaples;
	}

	public void setTblGoodsclassstaples(Set<TblGoodsclassstaple> tblGoodsclassstaples) {
		this.tblGoodsclassstaples = tblGoodsclassstaples;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblGoods> getTblGoodses() {
		return this.tblGoodses;
	}

	public void setTblGoodses(Set<TblGoods> tblGoodses) {
		this.tblGoodses = tblGoodses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblDeliveryLog> getTblDeliveryLogs() {
		return this.tblDeliveryLogs;
	}

	public void setTblDeliveryLogs(Set<TblDeliveryLog> tblDeliveryLogs) {
		this.tblDeliveryLogs = tblDeliveryLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblDocument> getTblDocuments() {
		return this.tblDocuments;
	}

	public void setTblDocuments(Set<TblDocument> tblDocuments) {
		this.tblDocuments = tblDocuments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblFavorite> getTblFavorites() {
		return this.tblFavorites;
	}

	public void setTblFavorites(Set<TblFavorite> tblFavorites) {
		this.tblFavorites = tblFavorites;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblWatermark> getTblWatermarks() {
		return this.tblWatermarks;
	}

	public void setTblWatermarks(Set<TblWatermark> tblWatermarks) {
		this.tblWatermarks = tblWatermarks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblVlog> getTblVlogs() {
		return this.tblVlogs;
	}

	public void setTblVlogs(Set<TblVlog> tblVlogs) {
		this.tblVlogs = tblVlogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblStore")
	public Set<TblStorePoint> getTblStorePoints() {
		return this.tblStorePoints;
	}

	public void setTblStorePoints(Set<TblStorePoint> tblStorePoints) {
		this.tblStorePoints = tblStorePoints;
	}

}