package com.qa;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlUtil<T> {
 
	public static String toXml(Object req, Class<?> c) {
        try {
			StringWriter writer = new StringWriter();
			JAXBContext context = JAXBContext.newInstance(c);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			marshaller.marshal(req, new StreamResult(writer));
			String result = writer.toString();
			writer.close();
			return result;
		} catch (Exception e) {
 
			throw new RuntimeException(e.getMessage(), e);
		}
	}
 
	public static <T> T toObj(String respXml, Class<T> c) {
		try {
			JAXBContext context = JAXBContext.newInstance(c);
			javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
			StringReader reader = new StringReader(respXml);
			T result = (T) unmarshaller.unmarshal(new StreamSource(reader));
			reader.close();
			return result;
		} catch (Exception e) {
 
			throw new RuntimeException(e.getMessage(), e);
		}
	}
 
}
