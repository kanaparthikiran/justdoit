package com.hotel.api.controllers;
///**
// * 
// */
//package com.hotel.api.controllers;
//
//import java.io.StringReader;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBElement;
//import javax.xml.bind.Marshaller;
//import javax.xml.bind.Unmarshaller;
//import javax.xml.namespace.QName;
//import javax.xml.transform.stream.StreamSource;
//
///**
// * @author kkanaparthi
// *
// */
//public class TestJAXB {
//
//	public static void main(String[] args) throws Exception { 
//	    // marshal 
//	    int[] x = new int[]{1,5,2,3,4}; 
//	    JAXBElement<int[]> xe = new JAXBElement<int[]>(new QName("", "root"), int[].class, JAXBElement.GlobalScope.class, x); 
//	    Marshaller m = JAXBContext.newInstance(int[].class).createMarshaller(); 
//	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true); 
//	    m.marshal(xe,System.out); 
//	     
//	    // unmarshal 
//	    Unmarshaller u = JAXBContext.newInstance(int[].class).createUnmarshaller(); 
//	    JAXBElement e = u.unmarshal(new StreamSource(new StringReader( 
//	            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + 
//	            "<root>\n" + 
//	            " <item>1</item>\n" + 
//	            " <item>5</item>\n" + 
//	            " <item>2</item>\n" + 
//	            " <item>3</item>\n" + 
//	            " <item>4</item>\n" + 
//	            "</root>\n")), int[].class); 
//	} 
//
//}
