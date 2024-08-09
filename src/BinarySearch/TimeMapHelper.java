package BinarySearch;

import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class TimeMapHelper {
	
	String key;
	List<String> values;
	List<Integer> timestamps;
	
	public TimeMapHelper() {
		super();
	}

	public TimeMapHelper(String key, List<String> values, List<Integer> timestamps) {
		super();
		this.key = key;
		this.values = values;
		this.timestamps = timestamps;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, timestamps, values);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeMapHelper other = (TimeMapHelper) obj;
		return Objects.equals(key, other.key) ;
	}
	public static TimeMapHelper find(List<TimeMapHelper> list , String key) {
		for(TimeMapHelper obj : list) {
			if(obj.key == key) {
				return obj;
			}
		}
		return null;
	}
	
}
