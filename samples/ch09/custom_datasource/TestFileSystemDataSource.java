import net.sf.jasperreports.engine.*;

public class TestFileSystemDataSource
{
	public static JRDataSource test()
	{
		return new JRFileSystemDataSource("/");	
	}
}
