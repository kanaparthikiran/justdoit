package com.hotel.api.beans;


/**
 * 
 */
import java.util.List;

import com.hotel.api.entities.HotelEntity;

public class HotelSearchResponse extends HotelResponse {


    /**
	 * 
	 */
	private static final long serialVersionUID = -6393166549852147249L;
	
	private List<HotelEntity> hotelSearchResults;
    private String status;
    private int statusCode;

    public List<HotelEntity> getHotelSearchResults() {
        return hotelSearchResults;
    }

    public void setHotelSearchResults(List<HotelEntity> hotelSearchResults) {
        this.hotelSearchResults = hotelSearchResults;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}



}