package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecode {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("neet","code","love","you");
		String str = encode(asList);
		System.out.println(str);
		List<String> result= decode(str);
		System.out.println("===========Result===========");
		System.out.println(result);
		
		
//		System.out.println(Integer.parseInt("0056"));
	}
	
	private static String encode(List<String> asList) {
		StringBuilder str = new StringBuilder();
        for(String s : asList){
            str.append(Integer.toString(s.length()));
            str.append(s);
        }
        return str.toString();
	}
	
	private static List<String> decode(String str) {
		List<String> list = new ArrayList<>();
        int i = 0;
        int n = str.length();
        while(i<n){
            int len = Integer.parseInt(String.valueOf(str.charAt(i)));
            System.out.println(len);
            String tempString = str.substring(i+1, i+len+1);
            list.add(tempString);
            i = i+len+1;
        }
        return list;
	}

	

}
