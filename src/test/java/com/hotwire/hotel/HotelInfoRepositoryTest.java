//package com.hotwire.hotel;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.hotel.api.entities.HotelDetail;
//import com.hotel.api.repositories.IHotelInfoRepository;
//
//import java.util.List;
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class HotelInfoRepositoryTest {
//	
//    @Autowired
//    private IHotelInfoRepository hotelInfoMongoRepository;
// 
// 
//    @Before
//    public void setUp() throws Exception {
//    	HotelDetail hotelDetail1 = new HotelDetail("Hilton", "San Jose");
//    	HotelDetail hotelDetail2 = new HotelDetail("Marriott", "San Francisco");
//        //save product, verify has ID value after save
//        assertNull(hotelDetail1.getId());
//        assertNull(hotelDetail2.getId());//null before save
//        this.hotelInfoMongoRepository.save(hotelDetail1);
//        this.hotelInfoMongoRepository.save(hotelDetail2);
//        assertNotNull(hotelDetail1.getId());
//        assertNotNull(hotelDetail2.getId());
//    }
// 
//    @Test
//    public void testFetchData(){
//        /*Test data retrieval*/
//    	List<HotelDetail> hotelDetailList = hotelInfoMongoRepository.findByName("Hilton");
//        assertNotNull(hotelDetailList);
//        assertEquals("Hilton", hotelDetailList.get(0).getName());
//        /*Get all Hotel Details, list should only have two*/
//        Iterable<HotelDetail> hotels = hotelInfoMongoRepository.findAll();
//        int count = 0;
//        for(HotelDetail hotel : hotels){
//            count++;
//        }
//        assertTrue(count>=0);
//    }
// 
//    @Test
//    public void testDataUpdate(){
//        /*Test update*/
//    	List<HotelDetail> hotelDetailList = hotelInfoMongoRepository.findByName("Marriott");
//    	hotelDetailList.get(0).setLocation("Dallas");;
//        hotelInfoMongoRepository.save(hotelDetailList.get(0));
//        List<HotelDetail> hotelDetailListLatest = hotelInfoMongoRepository.findByName("Hilton");
//        assertNotNull(hotelDetailListLatest);
//        assertEquals("Dallas", hotelDetailList.get(0).getLocation());
//    }
// 
//    @After
//    public void tearDown() throws Exception {
//      this.hotelInfoMongoRepository.deleteAll();
//    }
// 
//}