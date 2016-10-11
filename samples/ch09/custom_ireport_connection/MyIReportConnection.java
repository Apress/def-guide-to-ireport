import it.businesslogic.ireport.IReportConnection;
import java.util.Map;

public class MyIReportConnection extends IReportConnection {
    
  public String getDescription()
  {
  	return "My connection type!";
  }
  
  public net.sf.jasperreports.engine.JRDataSource getJRDataSource() { 
  	return new net.sf.jasperreports.engine.JREmptyDataSource(5); 
  }
    
  public Map getSpecialParameters(Map map) throws net.sf.jasperreports.engine.JRException
  {
    	map.put("MY_TITLE", "Built-in title!");
        return map;
  }
    
}
