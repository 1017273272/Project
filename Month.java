import java.io.*;
public class Month{
	public static void main(String [] args) throws IOException{
	InputStreamReader ir;
	BufferedReader in;
System.out.println("�������·ݣ�");
int month;

do{	
	ir=new InputStreamReader(System.in);
	in=new BufferedReader(ir);
 	String s=in.readLine();

	month=Integer.parseInt(s);
if(month<1||month>12)
	System.out.println("��������·ݲ��ԣ�����������!");
	else
   System.out.println("  ");
	} while(month<1||month>12);

	switch(month){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: 	
 		System.out.println(month+"�·ݵ�����Ϊ31��");break;
		case 4:
	case 6:
	case 9:
	case 11:
		System.out.println(month+"�·ݵ�����Ϊ30��");break;
	case 2:
		System.out.println("2�µ�����Ϊ29����28��");break;
		default: break;	}
}
}

