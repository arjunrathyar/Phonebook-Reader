
public class BSTNODE {
	String name,email;
	long number;
	BSTNODE left,right;

	public BSTNODE() {
	}
	
	public BSTNODE(String a,String c,long b) {
		name=a;
		email=c;
		number=b;

	}

	public void inorder() {
		if(left!=null)
			left.inorder();
		System.out.print(name+"     \t"+email+"     \t"+number+"\n");
		if(right!=null)
			right.inorder();
	}
	

	public void search(String a) {
		if((a.compareTo(name)==0)) {
			System.out.print(name+"     \t"+email+"     \t"+number+"\n");
			System.out.println();
			System.out.println();
		}
		else if((a.compareTo(name)<0)&&left!=null)
			left.search(a);
		else if((a.compareTo(name)>0)&&right!=null)
			right.search(a);
		else
			System.out.print("Oops!! No Results found/n");
	}
	
	public void display_first() {
		if(left==null) 
			System.out.print(name+"     \t"+email+"     \t"+number+"\n");
		else 
			left.display_first();
	}
	public void display_last() {
		if(right==null) 
			System.out.print(name+"     \t"+email+"     \t"+number+"\n");
		else 
			right.display_last();

						}
}
