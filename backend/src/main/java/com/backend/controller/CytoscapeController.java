package com.backend.controller;

import com.backend.service.CytoscapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CytoscapeController {

    @Autowired
    CytoscapeService cytoscapeService;

    @GetMapping("/getdata")
    public ResponseEntity<String> getData() {
        String result = cytoscapeService.getCompanyData();
        return ResponseEntity.ok(result);
    }
}
