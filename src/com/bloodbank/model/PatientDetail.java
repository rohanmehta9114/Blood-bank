package com.bloodbank.model;

// Generated Mar 16, 2013 12:03:45 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PatientDetail generated by hbm2java
 */
public class PatientDetail implements java.io.Serializable {

	private Integer patientId;
	private DonorDetail donorDetail;
	private ContactDetail contactDetail;
	private String doctorDetails;
	private String hospitalDetails;
	private String isSpecialDonor;
	private Date purchaseDate;
	private Set<IssueDetail> issueDetails = new HashSet<IssueDetail>(0);

	public PatientDetail() {
	}

	public PatientDetail(DonorDetail donorDetail, ContactDetail contactDetail,
			String doctorDetails, String hospitalDetails,
			String isSpecialDonor, Date purchaseDate,
			Set<IssueDetail> issueDetails) {
		this.donorDetail = donorDetail;
		this.contactDetail = contactDetail;
		this.doctorDetails = doctorDetails;
		this.hospitalDetails = hospitalDetails;
		this.isSpecialDonor = isSpecialDonor;
		this.purchaseDate = purchaseDate;
		this.issueDetails = issueDetails;
	}

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public DonorDetail getDonorDetail() {
		return this.donorDetail;
	}

	public void setDonorDetail(DonorDetail donorDetail) {
		this.donorDetail = donorDetail;
	}

	public ContactDetail getContactDetail() {
		return this.contactDetail;
	}

	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}

	public String getDoctorDetails() {
		return this.doctorDetails;
	}

	public void setDoctorDetails(String doctorDetails) {
		this.doctorDetails = doctorDetails;
	}

	public String getHospitalDetails() {
		return this.hospitalDetails;
	}

	public void setHospitalDetails(String hospitalDetails) {
		this.hospitalDetails = hospitalDetails;
	}

	public String getIsSpecialDonor() {
		return this.isSpecialDonor;
	}

	public void setIsSpecialDonor(String isSpecialDonor) {
		this.isSpecialDonor = isSpecialDonor;
	}

	public Date getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<IssueDetail> getIssueDetails() {
		return this.issueDetails;
	}

	public void setIssueDetails(Set<IssueDetail> issueDetails) {
		this.issueDetails = issueDetails;
	}

}
