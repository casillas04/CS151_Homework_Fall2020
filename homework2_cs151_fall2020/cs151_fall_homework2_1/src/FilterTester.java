/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15104
 */
interface Filter<T>{
     boolean accept(T x);
}

class FilterTool implements Filter{

    @Override
    public boolean accept(Object x) {
        if(x instanceof String){
            if(((String) x).length()>=9){
                return true;
            }
        }
        
        if(x instanceof Integer){
            if(((Integer) x).intValue()>=0)
                return true;
        }
        
        return false ;
    }
     
}
public class FilterTester {
    public static void main(String []args){
         String []str={"1111111111111","aaaa","bb"};
         int[]intArray={1,2,-1};
         String[]newS=filter(str,new FilterTool());
         int[] newI=filter(intArray,new FilterTool());
         for(int i:newI){System.out.print(i+"\t");}
         System.out.println();
         for(String s:newS){System.out.print(s+"\t");}
    }
    
    public static String []filter(String []a,Filter<String>f){
         String []array;
         int counter=0;
         for(String s:a){
             if(f.accept(s)==true)
                 counter++;
         }
         
         array=new String[counter];
         counter=0;
        
         for(String s:a){
            if(f.accept(s)==true){
                array[counter]=s;
                counter++;
            }
         }
         
         return array;
    }
    
    public static int []filter(int []a,Filter<Integer>f){
         int []array;
         int counter=0;
         for(int a1:a){
             if(f.accept(a1)==true)
                 counter++;
         }
         
         array=new int[counter];
         counter=0;
        
         for(int a1:a){
            if(f.accept(a1)==true){
                array[counter]=a1;
                counter++;
            }
         }
         
         return array;
    
    }
}
