package com.hsd.jpush;

import java.util.Random;

import com.sun.media.jfxmedia.track.Track.Encoding;

public class JPushService {

	// private static final String masterSecret = "913ea29bbc680a296ba3ab17";
	private static final String masterSecret = "1e93c9e7469969df4d3e0b82";

	// private static final String AppKey = "f2ea80cc27abe0e15e50f0aa";
	private static final String AppKey = "14f7b9a7fb4b420237f2c093";

	private static final String RegistrationID = "120c83f7602db1c32e1";

//	public void PushAndroid(String RegistrationID) {
//		try {
//			Random ran = new Random();
//			String Title = "try一try", con = "hayiha";
////			int sendno = ran.Next(1, 2100000000);// 随机生成的一个编号
//			int sendno = ran.nextInt();
////			String app_key = AppKey;
////			String masterSecret = masterSecret;
//			int receiver_type = 5;// 接收者类型。2、指定的 tag。3、指定的 alias。4、广播：对 app_key
//									// 下的所有用户推送消息。5、根据 RegistrationID 进行推送。当前只是
//									// Android SDK r1.6.0 版本支持
//			String receiver_value = RegistrationID;
//
//			int msg_type = 1;// 1、通知2、自定义消息（只有 Android 支持）
//			String msg_content = "{\"n_builder_id\":\"00\",\"n_title\":\"" + Title + "\",\"n_content\":\"" + con
//					+ "\"}";// 消息内容
//			String platform = "android";// 目标用户终端手机的平台类型，如： android, ios
//										// 多个请使用逗号分隔。
//			String verification_code = GetMD5Str(sendno+"", receiver_type+"", receiver_value,
//					masterSecret);// 验证串，用于校验发送的合法性。MD5
//			String postData = "sendno=" + sendno;
//			postData += ("&app_key=" + AppKey);
//			postData += ("&masterSecret=" + masterSecret);
//			postData += ("&receiver_type=" + receiver_type);
//			postData += ("&receiver_value=" + receiver_value);
//			postData += ("&msg_type=" + msg_type);
//			postData += ("&msg_content=" + msg_content);
//			postData += ("&platform=" + platform);
//			postData += ("&verification_code=" + verification_code);
//
//			// byte[] data = encoding.GetBytes(postData);
//			byte[] data = Encoding.UTF8.GetBytes(postData);
//			String resCode = GetPostRequest(data);// 调用极光的接口获取返回值
//			JpushMsg msg = Newtonsoft.Json.JsonConvert.DeserializeObject < JpushMsg > (resCode);// 定义一个JpushMsg类，包含返回值信息，将返回的json格式字符串转成JpushMsg对象
//		} catch (Exception ex) {
//
//		}
//	}

//	public String GetMD5Str(String[] paras)
//    {
//        String str = "";
//        for (int i = 0; i < paras.length; i++)
//        {
//            str += paras[i];
//        }
//        byte[] buffer = MD5.Create().ComputeHash(Encoding.UTF8.GetBytes(str));
//        String md5Str = String.Empty;
//        for (int i = 0; i < buffer.Length; i++)
//        {
//            md5Str = md5Str + buffer[i].ToString("X2");
//        }
//        return md5Str;
//    }
//
//	public String GetPostRequest(byte[] data)
//     {
//         HttpWebRequest myRequest = (HttpWebRequest)WebRequest.Create("http://api.jpush.cn:8800/v2/push");
//
//         myRequest.Method = "POST";//极光http请求方式为post
//         myRequest.ContentType = "application/x-www-form-urlencoded";//按照极光的要求
//         myRequest.ContentLength = data.Length;
//         Stream newStream = myRequest.GetRequestStream();
//
//         // Send the data.
//         newStream.Write(data, 0, data.Length);
//         newStream.Close();
//
//         // Get response
//         var response = (HttpWebResponse)myRequest.GetResponse();
//         using (var reader = new StreamReader(response.GetResponseStream(), Encoding.GetEncoding("UTF-8")))
//         {
//             String result = reader.ReadToEnd();
//             reader.Close();
//             response.Close();
//             return result;
//         }
//     }

	public static void main(String[] args) {

	}
}
