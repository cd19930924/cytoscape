package com.backend.service.impl;

import com.backend.service.CytoscapeService;
import org.springframework.stereotype.Service;

@Service
public class CytoscapeServiceImpl implements CytoscapeService {

    @Override
    public String getData() {
        return "{\n" +
                "  \"elements\": [\n" +
                "    { \"data\": { \"id\": \"A\" } },\n" +
                "    { \"data\": { \"id\": \"B\" } },\n" +
                "    { \"data\": { \"source\": \"A\", \"target\": \"B\" } }\n" +
                "  ]\n" +
                "}\n";
    }
}
