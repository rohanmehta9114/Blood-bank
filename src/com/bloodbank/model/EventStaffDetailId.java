package com.bloodbank.model;

// Generated Mar 16, 2013 12:03:45 PM by Hibernate Tools 3.3.0.GA

/**
 * EventStaffDetailId generated by hbm2java
 */
public class EventStaffDetailId implements java.io.Serializable {

	private Integer eventId;
	private Integer staffId;

	public EventStaffDetailId() {
	}

	public EventStaffDetailId(Integer eventId, Integer staffId) {
		this.eventId = eventId;
		this.staffId = staffId;
	}

	public Integer getEventId() {
		return this.eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EventStaffDetailId))
			return false;
		EventStaffDetailId castOther = (EventStaffDetailId) other;

		return ((this.getEventId() == castOther.getEventId()) || (this
				.getEventId() != null
				&& castOther.getEventId() != null && this.getEventId().equals(
				castOther.getEventId())))
				&& ((this.getStaffId() == castOther.getStaffId()) || (this
						.getStaffId() != null
						&& castOther.getStaffId() != null && this.getStaffId()
						.equals(castOther.getStaffId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEventId() == null ? 0 : this.getEventId().hashCode());
		result = 37 * result
				+ (getStaffId() == null ? 0 : this.getStaffId().hashCode());
		return result;
	}

}
