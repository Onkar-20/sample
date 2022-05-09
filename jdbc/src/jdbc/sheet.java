package jdbc;

import java.io.*;  
public class sheet
{  
public static void main(String[]args)   
{  
try   
{  
String filename = "C:\\Users\\Administrator\\Desktop\\CustomersDetail.xlsx";  
FileOutputStream fileOut = new FileOutputStream(filename);  
fileOut.close();  
System.out.println("Excel file has been generated successfully.");  
}   
catch (Exception e)   
{  
e.printStackTrace();  
}  
}  
}  
	
	
	
	
	

