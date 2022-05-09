package com.core.integra;



import java.util.*;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class report {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String sc="C:\\Users\\Administrator\\eclipse-workspace\\Web\\src\\main\\resources\\firstreport.jrxml";
			Map<String,Object> p=new HashMap<String,Object>();
			p.put("Parameter1", "sam");
			
			Student s1 = new Student(1,"Sandhya","Kamurti","Datta nagar","Solapur");
			Student s2 = new Student(2,"Salman","Shaikh","Datta nagar","Solapur");
			Student s3 = new Student(3,"Onkar","Deshmukh","Datta nagar","Solapur");
			Student s4 = new Student(4,"sanika","daraji","Datta nagar","Solapur");
			Student s5 = new Student(5,"varsha","koli","Datta nagar","Solapur");

			
			List<Student> list = new ArrayList<Student>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);
			
			JRBeanCollectionDataSource bd = new JRBeanCollectionDataSource(list);
			
			//JasperReport report = JasperCompileManager.compileReport(s);
				
			JasperReport report = JasperCompileManager.compileReport(sc);
			JasperPrint print = JasperFillManager.fillReport(report, p, bd);
			
			JasperExportManager.exportReportToPdfFile(print, "C:\\Users\\Administrator\\eclipse-workspace\\Web\\src\\main\\resources\\firstreport.pdf");
			
			System.out.println("report created");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

