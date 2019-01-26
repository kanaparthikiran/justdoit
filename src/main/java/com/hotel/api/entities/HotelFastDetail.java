///**
// * 
// */
//package com.hotel.api.entities;
//
//import java.util.Date;
//
//import org.springframework.data.redis.core.RedisHash;
//
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import com.hotel.api.util.DateHandler;
//
//@RedisHash("HotelFastDetail")
//public class HotelFastDetail {
//
////    @Id
//    public String id;
//
//    /**
//	 * @return the id
//	 */
//	public String getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}
//
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	/**
//	 * @return the location
//	 */
//	public String getLocation() {
//		return location;
//	}
//
//	/**
//	 * @param location the location to set
//	 */
//	public void setLocation(String location) {
//		this.location = location;
//	}
//
//	private String name;
//    private String location;
//    /**
//	 * @return the pricePerNight
//	 */
//	public double getPricePerNight() {
//		return pricePerNight;
//	}
//
//	/**
//	 * @param pricePerNight the pricePerNight to set
//	 */
//	public void setPricePerNight(double pricePerNight) {
//		this.pricePerNight = pricePerNight;
//	}
//
//	/**
//	 * @return the hotelRating
//	 */
//	public int getHotelRating() {
//		return hotelRating;
//	}
//
//	/**
//	 * @param hotelRating the hotelRating to set
//	 */
//	public void setHotelRating(int hotelRating) {
//		this.hotelRating = hotelRating;
//	}
//
//	/**
//	 * @return the offerPercentage
//	 */
//	public double getOfferPercentage() {
//		return offerPercentage;
//	}
//
//	/**
//	 * @param offerPercentage the offerPercentage to set
//	 */
//	public void setOfferPercentage(double offerPercentage) {
//		this.offerPercentage = offerPercentage;
//	}
//
//	/**
//	 * @return the bookingDate
//	 */
//	public Date getBookingDate() {
//		return bookingDate;
//	}
//
//	/**
//	 * @param bookingDate the bookingDate to set
//	 */
//	public void setBookingDate(Date bookingDate) {
//		this.bookingDate = bookingDate;
//	}
//
//
//
//	public HotelFastDetail(String id, String name, String location, double pricePerNight, int hotelRating,
//			double offerPercentage, Date bookingDate) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.location = location;
//		this.pricePerNight = pricePerNight;
//		this.hotelRating = hotelRating;
//		this.offerPercentage = offerPercentage;
//		this.bookingDate = bookingDate;
//	}
//
//	private double pricePerNight;
//    
//    private int hotelRating;
//    
//    private double offerPercentage;
//    
//    
//	@JsonDeserialize(using = DateHandler.class)
//	private Date bookingDate;
//
//    public HotelFastDetail() {}
//
//    public HotelFastDetail(String name, String location) {
//        this.name = name;
//        this.location = location;
//    }
//
//    @Override
//    public String toString() {
//        return String.format(
//                "HotelDetail[id=%s, name='%s', location='%s']",
//                id, name, location);
//    }
//
//}