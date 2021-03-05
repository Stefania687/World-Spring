package it.objectmethod.world.jasper;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import it.objectmethod.world.domain.City;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class JasperService {

	public void getJasperPrint(List<City> beans) throws Exception {

		JRDataSource jasperBeans = new JRBeanCollectionDataSource(beans, true);

		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put(JRParameter.REPORT_LOCALE, Locale.ITALY);

		String jasperFileName = "templates/prova.jasper";

		InputStream report = this.getClass().getClassLoader().getResourceAsStream(jasperFileName);
		JasperPrint print = JasperFillManager.fillReport(report, parameters, jasperBeans);

		JasperExportManager.exportReportToPdfFile(print, "C:/TEMP/JASPER/testDiOggi.pdf");
	}
}