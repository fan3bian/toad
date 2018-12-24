package com.qa.Dt;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlUtil<T> {
 
	public static String toXmlByJaxb(Object req) {
        try {
			StringWriter writer = new StringWriter();
			JAXBContext context = JAXBContext.newInstance(req.getClass());
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
 
	public static <T> T tobObjByJaxb(String respXml, Class<T> c) {
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
	private static XStream xstream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));

	static {
		xstream.autodetectAnnotations(true);
	}
	public static <T> String generateXmlTaskContent(T bean) {
		String msg = xstream.toXML(bean);
		return msg;
	}

	public static Object fromXml(String xml, Class a) {
		xstream.ignoreUnknownElements();
		xstream.processAnnotations(a);
		xstream.autodetectAnnotations(true);
		return xstream.fromXML(xml);
	}
 
}
