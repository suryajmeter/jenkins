public class Hello {

	
	public static void main(String args[]) {
		int a=10;
		String b="work1";
		String c= String.valueOf(a);
		System.out.println(a);
		System.out.println(a+b);//value of
		Hello str=new Hello();
		System.out.println(str);//object reference
		System.out.println(b.toUpperCase());//case change
		System.out.println(String.join(":", "happy","Birthday","to"));//join()
		StringBuffer sbr= new StringBuffer("Hello");//string buffer
		
		System.out.println("Length is"+sbr.length()+" "+" "+"&"+"capacity is"+sbr.capacity());
		System.out.println(sbr);
		System.out.println(sbr.append(str).append("Hello"));
		//System.out.println(sbr.reverse());//reverse string
		//System.out.println(sbr.replace(30, 35, "repla"));
		
		
	}
}
