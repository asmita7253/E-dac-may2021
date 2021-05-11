 class Pattern1{
public static void main(String args[]){
int numCount=1;
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=numCount;j++)
{
System.out.print(num);
num++;
}
System.out.println();
num=1;
numCount++;
}
}}