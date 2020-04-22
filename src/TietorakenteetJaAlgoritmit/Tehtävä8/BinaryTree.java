/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TietorakenteetJaAlgoritmit.Tehtävä8;

/**
 *
 * @author kamaj
 */
public class BinaryTree {

    private Node root;
    
    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }
    public BinaryTree(){
        root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */
    
    public void insert(String aData) {
        aData = aData.toLowerCase();
        Node newNode = new Node(aData);

        if (root == null) {
            root = newNode;
            return;
        }

        if (aData.compareTo(root.getData()) <= 0) {
            if (root.left() == null) {
                root.setLeft(new BinaryTree(aData));
            } else {
                root.left().insert(aData);
            }

        } else {

            if (root.right() == null) {
                root.setRight(new BinaryTree(aData));
            } else {
                root.right().insert(aData);
            }
        }
    }
    public BinaryTree find(String aData){
        aData = aData.toLowerCase();
        if (aData.equals(root.getData())) {
            return new BinaryTree(aData);
        } else if (aData.compareTo(root.getData()) < 0) {
            if (root.left() != null) {
                return root.left().find(aData);
            }
            return null;
        } else {
            if (root.right() != null) {
                return root.right().find(aData);
            }
            return null;
        }
    }
    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }
  
    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}
