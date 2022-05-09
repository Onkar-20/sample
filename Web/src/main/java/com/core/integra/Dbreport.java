package com.core.integra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class Dbreport {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String sc="C:\\Users\\Administrator\\eclipse-workspace\\Web\\src\\main\\resources\\jdb.jrxml";
			Map<String,Object> p=new HashMap<String,Object>();
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","database");
			
			String s="select * from stud";
			
			
			//JRBeanCollectionDataSource bd = new JRBeanCollectionDataSource(list);
			
			//JasperReport report = JasperCompileManager.compileReport(s);
				
			JasperReport report = JasperCompileManager.compileReport(sc);
			
			JasperPrint print = JasperFillManager.fillReport(report,p, con);
			
			JasperExportManager.exportReportToPdfFile(print, "C:\\Users\\Administrator\\eclipse-workspace\\Web\\src\\main\\resources\\jdb.pdf");
			
			System.out.println("report created");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
