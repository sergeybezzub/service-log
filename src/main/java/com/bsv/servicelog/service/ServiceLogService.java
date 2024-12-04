package com.bsv.servicelog.service;

import com.bsv.servicelog.dto.ShuffleNumbersRequestBody;
import org.springframework.stereotype.Service;

import java.util.*;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class ServiceLogService {


    public void createLogRecord(ShuffleNumbersRequestBody record) {

	    log.info("Record from shuffle-numbers. Requested numbers:{} Recieved numbers:{} Status:{}", record.getAmount(), record.getReceivedSize(), record.getMessage());
    }


}
