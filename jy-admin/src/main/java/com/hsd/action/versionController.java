package com.hsd.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hsd.entity.common.VersionInfo;
import com.hsd.util.GetServerUrl;
import com.hsd.util.XmlConverUtil;

@Controller
@RequestMapping("/version")
public class versionController {

	@RequestMapping("/getRenJuShengTaiGJ")
	@ResponseBody
	public VersionInfo getRenJuShengTaiGJ(HttpServletRequest request) {
		String path = GetServerUrl.getUrl() + "/wKgBuletbX-ALDpMAAFnoxBJNKw595.xml";
		StringBuffer sb = new StringBuffer();
		String line = null;
		BufferedReader reader = null;
		try {
			// 创建一个url对象
			URL url = new URL(path);
			// 通過url对象，创建一个HttpURLConnection对象（连接）
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			// 通过HttpURLConnection对象，得到InputStream
			reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			// 使用io流读取文件
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String info = sb.toString();
		String json = XmlConverUtil.xmltoJson(info);
		JSONObject object = JSONObject.parseObject(json);
		JSONObject HabitatRing = object.getJSONObject("RenJuShengTaiGJ");
		VersionInfo versionInfo = new VersionInfo();
		versionInfo.setVersion(HabitatRing.getInteger("version"));
		versionInfo.setVersionName(HabitatRing.getString("versionName"));
		versionInfo.setDescription(HabitatRing.getString("description"));
		versionInfo.setUrl(HabitatRing.getString("url"));
		versionInfo.setIsForce(HabitatRing.getInteger("isForce"));
		return versionInfo;
	}
	
	@RequestMapping("/getHabitatRing")
	@ResponseBody
	public VersionInfo getHabitatRing(HttpServletRequest request) {
		String path = GetServerUrl.getUrl() + "/wKgBuletbX-ALDpMAAFnoxBJNKw595.xml";
		StringBuffer sb = new StringBuffer();
		String line = null;
		BufferedReader reader = null;
		try {
			// 创建一个url对象
			URL url = new URL(path);
			// 通過url对象，创建一个HttpURLConnection对象（连接）
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			// 通过HttpURLConnection对象，得到InputStream
			reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			// 使用io流读取文件
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String info = sb.toString();
		String json = XmlConverUtil.xmltoJson(info);
		JSONObject object = JSONObject.parseObject(json);
		JSONObject HabitatRing = object.getJSONObject("HabitatRing");
		VersionInfo versionInfo = new VersionInfo();
		versionInfo.setVersion(HabitatRing.getInteger("version"));
		versionInfo.setVersionName(HabitatRing.getString("versionName"));
		versionInfo.setDescription(HabitatRing.getString("description"));
		versionInfo.setUrl(HabitatRing.getString("url"));
		versionInfo.setIsForce(HabitatRing.getInteger("isForce"));
		return versionInfo;
	}

	@RequestMapping("/getapk")
	public String getapk(Model model) {

		return "/user/qc_cord";
	}
	
	@RequestMapping("/goldenkeyApk")
	public String getGoldenkeyApk(Model model) {

		return "/user/goldenkeyApk";
	}
	
	@RequestMapping("/goldenkeyMajorApk")
	public String getGoldenkeyMajorApk(Model model) {

		return "/user/goldenkeyMajorApk";
	}
	
	@RequestMapping("/getGzxhApk")
	public String getGzxhApk(Model model) {

		return "/user/getGzxhApk";
	}

}
