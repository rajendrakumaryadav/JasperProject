package in.co.dreamsdoor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.co.dreamsdoor.beans.Keywords;
import in.co.dreamsdoor.beans.Statistics;
import in.co.dreamsdoor.main.db.DataSetResultSet;
import in.co.dreamsdoor.main.db.MySQLMetaData;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class JasperReportProject {

	private final static String INFILE = "src/main/resources/JasperReport.jrxml";
	// private final static String INJASPERFILE =
	// "src/main/resources/JasperReport.jasper";
	private final static String OUTFILE = "src/main/resources/JasperReport.pdf";
	static DataSetResultSet dataSetResultSet;
	static ResultSet keywordResultset, statResultset;
	static String version;
	static Connection connection;

	public static void main(String[] args)
			throws JRException, FileNotFoundException, ClassNotFoundException, SQLException {
		DataSetResultSet dataSetResultSet = new DataSetResultSet();

		keywordResultset = dataSetResultSet.getKeyword();
		statResultset = dataSetResultSet.getStat();
		version = dataSetResultSet.getVersion();

		String static_text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Fusce auctor purus gravida arcu aliquam mattis. Donec et nulla libero, "
				+ "ut varius massa. Nulla sed turpis elit. Etiam aliquet mauris a ligula " + "hendrerit "
				+ "in auctor leo lobortis.";

		List<Keywords> keywordList = new ArrayList<Keywords>();

		if (!keywordResultset.equals(null)) {
			while (keywordResultset.next()) {
				keywordList.add(new Keywords(keywordResultset.getString("word"), keywordResultset.getString("res")));
			}
		}

		List<Statistics> statList = new ArrayList<Statistics>();
		if (!statResultset.equals(null)) {
			while (statResultset.next()) {
				statList.add(new Statistics(statResultset.getString("name"), statResultset.getString("collation"),
						statResultset.getString("nullable"), statResultset.getString("index_name"),
						statResultset.getString("isVariable")));
			}
		}
		Map<String, Object> parameter = new HashMap<String, Object>();
		
		JRBeanCollectionDataSource keywordCollectionDataSource = new JRBeanCollectionDataSource(keywordList);
		parameter.put("KeywordsDataSource", keywordCollectionDataSource);

		JRBeanCollectionDataSource statCollectionDataSource = new JRBeanCollectionDataSource(statList);
		parameter.put("StatisticsDataSource", statCollectionDataSource);

		parameter.put("title", new String("MySQL and Java/Jasper Project"));
		parameter.put("static_text", new String(static_text));
		parameter.put("version", new String(dataSetResultSet.getVersion()));

		JasperReport jreport = JasperCompileManager.compileReport(INFILE);
		JasperPrint jprint = JasperFillManager.fillReport(jreport, parameter, new JREmptyDataSource());
		// JasperPrint jprint = JasperFillManager.fillReport(INJASPERFILE,
		// parameter, new JREmptyDataSource());
		OutputStream outputStream = new FileOutputStream(new File(OUTFILE));

		JasperExportManager.exportReportToPdfStream(jprint, outputStream);

		System.out.println("File Generated!");

	}

}
