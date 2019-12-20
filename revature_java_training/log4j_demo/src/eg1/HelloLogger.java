package eg1;

import org.apache.log4j.Logger;

public class HelloLogger {

	final static Logger log=Logger.getLogger(HelloLogger.class);
	public static void main(String[] args) {
		log.debug("Hey debug");
		log.info("Hey info");
		log.warn("hey warn");
		log.error("Hey error");
		log.fatal("hey fatal");
	}

}
