/**
 * 
 */
package com.hotel.api.config.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.hotel.api.util.HotelServiceConstants;
import com.mongodb.MongoClient;

/**
 * @author kkanaparthi
 *
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	@Autowired
	private Environment env;

	@Override
	public String getDatabaseName() {
	    return "test";
	}

	@Override
	public MongoClient mongoClient() {
		return new MongoClient("34.230.55.74");
	}
	

}
