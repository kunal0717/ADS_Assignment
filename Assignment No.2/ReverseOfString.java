

class ReverseOfString{
	
	public static void main(String[] args) {
	String str = "reverse";
	
	String reversed = reverseString(str);
	System.out.println("Reverse of the string: " + reversed);
}
	public static String reverseString(String str) {
	if (str.isEmpty()) {
	return "";
}
	char lastChar = str.charAt(str.length() - 1);
String remainingString = str.substring(0, str.length() -1);
return lastChar + reverseString(remainingString);
}


}	