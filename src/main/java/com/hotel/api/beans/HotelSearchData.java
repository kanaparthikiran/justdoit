/**
 * 
 */
package com.hotel.api.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hotel.api.util.DateHandler;

/**
 * @author kkanaparthi
 *
 */
public class HotelSearchData implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1827579845505973115L;
	

	private String id;
    
    private String hotelName;
    
    private String location;
    
    private double pricePerNight;
    
    private int hotelRating;
    
    private double offerPercentage;
	
	@JsonDeserialize(using = DateHandler.class)
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingDate;
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + hotelRating;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		long temp;
		temp = Double.doubleToLongBits(offerPercentage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pricePerNight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelSearchData other = (HotelSearchData) obj;
		if (bookingDate == null) {
			if (other.bookingDate != null)
				return false;
		} else if (!bookingDate.equals(other.bookingDate))
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (hotelRating != other.hotelRating)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (Double.doubleToLongBits(offerPercentage) != Double.doubleToLongBits(other.offerPercentage))
			return false;
		if (Double.doubleToLongBits(pricePerNight) != Double.doubleToLongBits(other.pricePerNight))
			return false;
		return true;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the pricePerNight
	 */
	public double getPricePerNight() {
		return pricePerNight;
	}

	/**
	 * @param pricePerNight the pricePerNight to set
	 */
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	/**
	 * @return the hotelRating
	 */
	public int getHotelRating() {
		return hotelRating;
	}

	/**
	 * @param hotelRating the hotelRating to set
	 */
	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}

	/**
	 * @return the offerPercentage
	 */
	public double getOfferPercentage() {
		return offerPercentage;
	}

	/**
	 * @param offerPercentage the offerPercentage to set
	 */
	public void setOfferPercentage(double offerPercentage) {
		this.offerPercentage = offerPercentage;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HotelSearchRequest [id=" + id + ", hotelName=" + hotelName + ", location=" + location
				+ ", pricePerNight=" + pricePerNight + ", hotelRating=" + hotelRating + ", offerPercentage="
				+ offerPercentage + ", bookingDate=" + bookingDate + "]";
	}
	
}
