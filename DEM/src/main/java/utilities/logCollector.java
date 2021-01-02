package utilities;

import org.apache.log4j.Logger;

public class logCollector {
	

	public static Logger log =Logger.getLogger(logCollector.class.getName());
	
	public static void info(String Message)
	
	{
		log.info(Message);
	}

	
public static void debug(String Message)
	
	{
		log.debug(Message);
	}

public static void error(String Message)

{
	log.error(Message);
}

public static void fatal(String Message)

{
	log.fatal(Message);

}

}