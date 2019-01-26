package com.hotel.api.entities;


/**
 * 
 */
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hotel.api.util.DateHandler;


@Entity
@Table(name = "hotel")
public class HotelEntity {

	
    /**
     * Entity's unique identifier.
     */
    @Id
    @Column(name = "id")
    private String id;
    
    
    @Column(name = "hotel_name")
    private String hotelName;
    
    @Column(name = "location")
    private String location;
    
    @Column(name = "price_per_night")
    private double pricePerNight;
    
    @Column(name = "hotel_rating")
    private int hotelRating;
    
    @Column(name = "offer_percentage")
    private double offerPercentage;
    
    
	@JsonDeserialize(using = DateHandler.class)
    @Column(name = "booking_date")
    @Temporal(TemporalType.TIMESTAMP)
	private Date bookingDate;
	
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HotelEntity [id=" + id + ", hotelName=" + hotelName + ", location=" + location + ", pricePerNight="
				+ pricePerNight + ", hotelRating=" + hotelRating + ", offerPercentage=" + offerPercentage
				+ ", bookingDate=" + bookingDate + "]";
	}



    public HotelEntity(){

    }

    public HotelEntity(final String id, final String hotelName, final String location,
                       final double pricePerNight, final int hotelRating,
                       final double offerPercentage, final Date bookingDate) {
        this.id = id;
        this.hotelName = hotelName;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.hotelRating = hotelRating;
        this.offerPercentage = offerPercentage;
        this.bookingDate = bookingDate;

    }


    /**
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}

	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getOfferPercentage() {
        return offerPercentage;
    }

    public void setOfferPercentage(double offerPercentage) {
        this.offerPercentage = offerPercentage;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    

}