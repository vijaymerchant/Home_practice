package MainScript;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {

	public Logger logger;

	Log() {
		logger = logger.getLogger(getClass());

		PropertyConfigurator.configure(
				"C:\\Users\\win8\\Desktop\\Vijay-Mishra\\Vijay\\Automation\\ArtifactID_Practices_1_Project-releated\\log4j.properties");
	}

	public void tracelog(String logType, String message) {

		switch (logType) {
		case "info":
			logger.info(message);
			break;

		case "warning":
			logger.info(message);
			break;

		case "error":
			logger.info(message);
			break;
		}
	}
}
