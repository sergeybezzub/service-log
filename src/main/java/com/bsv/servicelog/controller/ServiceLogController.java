package com.bsv.servicelog.controller;

import com.bsv.servicelog.dto.ShuffleNumbersRequestBody;
import com.bsv.servicelog.service.ServiceLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/service-log/")
@Slf4j
public class ServiceLogController {

    @Autowired
    private ServiceLogService serviceLogService;

    @PostMapping("/")
    public ResponseEntity<Void> createShuffledNumbers(@RequestBody ShuffleNumbersRequestBody body) {
        serviceLogService.createLogRecord(body);
        return ResponseEntity.ok().build();
    }

}
