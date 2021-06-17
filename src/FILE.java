import java.io.*;
import java.util.*;
public class FILE {
private static Scanner n;
private static Scanner m;

public static void main(String[] args) throws IOException {
String x,y,z,g,h;
long j;
int w,d;		
BST b=new BST();
Scanner in=new Scanner(System.in);   		
do{
System.out.print("Enter your desired choice(0-5) \n0.End the Program \n1.Hey!! Start From Here...(Enter the Path)\n2.Search\n3.Display \n4.Display First\n5.Display Last\n\t\t\t: ");
w=in.nextInt();

switch(w) {
case 0:
	System.out.println("Program ended!! ");
	System.out.println("---------------------------------------------------------------------------------------------------------");
	break;
case 1:
	System.out.println("Enter the Path of the File: ");
	m = new Scanner(System.in);
	g=m.nextLine();
	System.out.println("---------------------------------------------------------------------------------------------------------");
	try {
	File f=new File(g);	
	BufferedReader k=new BufferedReader(new FileReader(f));
	String st;
	while ((st= k.readLine())!=null) {
		String[] o=st.split("  ");
		x=o[0];
		y=o[1];
		j=Long.parseLong(y);
		z=o[2];
		b.insert(x,z,j);
	}//example:C:\Users\arjun\Documents\Phonebook.txt
	}
	catch (IOException e) {
		System.out.print("Something went Wrong!!");
		e.printStackTrace();
	}
	break;
case 2:
	System.out.print("Enter the Name to see the details: ");
	h=m.nextLine();
	System.out.println("---------------------------------------------------------------------------------------------------------");
	b.print();
	System.out.println("---------------------------------------------------------------------------------------------------------");
	b.search(h);
	break;
case 3:
	System.out.println("---------------------------------------------------------------------------------------------------------");
	b.print();
	System.out.println("---------------------------------------------------------------------------------------------------------");
	b.inorder();
	System.out.println();
	System.out.println();
	break;
case 4:
	System.out.println("---------------------------------------------------------------------------------------------------------");
	b.print();
	System.out.println("---------------------------------------------------------------------------------------------------------");
	b.display_first();
	System.out.println();
	System.out.println();
	break;
case 5:
	System.out.println("---------------------------------------------------------------------------------------------------------");
	b.print();
	System.out.println("---------------------------------------------------------------------------------------------------------");
	b.display_last();
	System.out.println();
	System.out.println();
	break;
	default: System.out.println("Wrong Choice!! ");
}
if(w==0) 
d=0;
else d=1;

}
while(d==1);
}
}
