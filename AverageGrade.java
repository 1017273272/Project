import java.io.*;
public class AverageGrade{
	public static void main(String[] args) throws IOException{
	int score,sum;
	float avg;
	sum=0;
	InputStreamReader ir;
	BufferedReader in;
  	for(int i=0;i<5;i++)
	{ ir=new InputStreamReader(System.in);
	in=new BufferedReader(ir);
	System.out.println("������ɼ���");
	String s=in.readLine();
	score=Integer.parseInt(s);
	sum=sum+score;
	}
avg=sum/5;
System.out.println("ƽ�ֳɼ�Ϊ��"+ avg);
}
		}