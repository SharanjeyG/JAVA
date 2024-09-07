package ZOHO;

public class Decrypt {
    static void decrypt(String s){
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>=48 && c<=57){
                int j=i;
                String temp="";
                while(s.charAt(j)>=48 && s.charAt(j)<=57){
                    temp+=s.charAt(j);
                    j++;
                }
                i=j;
                sum+=Integer.parseInt(temp);
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        String str="123de67fg1c";
        decrypt(str);

    }
}