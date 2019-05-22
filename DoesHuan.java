import java.util.Scanner;
public class DoesHuan {
	public static void main(String[] args){
		int F;
double C;
Scanner input=new Scanner(System.in);
	System.out.println("请输入一个华氏温度F：");
	F=input.nextInt();
	C=5.0/9.0 *(F-32);
	System.out.println("转成摄氏度温度C="+C);
}	
		}