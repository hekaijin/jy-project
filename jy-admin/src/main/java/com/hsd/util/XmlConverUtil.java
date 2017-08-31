package com.hsd.util;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;

/**
 * common xml conver utility
 * 
 * @author viruscodecn@gmail.com
 * @version Framework 2010.10.26
 * @url http://blog.csdn.net/arjick/article/details/6251777
 */
public class XmlConverUtil {

	/**
	 * json to xml {"node":{"key":{"@label":"key1","#text":"value1"}}} conver
	 * <o><node class="object"><key class="object" label=
	 * "key1">value1</key></node></o>
	 * 
	 * @param json
	 * @return
	 */
	public static String jsontoXml(String json) {
		try {
			XMLSerializer serializer = new XMLSerializer();
			JSON jsonObject = JSONSerializer.toJSON(json);
			return serializer.write(jsonObject);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * xml to json <node><key label="key1">value1</key></node> 转化为
	 * {"key":{"@label":"key1","#text":"value1"}}
	 * 
	 * @param xml
	 * @return
	 */
	public static String xmltoJson(String xml) {
		XMLSerializer xmlSerializer = new XMLSerializer();
		return xmlSerializer.read(xml).toString();
	}

}
