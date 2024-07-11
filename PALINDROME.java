//write a java program which reads a three digit number check it is palindrome are not
import java.io.*;
class PALINDROME
{
public static void main(String args[])
{
int a=151;
String result;
result=(a%10==a/100)?"palindrome":"notpalindrome";
System.out.println(result);
}
}