package com.zero.quartz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.*;

/**
 * Created with IntelliJ IDEA.
 * User: zero
 * Date: 2017/5/4
 * Time: 16:11
 * To change this template use File | Settings | File Templates.
 */
public class ScanDirectoryJob implements Job {
    static Log logger = LogFactory.getLog(ScanDirectoryJob.class);
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //every job has its own job detail
        JobDetail jobDetail =context.getJobDetail();

        String jobName=jobDetail.getJobClass().getName();
        logger.info("jobName:"+jobName);
        JobDataMap jobDataMap = jobDetail.getJobDataMap();
        String dirName =jobDataMap.getString("SCAN_DIR");
    }
}
