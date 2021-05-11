class Pattern4{
public static void main(String args[]){
int charCount=1;
char chart='A';
for(int i=1;i<=5;i++)
{
for(int j=1;j<=charCount;j++)
{
System.out.print(chart);
chart++;
}
System.out.println();
chart='A';
charCount++;
}
}}