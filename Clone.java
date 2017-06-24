class RandomListNode {  
    int label;  
    RandomListNode next = null;  
    RandomListNode random = null;  
    RandomListNode(int label) {     
        this.label = label;    
    }
}

public RandomListNode Clone(RandomListNode pHead) {  
    if (pHead==null)        return null;  
    RandomListNode node = pHead;  
    while (node!=null){       //复制自己的结点接在后面
        RandomListNode next = node.next; 
        RandomListNode copy = new RandomListNode(node.label);   
        node.next = copy;      
        node.next.next = next;    
        node = next;   
    }
    
    node=pHead;
    while (node!=null){       //复制random结点
        RandomListNode random = node.random;  
        if (random==null){       
           node.next.random = null;  
        }else { 
            node.next.random = node.random.next;
        }    
        node = node.next.next;
    }
    
    RandomListNode newHead = pHead.next;
    while (pHead != null) {    //断开成两条链表
        RandomListNode temp = pHead.next;  
        pHead.next = temp.next;   
        pHead = pHead.next;   
        if (temp.next != null) {    
            temp.next = temp.next.next;
        }
    }
    
    return newHead;
}
