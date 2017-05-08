import java.util.*;
import java.io.*;

class IDPASSWORD
{

public static void main (String args[])throws IOException
{


Formatter f=new Formatter("C:\\data\\id-pswrd.txt");
System.out.println("Enter 0 if you want to save ID and password without any spaces\nEnter 1 if you want to access the saved passwords with IDs");
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();

if(ch==0)
{
System.out.println("Enter the ID\n Enter number of characters and then password\n Enter \"exit\" to exit saving ID");
String ID,pswrd;
ID=sc.next();
pswrd=sc.next();
int noofcharinpswrd=pswrd.length();
while(ID!="exit")
{
f.format("%s",ID);
//char pswrdunen[];
String pswrdunen="";
int con=0;
int noofcharpswrd=noofcharinpswrd;

while(noofcharpswrd!=0)
{
//pswrdunen[con]=pswrd.charAt(con);
pswrdunen=pswrdunen.concat(String.valueOf(pswrd.charAt(con)));
con++;
--noofcharpswrd;
}
String pswrden="",pswrdl,x;
String pswrdunenr=idp.reverse(pswrdunen);int i;
for(i=1;i<=noofcharinpswrd;i++)
{
pswrdl=String.valueOf(pswrdunenr.charAt(noofcharinpswrd-i));
pswrden=pswrden+pswrdl;
}

f.format("%i%s",noofcharinpswrd,pswrden.concat(pswrdunenr.concat(pswrden)));
}}


else if(ch==1)
{
System.out.println("Enter the ID for the pswrd\n Enter \"exit\" to exit");
String IDin=sc.nextLine();

while(IDin!="exit")
{

try
{
File file=new File("C:\\data\\id-pswrd.txt");
Scanner s=new Scanner(file);
int v=0;

while(s.hasNext())
{
String chk=s.next();
if(IDin==chk)
{
v=1;
break;
}
else
{
s.next();
}
}

if(v==1)
{
String rpswrd=s.next();
int noofchar=rpswrd.charAt(0);
char rnpswrd[]={'a'};
int i;
for(i=1;i<=noofchar;i++)
{
rnpswrd[i]=rpswrd.charAt(i+1);
}

String frsthlf="";

for(i=1;i<=noofchar;i+=2)
{
frsthlf=frsthlf.concat(String.valueOf(rnpswrd[i]));
}
String scndhlf="";

for(i=0;i<=noofchar;i+=2)
{
scndhlf=scndhlf.concat(String.valueOf(rnpswrd[i]));
}

String comppswrd=frsthlf.concat(idp.reverse(scndhlf));
System.out.println("The password for the given ID is "+comppswrd);
}

System.out.println("Enter the ID for the pswrd\n Enter \"exit\" to exit");
IDin=sc.nextLine();
}

catch(Exception e){}
}
}





}

}
class idp
{
public  static String reverse(String a)
{
    int b=a.length();int i;
    String r="";
    for(i=b-1;i<=0;i--)
    {
        r=r+(a.charAt(i));
    }
    return (r);
}
}
        
