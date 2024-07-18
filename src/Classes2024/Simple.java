package Classes2024;

public class Simple {

	private static String string;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//System.out.println("Java programming");
	//solution1
	String name = "Java";
	System.out.println(name.length());
	
	//solution2
	String uppercase= "java programming";
	System.out.println(uppercase.toUpperCase());
	
	//solution3
	String lowercase="JAVA PROGRAMMING";
	System.out.println(lowercase.toLowerCase());
	
	//solution4
	String a="Java Programming";
	String b="Programming";
	String c="Development";
	System.out.println(a.replace("Programming","")+c);
	
	//solution5
	String d="Java";
	String e="Programming";
	System.out.println(d+e);
	
	//solution6
	String singlecon="    Java and Programming";
	System.out.println(singlecon.trim());
	
	
	//System.out.println("Java Programming");
	//solution7
	String x="Java Programming";
	System.out.println(x.substring(5,11));
	
	
	//solution8
	String y= String.join("", "Java", "Programming", "Language");
	System.out.println(y);
	
	//solution9
	String strA="Java";
	String strB="Java";
	String strC="JAVA";
	System.out.println(strA.equals(strB));
	System.out.println(strA.equals(strC));
	
	//solution10
	String special1="Java";
	String special2="Programming";
	System.out.println("java \'programming\'");
	
    
	
	
}
	}

