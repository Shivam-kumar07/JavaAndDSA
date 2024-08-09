package BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class TimeMap {
	private static List<TimeMapHelper> list;

	public static void main(String[] args) {
		
	}

	public TimeMap() {
		list = new ArrayList<>();
	}

	public static void set(String key, String value, int timestamp) {
		if(!list.contains(key)) {
			TimeMapHelper temp = new TimeMapHelper(key , List.of(value) , List.of(timestamp));
			list.add(temp);
		}
		else {
			TimeMapHelper thisObj = TimeMapHelper.find(list, key);
			
		}
	}

	public static String get(String key, int timestamp) {
		return "";
	}

}
