package org.isdb.StudentCrudRelation.Scheduler;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

@Scheduled(fixedRate = 5, timeUnit = TimeUnit.MINUTES)

public void reportCurrentTimeFixedRate() {
	
	try {Thread.sleep(Duration.ofMinutes(1));
	
    } catch (InterruptedException ignored)  {}

log.info("fixedRate -> {}" + dateFormat.format(new Date()));
}
@Scheduled(fixedDelay =5, timeUnit = TimeUnit.SECONDS)

public void reportCurrentTimeFixedDelay() {
	
    try {Thread.sleep(Duration.ofSeconds(1));
    
    } catch (InterruptedException ignored)  {}
    
log.info("fixedDelay -> {}" + dateFormat.format(new Date()));
}

}