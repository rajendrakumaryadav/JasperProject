package in.co.dreamsdoor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.co.dreamsdoor.beans.Item;
import in.co.dreamsdoor.beans.Student;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class JasperReportProject {

//	private final static String INFILE = "src/main/resources/JasperReport.jrxml";
	private final static String INJASPERFILE = "src/main/resources/JasperReport.jasper";
	private final static String OUTFILE = "src/main/resources/JasperReport.pdf";

	public static void main(String[] args) throws JRException, FileNotFoundException {

		List<Student> studentList = new ArrayList<Student>();
		List<Item> itemList = new ArrayList<Item>();

		studentList.add(new Student(1, "Rajendra Kumar Yadav", "B. Sc (Comp. Science)"));
		studentList.add(new Student(2, "Surendra Kumar Yadav", "12th Science"));
		studentList.add(new Student(3, "Virendra Kumar Yadav", "B.A"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(4, "New User1", "C1"));
		studentList.add(new Student(2, "Surendra Kumar Yadav", "12th Science"));
		studentList.add(new Student(3, "Virendra Kumar Yadav", "B.A"));
		studentList.add(new Student(2, "Surendra Kumar Yadav", "12th Science"));
		studentList.add(new Student(3, "Virendra Kumar Yadav", "B.A"));
		studentList.add(new Student(2, "Surendra Kumar Yadav", "12th Science"));
		studentList.add(new Student(3, "Virendra Kumar Yadav", "B.A"));
		studentList.add(new Student(2, "Surendra Kumar Yadav", "12th Science"));
		studentList.add(new Student(3, "Virendra Kumar Yadav", "B.A"));
		studentList.add(new Student(2, "Surendra Kumar Yadav", "12th Science"));
		studentList.add(new Student(3, "Virendra Kumar Yadav", "B.A"));
		studentList.add(new Student(2, "Surendra Kumar Yadav", "12th Science"));
		studentList.add(new Student(3, "Virendra Kumar Yadav", "B.A"));

		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));
		itemList.add(new Item(1, "Apple MacBook Air", 2018));
		itemList.add(new Item(2, "Mi A1", 2017));
		itemList.add(new Item(3, "Mi A4 32\" TV", 2018));

		JRBeanCollectionDataSource studentDataBean = new JRBeanCollectionDataSource(studentList);
		JRBeanCollectionDataSource itemDataBean = new JRBeanCollectionDataSource(itemList);

		Map<String, Object> parameter = new HashMap<String, Object>();

		parameter.put("StudentDataSource", studentDataBean);
		parameter.put("ItemDataSource", itemDataBean);
		parameter.put("title", new String("This is Multi-Source Report"));

//		JasperReport jreport = JasperCompileManager.compileReport(INFILE);
//		JasperPrint jprint = JasperFillManager.fillReport(jreport, parameter, new JREmptyDataSource());
		
		JasperPrint jprint = JasperFillManager.fillReport(INJASPERFILE, parameter, new JREmptyDataSource());
		OutputStream outputStream = new FileOutputStream(new File(OUTFILE));

		JasperExportManager.exportReportToPdfStream(jprint, outputStream);

		System.out.println("File Generated!");

	}

}
