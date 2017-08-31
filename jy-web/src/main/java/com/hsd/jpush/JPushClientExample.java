package com.hsd.jpush;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;

public class JPushClientExample {

	private static final String appKey = "6e4a0505d3a00d921d9fe199";//必填，例如466f7032ac604e02fb7bda89

	private static final String masterSecret = "0bf6ce8f4cdf2224c04fad44";// "13ac09b17715bd117163d8a1";//必填，每个应用都对应一个masterSecret

//	private static JPushClient jpush = null;

	/*
	 * 保存离线的时长。秒为单位。最多支持10天（864000秒）。 0 表示该消息不保存离线。即：用户在线马上发出，当前不在线用户将不会收到此消息。
	 * 此参数不设置则表示默认，默认为保存1天的离线消息（86400秒
	 */
//	private static int timeToLive = 60 * 60 * 24;

	public static void main(String[] args) {
		/*
		 * Example1: 初始化,默认发送给android和ios，同时设置离线消息存活时间 jpush = new
		 * JPushClient(masterSecret, appKey, timeToLive);
		 * 
		 * Example2: 只发送给android jpush = new JPushClient(masterSecret, appKey,
		 * DeviceEnum.Android);
		 * 
		 * Example3: 只发送给IOS jpush = new JPushClient(masterSecret, appKey,
		 * DeviceEnum.IOS);
		 * 
		 * Example4: 只发送给android,同时设置离线消息存活时间 jpush = new
		 * JPushClient(masterSecret, appKey, timeToLive, DeviceEnum.Android);
		 */

//		JPushClient jpush = new JPushClient(masterSecret, appKey, timeToLive);

		/*
		 * 是否启用ssl安全连接, 可选 参数：启用true， 禁用false，默认为非ssl连接
		 */
		// jpush.setEnableSSL(true);

		// 测试发送消息或者通知
//		testSend();

	}

	public static void sendJPush(String registrationId) {

		JPushClient jpushClient = new JPushClient(masterSecret, appKey, 3);
		PushPayload payload = buildPushObject_all_all_alert(registrationId);
		try {
			PushResult result = jpushClient.sendPush(payload);
			System.out.println("Got result - " + result);
		} catch (APIConnectionException e) {
			// Connection error, should retry later
			System.out.println("Connection error, should retry later" + "-----" + e);
		} catch (APIRequestException e) {
			// Should review the error, and fix the request
			System.out.println("Should review the error, and fix the request" + "-----" + e);
			System.out.println("HTTP Status: " + e.getStatus());
			System.out.println("Error Code: " + e.getErrorCode());
			System.out.println("Error Message: " + e.getErrorMessage());
		}
	}

	// 快捷地构建推送对象：所有平台，所有设备，内容为 ALERT 的通知。
	public static PushPayload buildPushObject_all_all_alert(String registrationId) {
		return PushPayload.newBuilder().setPlatform(Platform.android_ios())
				.setAudience(Audience.registrationId(registrationId))
				.setNotification(Notification.alert("您有新任务，请注意接收！"))
				.build();
	}

	// 构建推送对象：所有平台，推送目标是别名为 "alias1"，通知内容为 ALERT。
	public static PushPayload buildPushObject_all_alias_alert() {
		return PushPayload.newBuilder().setPlatform(Platform.all())
				.setAudience(Audience.registrationId("357457041656001")).setNotification(Notification.alert("ALERT"))
				.build();
	}

	// 构建推送对象：平台是 Android，目标是 tag 为 "tag1" 的设备，内容是 Android 通知 ALERT，并且标题为 TITLE。
	public static PushPayload buildPushObject_android_tag_alertWithTitle() {
		return PushPayload.newBuilder().setPlatform(Platform.android()).setAudience(Audience.tag("357457041656001"))
				.setNotification(Notification.android("ALERT", "TITLE", null)).build();
	}

	public static final int MAX = Integer.MAX_VALUE;
	public static final int MIN = (int) MAX / 2;

	/**
	 * 保持 sendNo 的唯一性是有必要的 It is very important to keep sendNo unique.
	 * 
	 * @return sendNo
	 */
	public static int getRandomSendNo() {
		return (int) (MIN + Math.random() * (MAX - MIN));
	}

}
