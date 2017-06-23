public boolean VerifySquenceOfBST(int [] sequence) { 
    if (sequence.length<1)        return false;   
    if (sequence.length==1||sequence.length==2)        return true;  

    return jisuan(sequence,0,sequence.length-1);
}

private boolean jisuan(int[] sequence, int low, int high) { 
    if (low>=high)        return true;    
    int i = low;  
    for (; i <= high-1; i++) {  
        if (sequence[i]>sequence[high]){     
            break;        
        }   
    }    

    for (int j = i; j <= high-1; j++) {     
        if (sequence[j]<sequence[high])        
           return false;    
    }  
    return jisuan(sequence,low,i-1) && jisuan(sequence,i,high-1);
}
