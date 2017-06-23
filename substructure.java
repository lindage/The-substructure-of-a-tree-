package main.java.test.jianzhiOffer;
/** * Created by lin on 2017/4/30. 
* 树的子结构 */
public class Offer_17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2==null)            return false;       
        if (root1==null)            return false;       
        if (root1.val==root2.val){           
          return (HasAiZhe(root1.left,root2.left) &&HasAiZhe(root1.right,root2.right))                   
            ||(HasSubtree(root1.left,root2) ||HasSubtree(root1.right,root2));        
        }else {           
          return HasSubtree(root1.left,root2) ||HasSubtree(root1.right,root2);        
        }    
    }    

    private boolean HasAiZhe(TreeNode root1, TreeNode root2) {        
        if (root2==null)            return true;       
        if (root1==null)            return false;       
        if (root1.val==root2.val){            
          return HasAiZhe(root1.left,root2.left) &&HasAiZhe(root1.right,root2.right);        
        }else { 
          return false;     
        }  
    }    

    public static void main(String[] args) { 
        Offer_17 leetCode525 = new Offer_17();       
        TreeNode one = new TreeNode(2);       
        TreeNode two = new TreeNode(2);       
        TreeNode three = new TreeNode(3);    
        TreeNode four = new TreeNode(4);       
        one.left = two;      
        one.right = three;     
        two.left = four;       
        System.out.println(leetCode525.HasSubtree(one,two));   
    }
}
