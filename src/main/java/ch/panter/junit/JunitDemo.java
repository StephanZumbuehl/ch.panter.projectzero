package ch.panter.junit;

import java.util.List;

public class JunitDemo implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		if(s == null){
			return true;
		}
		
		if(s.length() == 0){
			return true;
		}
		
		return false;
	}

	@Override
	// "HELLO".capitalize    #=> "Hello"
	public String capitalize(String s) {
		if (s.length() == 0) return "";
		
		if (s.length() == 1) return s.toUpperCase();
		
		return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
		
	}
	
	

	@Override
	public String reverse(String s) throws NullPointerException {
		
		if(s == null) {
			throw new NullPointerException();
		}
		
		return new StringBuffer(s).reverse().toString();
	}

	@Override
	public String join(List<String> liste) {

		String concatenated = "";
		
		for(String s:liste){
			concatenated += s+" ";
		}

		return concatenated.trim();
	}
	
	

}
