package exercise01;

/**
 * Java Program demonstrate some useful string method
 * 
 * @author LongNH132
 */

public class Strings {
	public static void main(String[] args) {
		String name = "LongNH132";
		String domain = "@fpt.com";
		
		// .concat() method
		System.out.println(name.concat(domain));
		
		// .equals() method
		System.out.println(name.equals(domain));
		
		// .charAt() method
		System.out.println(domain.charAt(0));
		
		// .getBytes() method
		System.out.println(domain.getBytes());
		
		// .indexOf() method
		System.out.println(name.indexOf("132"));
		
		// .length() method
		System.out.println(name.length());
		
		// .replace() method
		System.out.println(name.replace("L", "l"));
		
		// .substring() method
		System.out.println(domain.substring(1, 4));
		
		// .split() method
		String str = "Hello my name is Long";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        
        // .toLowerCase() method
        System.out.println(str.toLowerCase());
        
        // .toUpperCase() method
        System.out.println(str.toUpperCase());
        
        // .valueOf() method
        System.out.println(String.valueOf(name.concat(domain)));
	}
}