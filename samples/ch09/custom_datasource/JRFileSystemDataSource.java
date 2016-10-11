import net.sf.jasperreports.engine.*;
import java.io.*;

public class JRFileSystemDataSource implements JRDataSource
{
	File[] files = null;
	int    index = -1;

	public JRFileSystemDataSource(String path)
	{
		File dir = new File(path);
		if (dir.exists() && dir.isDirectory())
		{
			files = dir.listFiles();
		}
	}

	public JRFileSystemDataSource()
	{
		this(".");
	}

	public boolean next() throws JRException
	{
		index++;
		if (files != null && index < files.length)
		{
			return true;
		}
		return false;
	}
	
	public Object  getFieldValue(JRField jrField) throws JRException
        {
        	File f = files[index];
        	if (f == null) return null;
        	if (jrField.getName().equals("FILENAME"))
        	{
        		return f.getName();
        	}
        	else if (jrField.getName().equals("IS_DIRECTORY"))
        	{
        		return new Boolean(f.isDirectory());
        	}
        	else if (jrField.getName().equals("SIZE"))
        	{
        		return new Long(f.length());
        	}
        	// Field not found...
        	return null;
        }

}