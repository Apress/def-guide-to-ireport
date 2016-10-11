import it.businesslogic.ireport.plugin.IReportPlugin;

public class MyIReportConnectionPlugin extends IReportPlugin {
  public void call()
  {
      getMainFrame().addConnectionImplementation( "MyIReportConnection" );
  }
}

  