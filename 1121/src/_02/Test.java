package _02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		String url = "http://www.baidu.com/p1/p2?id=123&ps=456";
		
		int index = url.indexOf("://");
		String url1 = url.substring(0,index);
		System.out.println(url1);
		//获取参数
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		String url2 = url.substring(url.indexOf("?")+1);
		String[] s = url2.split("&");
		for (String string : s) {
			//等号左边
			String[] sTemp = string.split("=");
			map.put((String)sTemp[0], Integer.parseInt(sTemp[1]));
		}
		System.out.println(map);
		Set<String> set = map.keySet();
		for (String string : set) {
			System.out.println(string+":"+map.get(string));
		}
	}
}
