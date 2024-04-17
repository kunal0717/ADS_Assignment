

class LengthOfString{

	public static void main(String[] args) {
	String str = "Mumbai";
	
	int length = calculateLength(str);
	System.out.println("Length of the string: " + length);
}
	public static int calculateLength(String str) {
	if (str.isEmpty()) {
	return 0; 
}
	return 1 + calculateLength(str.substring(1));
}


}