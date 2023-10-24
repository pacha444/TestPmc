package org.example;

public class Myprog {
    public String divisibleby(int i) {
        String result="";
        if(i%3==0)
        {
            result=i+ " " +"vert";
        }
        if(i%5==0)
        {
            result=i+ " " +"bleu";
        }

        if((i%3==0 && i%5==0))
        {
            result=i+ " " +"jaune";
        }
        return result;
    }
}
