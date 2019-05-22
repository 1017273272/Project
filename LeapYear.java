import java .io. *;
public class LeapYear{
	public static void main(String  args[])  throws IOException{
		InputStreamReader ir;
		BufferedReader in;
   		ir=new InputStreamReader(System.in);
		in=new BufferedReader(ir);
		System.out.println("Input year is:");
		String s=in.readLine();
		int year=Integer.parseInt(s);
		if(year%4==0&&year%100!=0||year%400==0){
		System.out.println("year"+year+"is a leap year!");
}
	else{
		System.out.println("year"+year+"is not a leap year!");
}
}
		}
