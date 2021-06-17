
	public class BST {
	public BSTNODE root;
	public void insert(String a, String c, long b) {
		if(root==null)
			root=new BSTNODE(a,c,b);
		else {
			BSTNODE q= root;
			while(true) {
				if(a.compareTo(q.name)<0) {
					if(q.left!=null)
						q=q.left;
					else {
						q.left= new BSTNODE(a,c,b);
						break;
					}
				}
			else if(a.compareTo(q.name)>0) {
				if(q.right!=null)
						q=q.right;
				else {
						q.right= new BSTNODE(a,c,b);
						break;
					}
				}
				         }}                                  }
	
	public void inorder() {
		if(root==null)
			return;
		else {
			System.out.println();
			root.inorder();
		}
	}
	public void print() {
		System.out.print("Name     \t\tE-mail     \t\t\tPhone Number\n\n\n");
	}
	
	public void search(String a) {
		if(root==null)
			System.out.print("Not Found!!");
		else
			System.out.println();
			root.search(a);
	}
	public void display_first(){
		if(root==null) 
			System.out.print("Oops!! No Results found");
		else
			root.display_first();
	}
	
	public void display_last() {
		if(root==null) 
			System.out.print("Oops!! No Results found");
		else
			root.display_last();
	}
	
}
