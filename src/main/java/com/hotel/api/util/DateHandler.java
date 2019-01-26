/**
 * 
 */
package com.hotel.api.util;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;



/**
 * @author kkanaparthi
 * 
 *  Creates a custom deserializer by extending StdDeserializer<T> class and 
 *  overwrites the Date Parsing logic to update the Date as per desired format.
 *
 */
public class DateHandler extends StdDeserializer<Date> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5145149055166260226L;
	private final DateFormat sdf = new SimpleDateFormat(HotelServiceConstants.HOTEL_DATE_FORMAT);

	private static final Logger logger = LoggerFactory.getLogger(DateHandler.class);

	
	public DateHandler(Class<?> vc) {
		super(vc);
	}

	 public DateHandler() {
	        this(null);
	 }

	
	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
		String date = p.getText();
		try {
			return sdf.parse(date);
		} catch(Exception ex) {
			logger.error("Exception occurred   %s ", ex);
		}
		return null;
	}

}
