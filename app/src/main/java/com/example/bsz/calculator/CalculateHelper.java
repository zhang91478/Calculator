package com.example.bsz.calculator;
import java.text.NumberFormat;


/**
 * Created by 22948 on 2017/10/14.
 */

public class CalculateHelper {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private Boolean isNum(char c){
        return c == '0' || c == '1' || c == '2' ||
                c == '3' || c == '4' || c == '5' ||
                c == '6' || c == '7' || c == '8' ||
                c == '9' || c == '.';
    }


    String result(String text){
        this.text =text;
        boolean CountTemp;
        CountTemp= false;
        String temp="";
        String temp1 ="";//储存去括号后的算式
        /*去括号*/
        for(int i=0;i<text.length();++i){
            if(text.charAt(i) == 'π'){
                temp = String.format("%s%s", temp,Math.PI);
            }
            else if(text.charAt(i) == 'e'){
                temp = String.format("%s%s", temp, "2.7182");
            }
            else if(text.charAt(i) == '('||CountTemp){
                temp = String.format("%s%s", temp, text.charAt(i));
                CountTemp = true;
                if(text.charAt(i)==')'){
                    CountTemp = false;
                    temp = temp.substring(1,temp.length()-1);
                    temp1 = String.format("%s%s", temp1, this.result(temp));
                    temp="";
                }
            }
            else{
                temp1 = String.format("%s%s", temp1, text.charAt(i));
            }

        }
        //去单值运算符
        String temp2 = "";//储存去单值运算符后的算式
        for (int i = 0; i < temp1.length(); i++) {//算去单值运算符
            if(temp1.charAt(i)=='%'){
                int j = i+1;
                while(isNum(temp1.charAt(j))){
                    temp = String.format("%s%s", temp, temp1.charAt(j));
                    j++;
                    if(j>=temp1.length())
                        break;
                }
                i+=temp.length();
                temp = getNumNoComma(String.valueOf(Double.parseDouble(temp)/100));
                temp2 = String.format("%s%s", temp2, temp);
                temp = "";
            }
            else if(temp1.charAt(i)=='s'){
                int j = i+3;
                while(isNum(temp1.charAt(j))){
                    if(temp1.charAt(j)!=',') {
                        temp = String.format("%s%s", temp, temp1.charAt(j));
                    }
                    j++;
                    if(j>=temp1.length()){
                        break;
                    }
                }
                i+=temp.length()+2;
                NumberFormat nf = NumberFormat.getInstance();
                temp = getNumNoComma(nf.format(Math.sin(Math.toRadians(Double.parseDouble(temp)))));
                temp2 = String.format("%s%s", temp2, temp);
                temp = "";
            }
            else if(temp1.charAt(i)=='c'){
                int j = i+3;
                while(isNum(temp1.charAt(j))){
                    temp = String.format("%s%s", temp, temp1.charAt(j));
                    j++;
                    if(j>=temp1.length()){
                        break;
                    }
                }
                i+=temp.length()+2;
                NumberFormat nf = NumberFormat.getInstance();
                temp = getNumNoComma(nf.format(Math.cos(Math.toRadians(Double.parseDouble(temp)))));
                temp2 = String.format("%s%s", temp2, temp);
                temp = "";
            }
            else if(temp1.charAt(i)=='t'){
                int j = i+3;
                while(isNum(temp1.charAt(j))){
                    temp = String.format("%s%s", temp, temp1.charAt(j));
                    j=j+1;
                    if(j>=temp1.length()) {
                        break;
                    }
                }
                i+=temp.length()+2;
                NumberFormat nf = NumberFormat.getInstance();
                temp = getNumNoComma(nf.format(Math.tan(Math.toRadians(Double.parseDouble(temp)))));
                temp2 = String.format("%s%s", temp2, temp);
                temp = "";
            }
            else if(temp1.charAt(i)=='√'){
                int j = i+1;
                while(isNum(temp1.charAt(j))){
                    temp = String.format("%s%s",temp, temp1.charAt(j));
                    j=j+1;
                    if(j>=temp1.length()){
                        break;
                    }
                }
                i+=temp.length();
                NumberFormat nf = NumberFormat.getInstance();
                temp = getNumNoComma(nf.format(Math.cos(Math.toRadians(Double.parseDouble(temp)))));
                temp2 = String.format("%s%s", temp2, temp);
                temp = "";
            }
            else if(temp1.charAt(i)=='l'&&temp1.charAt(i+1)=='o'){
                int j = i+3;
                while(isNum(temp1.charAt(j))){
                    temp = String.format("%s%s", temp, temp1.charAt(j));
                    j++;
                    if(j>=temp1.length()){
                        break;
                    }
                }
                i+=temp.length()+2;
                NumberFormat nf = NumberFormat.getInstance();
                temp = getNumNoComma(nf.format(Math.log10(Double.parseDouble(temp))));
                temp2 = String.format("%s%s", temp2, temp);
                temp = "";
            }
            else if(temp1.charAt(i)=='l'&&temp1.charAt(i+1)=='n'){
                int j = i+2;
                while(isNum(temp1.charAt(j))){
                    temp = String.format("%s%s", temp, temp1.charAt(j));
                    j++;
                    if(j>=temp1.length()){
                        break;
                    }
                }
                i+=temp.length()+1;
                NumberFormat nf = NumberFormat.getInstance();
                temp = getNumNoComma(nf.format(Math.log(Double.parseDouble(temp))));
                temp2 = String.format("%s%s", temp2, temp);
                temp = "";
            }
            else if(temp1.charAt(i)=='²'){
                int j = i-1;
                while(isNum(temp1.charAt(j))){
                    temp = String.format("%s%s",temp1.charAt(j),temp);
                    j--;
                    if(j<0){
                        break;
                    }
                }

                temp2 = temp2.substring(0,temp2.length()-temp.length());
                NumberFormat nf = NumberFormat.getInstance();
                temp = getNumNoComma(nf.format(Math.pow(Double.parseDouble(temp),2)));
                temp2 = String.format("%s%s", temp2, temp);
                temp = "";
            }
            else {
                temp2 = String.format("%s%s", temp2, temp1.charAt(i));
            }
        }
        //去求幂运算
        String temp3 = "";//
        for (int i = 0; i < temp2.length(); i++) {
            String left = "";//记录左式
            String  right = "";//记录右式
            if(temp2.charAt(i)=='^'){
                int j ;
                j= i+1;
                while(isNum(temp2.charAt(j))){
                    if(temp2.charAt(j)!=',')
                        right = String.format("%s%s", right, temp2.charAt(j));
                    j++;
                    if(j>=temp2.length())
                        break;
                }
                i+=right.length();
                j= temp3.length()-1;
                while(isNum(temp3.charAt(j))){
                    if(temp3.charAt(j)!=',')
                        left = String.format("%s%s", temp3.charAt(j), left);
                    j--;
                    if(j<0)
                        break;
                }
                temp3 = temp3.substring(0,temp3.length()-left.length());
                NumberFormat nf = NumberFormat.getInstance();
                temp3 = String.format("%s%s", temp3, getNumNoComma(nf.format(Math.pow(Double.parseDouble(left), Double.parseDouble(right)))));

            }
            else {
                temp3 = String.format("%s%s", temp3, temp2.charAt(i));
            }
        }
        temp = "";//重置temp
        String temp4 = "";
        for (int i = 0; i < temp3.length(); i++) {
            String left = "";//记录左式
            String  right = "";//记录右式
            if(temp3.charAt(i)=='×'){
                int j ;
                j= i+1;
                while(isNum(temp3.charAt(j))){
                    right = String.format("%s%s", right, temp3.charAt(j));
                    j++;
                    if(j>=temp3.length())
                        break;
                }
                i+=right.length();
                j= temp4.length()-1;
                while(isNum(temp4.charAt(j))){
                    if(temp4.charAt(j)!=','){
                        left = String.format("%s%s", temp4.charAt(j), left);
                    }
                    j--;
                    if(j<0)
                        break;
                }
                temp4 = temp4.substring(0,temp4.length()-left.length());
                NumberFormat nf = NumberFormat.getInstance();
                temp4 = getNumNoComma(temp4+nf.format(Double.parseDouble(left)*Double.parseDouble(right)));

            }
            else if(temp3.charAt(i)=='÷'){
                int j ;
                j= i+1;
                while(isNum(temp3.charAt(j))){
                    right = String.format("%s%s", right, temp3.charAt(j));
                    j++;
                    if(j>=temp3.length())
                        break;
                }
                i+=right.length();
                j= temp4.length()-1;
                while(isNum(temp4.charAt(j))){
                    left = String.format("%s%s", temp4.charAt(j), left);
                    j--;
                    if(j<0)
                        break;
                }
                temp4 = temp4.substring(0,temp4.length()-left.length());
                NumberFormat nf = NumberFormat.getInstance();
                temp4 = getNumNoComma(temp4+nf.format(Double.parseDouble(left)/Double.parseDouble(right)));
            }
            else {
                temp4 = String.format("%s%s", temp4, temp3.charAt(i));
            }
        }
        //求加减
        String temp5 = "";
        for (int i = 0; i < temp4.length(); i++) {
            String left = "";//记录左式
            String  right = "";//记录右式
            if('+' == temp4.charAt(i)){
                int j ;
                j= i+1;
                while(isNum(temp4.charAt(j))){
                    if(temp4.charAt(j)!=',')
                        right = String.format("%s%s", right, temp4.charAt(j));
                    j++;
                    if(j>=temp4.length())
                        break;
                }
                i+=right.length();
                j= temp5.length()-1;
                while(isNum(temp5.charAt(j))){
                    if(temp5.charAt(j)!=',')
                        left = String.format("%s%s", temp5.charAt(j), left);
                    j--;
                    if(j<0)
                        break;
                }
                temp5 = temp5.substring(0,temp5.length()-left.length());
                NumberFormat nf = NumberFormat.getInstance();
                temp5 = getNumNoComma(temp5+nf.format(Double.parseDouble(left)+Double.parseDouble(right)));
            }
            else if(temp4.charAt(i)=='-'){
                int j ;
                j= i+1;
                while(isNum(temp4.charAt(j))){
                    if(temp4.charAt(j)!=',')
                        right = String.format("%s%s", right, temp4.charAt(j));
                    j++;
                    if(j>=temp4.length())
                        break;
                }
                i+=right.length();
                j= temp5.length()-1;
                while(isNum(temp5.charAt(j))){
                    left = String.format("%s%s", temp5.charAt(j), left);
                    j--;
                    if(j<0)
                        break;
                }
                temp5 = temp5.substring(0,temp5.length()-left.length());
                NumberFormat nf = NumberFormat.getInstance();
                temp5 = getNumNoComma(temp5+nf.format(Double.parseDouble(left)-Double.parseDouble(right)));
            }
            else {
                temp5 = String.format("%s%s", temp5, temp4.charAt(i));
            }

        }
        return temp5;
    }
    private String getNumNoComma(String str){//返回没有逗号的字符串
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=','){
                newStr = String.format("%s%s", newStr, str.charAt(i));
            }
        }
        str = newStr;
        return newStr;
    }

}
