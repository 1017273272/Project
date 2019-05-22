import java.io.*;
public class SwitchSample{
	public static void main(String args[]) throws IOException{
InputStreamReader ir;
BufferedReader in;
ir=new InputStreamReader(System.in);
in=new BufferedReader(ir);
System.out.println("请输入月份：");
String s=in.readLine();
	int month =Integer.parseInt(s);
	
	String season;
	switch(month){
	case 12:
	case 1:
	case 2:
	season="Winter";
	break;
	case 3:
 	case 4:
	case 5: 
 		season="Spring";break;
	case 6:
	case 7:
	case 8:
 		season="Summer";break;
	case 9:
	case 10:
	case 11:
 		season="Autumn";
		break;
		default: season="Bogus Month";
	}
			System.out.println(month+"是"+season+"季节");

}
	}