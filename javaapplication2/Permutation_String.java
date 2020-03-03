/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author hp
 */
public class Permutation_String {
    
    void permute(String str,int l , int r)
    {
    if(l==r)
    {
            System.out.println(str);
            }
    else
    {
    for(int i=1;i<=r;i++)
    {
   
    str=swap(str,l,i);
    permute(str,l+1,r);
     str=swap(str,l,i);
    
    }}}
    
    String swap(String a,int i,int j)
    {
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i];
    charArray[i]=charArray[j];
    charArray[j]=temp;
    return String.valueOf(charArray);
    
    }    
    public static void main(String[] args) {
        Permutation_String permutation = new Permutation_String();
        String str = "ABCd";
        int length = str.length();
        permutation.permute(str,0,length-1);
    }
    
}
