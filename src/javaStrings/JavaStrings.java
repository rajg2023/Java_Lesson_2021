package javaStrings;

public class JavaStrings {

	public static void main(String[] args) {
     String str1 = "hello";
     String str2 = "hello";
     
     if(str1==str2) {
    	 System.out.println("str1 Equals str2");
    	 System.out.println();
    	 
     }else{
    	 System.out.println("str1 NOT Equals str2");
     }
     String str3 = new String("Hello");
     String str4 = new String("Hello");
     if(str3 == str4) {
    	 System.out.println("str3 Equals str4");
    	 
     }else{
    	 System.out.println("str3 Not Equals str4");
     }
     if(str3.equals(str4)) {
    	 System.out.println("str3 Equals str4");
     }else {
    	 System.out.println("str3 Not Equals str4");
     }
     if(str3.compareTo(str4)==0) {
    	 System.out.println("str3 Equals str4");
     }else {
    	 System.out.println("str3 Not Equals str4");
     }
     String str = "John, Jennie, Jim, Jack, Joe";
     int len = str.length();
     System.out.println("Length of String is : " + len);
     System.out.println(str.charAt(0)+"||"+str.charAt(len-1));
     
     String s1 = str.toUpperCase();
	 System.out.println("String after uppercase is : "+str);
	 System.out.println("S1 is : "+s1);
	 if(str.contains("Jim")) {
		 System.out.println("Jim is in the string");
	 }
	 String s2 = str.substring(5);
	 System.out.println("S2 is : "+ s2);
	 String s3 = str.substring(6, 10);
	 System.out.println("S3 is : "+s3);
	 
	 String s4 = str.replace("J","K");
	 System.out.println("s3 is : "+s4);
	 
	 char[] chArr = str.toCharArray();
	 for(char ch: chArr) {
		 System.out.print(ch + " ");
	 }
	 System.out.println();
	 
	 String[] strArr = str.split(",");
	 for(String s : strArr) {
	  System.out.println(s.trim());
	 }
	 String email = "johndoe";
	 String phone = "9999999";
	 String pass = "Password";
	 String emailPattern = "([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})";
	 String passPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
	 if(!email.isEmpty()) {
		 System.out.println("Email is Available");
		 if(!email.matches(emailPattern)) {
			 System.out.println("Please provide us with a valid email");
		 }else {
			 System.out.println("Email is a Vaild One!!");
		 }
	 }else {
		 System.out.println("Please Provide an Email");
	 }

	 if(!phone.isEmpty()) {
		 System.out.println("phone is Available");
		 if(phone.length()!=10 && phone.matches("([0-9]{9})")) {
			 System.out.println("It is a valid Telephone number");
		 }else {
			 System.out.println("Please provide us with a valid telephone number!!");
		 }
	 }else {
		 System.out.println("Please Provide a Telephone number");
	 }
	 if(!pass.isEmpty()) {
		 System.out.println("Password is Available");
		 if(pass.length()<=25 && pass.matches(passPattern)) {
			 System.out.println("It is a valid Password");
		 }else {
			 System.out.println("Please provide us with a valid Password!!");
		 }
	 }else {
		 System.out.println("Please Provide a Password");
	 }
	 
	 String string = new String("Hello");
	 string=string.concat(" world");
	 System.out.println("Concat is : " +string);
	 
	 StringBuffer buffer = new StringBuffer("Hello");
	 buffer.append(" World");
	 System.out.println("Buffer is: "+""+buffer);
	 
	 StringBuilder builder = new StringBuilder("Hello");
	 builder.append(" World");
	 System.out.println("Builder is: "+builder);
	 
	}

}
