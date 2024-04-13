package ejercicio7;
import ejercicio2.BinaryTree;

public class ParcialArboles {
	BinaryTree<Integer> tree;
	
	public ParcialArboles(BinaryTree<Integer> arb) {
		this.tree = arb;
	}
	
	public BinaryTree<Integer> getNum(int num) {
		return this.getAr(this.tree,num);
	}
	
	private BinaryTree<Integer> getAr(BinaryTree<Integer> arb, int num){
		if(arb.getData() == num) {
			return arb;
		}
		else { 
			BinaryTree<Integer> nodo = null;
			if(arb.hasLeftChild())
				nodo = this.getAr(arb.getLeftChild(), num);
			
			if(arb.hasRightChild() && nodo == null)
				nodo = this.getAr(arb.getRightChild(), num);
			
			return nodo;
		}
	}
	
	public boolean isLeftTree(int num) {
		boolean ok = false;
		
		return ok;
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> arb = new BinaryTree<Integer>(2);
        arb.addLeftChild(new BinaryTree<Integer>(7));
        arb.addRightChild(new BinaryTree<Integer>(-5));
        arb.getLeftChild().addLeftChild(new BinaryTree<Integer>(23));
        arb.getLeftChild().addRightChild(new BinaryTree<Integer>(6));
        arb.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<Integer>(-3));
        arb.getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(55));
        arb.getLeftChild().getRightChild().addRightChild(new BinaryTree<Integer>(11));
        arb.getRightChild().addLeftChild(new BinaryTree<Integer>(19));
        arb.getRightChild().getLeftChild().addRightChild(new BinaryTree<Integer>(4));
        arb.getRightChild().getLeftChild().getRightChild().addLeftChild(new BinaryTree<Integer>(18));
                
        
        ParcialArboles ar = new ParcialArboles(arb);
        System.out.println(ar.getNum(18));
	}
	
}
