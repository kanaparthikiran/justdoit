/**
 * 
 */
package com.hotel.api.util;

/**
 * @author kkanaparthi
 * 
 * Defines a list of constants used by the Hotel Search Application
 *  
 */
public class HotelServiceConstants {

	//Utility class not to instantiate
	  private HotelServiceConstants() {
		    throw new IllegalStateException("Utility class");
	  }
	  
	  //Constant used to define the Date Format used by Hotel Entity
	  public static final String HOTEL_DATE_FORMAT = "MM-dd-yyyy";
	  
	  public static final String SWAGGER_BASE_PACKAGE = "com.hotel.api";
	  
	  public static final String MONGO_DB_HOST = "spring.data.mongodb.host";
	  public static final String MONGO_DATABASE_NAME =  "spring.data.mongodb.database";
}
