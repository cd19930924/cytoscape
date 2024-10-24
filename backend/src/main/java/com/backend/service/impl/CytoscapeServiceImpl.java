package com.backend.service.impl;

import com.backend.service.CytoscapeService;
import org.springframework.stereotype.Service;

@Service
public class CytoscapeServiceImpl implements CytoscapeService {

    @Override
    public String getCompanyData() {
        return "{\n" +
                "  \"elements\": [\n" +
                "    { \"data\": { \"id\": \"a1\", \"type\": \"L_3\", \"node\": \"12540740\", \"banNm\": \"萬OOO股份有限公司\" } },\n" +
                "    { \"data\": { \"id\": \"a30\", \"type\": \"L_3\", \"node\": \"19754458\", \"banNm\": \"OO加油站股份有限公司\" } },\n" +
                "    { \"data\": { \"id\": \"a31\", \"type\": \"L_3\", \"node\": \"27843567\", \"banNm\": \"OO有限公司\" } },\n" +
                "    { \"data\": { \"id\": \"a32\", \"type\": \"L_3\", \"node\": \"37827566\", \"banNm\": \"OOO蛋糕有限公司XX門市\" } },\n" +
                "    { \"data\": { \"id\": \"a33\", \"type\": \"L_3\", \"node\": \"85233331\", \"banNm\": \"正好停股份有限公司三重商工站\" } },\n" +
                "    { \"data\": { \"id\": \"a34\", \"type\": \"L_3\", \"node\": \"91552810\", \"banNm\": \"O水盒餐廚工坊\" } },\n" +
                "    { \"data\": { \"id\": \"a2\", \"type\": \"O_3\", \"node\": \"ACT (FASTENERS & COMPONENTS) LTD\", \"banNm\": \"ACT (FASTENERS & COMPONENTS) LTD\" } },\n" +
                "    { \"data\": { \"id\": \"a3\", \"type\": \"O_3\", \"node\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\", \"banNm\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\" } },\n" +
                "    { \"data\": { \"id\": \"a4\", \"type\": \"O_3\", \"node\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\", \"banNm\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD\" } },\n" +
                "    { \"data\": { \"id\": \"a5\", \"type\": \"O_3\", \"node\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD.\", \"banNm\": \"ALL INDUSTRIAL MANUFACTURING PTE LTD.\" } },\n" +
                "    { \"data\": { \"id\": \"a6\", \"type\": \"O_3\", \"node\": \"ASSOCIATED FASTENING PRODUCTS, INC.\", \"banNm\": \"ASSOCIATED FASTENING PRODUCTS, INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a7\", \"type\": \"O_3\", \"node\": \"B&B ELECTRO-MECHANICAL COMPONENTS,INC.\", \"banNm\": \"B&B ELECTRO-MECHANICAL COMPONENTS,INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a8\", \"type\": \"O_3\", \"node\": \"BOSSARD (THAILAND) LIMITED HEAD OFFICE\", \"banNm\": \"BOSSARD (THAILAND) LIMITED HEAD OFFICE\" } },\n" +
                "    { \"data\": { \"id\": \"a9\", \"type\": \"O_3\", \"node\": \"CAN-AM TOOL CORP.\", \"banNm\": \"CAN-AM TOOL CORP.\" } },\n" +
                "    { \"data\": { \"id\": \"a10\", \"type\": \"O_3\", \"node\": \"CHUN YU WORKS (USA), INC.\", \"banNm\": \"CHUN YU WORKS (USA), INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a11\", \"type\": \"O_3\", \"node\": \"COMPONENT TECHNOLOGIES INTERNATIONAL, INC.\", \"banNm\": \"COMPONENT TECHNOLOGIES INTERNATIONAL, INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a12\", \"type\": \"O_3\", \"node\": \"DANIEL GRUPPE GMBH\", \"banNm\": \"DANIEL GRUPPE GMBH\" } },\n" +
                "    { \"data\": { \"id\": \"a13\", \"type\": \"O_3\", \"node\": \"HFI PYROTECHNICS INC.\", \"banNm\": \"HFI PYROTECHNICS INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a14\", \"type\": \"O_3\", \"node\": \"INDUSTRIAL PRODUCTS COMPANY INC\", \"banNm\": \"INDUSTRIAL PRODUCTS COMPANY INC\" } },\n" +
                "    { \"data\": { \"id\": \"a15\", \"type\": \"O_3\", \"node\": \"LAUBE TECHNOLOGY\", \"banNm\": \"LAUBE TECHNOLOGY\" } },\n" +
                "    { \"data\": { \"id\": \"a16\", \"type\": \"O_3\", \"node\": \"LAUBE TECHNOLOGY\", \"banNm\": \"LAUBE TECHNOLOGY\" } },\n" +
                "    { \"data\": { \"id\": \"a17\", \"type\": \"O_3\", \"node\": \"LAUBE TECHNOLOGY\", \"banNm\": \"LAUBE TECHNOLOGY\" } },\n" +
                "    { \"data\": { \"id\": \"a18\", \"type\": \"O_3\", \"node\": \"OTTO EICHHOFF GMBH & CO. KG\", \"banNm\": \"OTTO EICHHOFF GMBH & CO. KG\" } },\n" +
                "    { \"data\": { \"id\": \"a19\", \"type\": \"O_3\", \"node\": \"RAB COMPONENTS\", \"banNm\": \"RAB COMPONENTS\" } },\n" +
                "    { \"data\": { \"id\": \"a20\", \"type\": \"O_3\", \"node\": \"STATE INDUSTRIAL SUPPLY CORP.\", \"banNm\": \"STATE INDUSTRIAL SUPPLY CORP.\" } },\n" +
                "    { \"data\": { \"id\": \"a21\", \"type\": \"O_3\", \"node\": \"SUPPLY TECHNOLOGIES (UKGRP) LTD\", \"banNm\": \"SUPPLY TECHNOLOGIES (UKGRP) LTD\" } },\n" +
                "    { \"data\": { \"id\": \"a22\", \"type\": \"O_3\", \"node\": \"SUPPLY TECHNOLOGIES CR S.R.O.\", \"banNm\": \"SUPPLY TECHNOLOGIES CR S.R.O.\" } },\n" +
                "    { \"data\": { \"id\": \"a23\", \"type\": \"O_3\", \"node\": \"SUPPLY TECHNOLOGIES CR S.R.O.\", \"banNm\": \"SUPPLY TECHNOLOGIES CR S.R.O.\" } },\n" +
                "    { \"data\": { \"id\": \"a24\", \"type\": \"O_3\", \"node\": \"SUPPLY TECHNOLOGIES-REYNOSA\", \"banNm\": \"SUPPLY TECHNOLOGIES-REYNOSA\" } },\n" +
                "    { \"data\": { \"id\": \"a25\", \"type\": \"O_3\", \"node\": \"TIGGES GMBH & CO. KG\", \"banNm\": \"TIGGES GMBH & CO. KG\" } },\n" +
                "    { \"data\": { \"id\": \"a26\", \"type\": \"O_3\", \"node\": \"TR FASTENINGS AB\", \"banNm\": \"TR FASTENINGS AB\" } },\n" +
                "    { \"data\": { \"id\": \"a27\", \"type\": \"O_3\", \"node\": \"TR FASTENINGS INC.\", \"banNm\": \"TR FASTENINGS INC.\" } },\n" +
                "    { \"data\": { \"id\": \"a28\", \"type\": \"O_3\", \"node\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\", \"banNm\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\" } },\n" +
                "    { \"data\": { \"id\": \"a29\", \"type\": \"O_3\", \"node\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\", \"banNm\": \"UF INDUSTRIES UNRUH & FRIESEN OHG\" } },\n" +
                "    { \"data\": { \"source\": \"a30\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a32\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a34\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a31\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a33\", \"target\": \"a1\", \"arrow\": \"buy\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a2\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a3\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a4\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a5\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a6\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a7\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a8\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a9\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a10\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a11\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a12\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a13\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a14\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a15\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a16\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a17\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a18\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a19\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a20\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a21\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a22\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a23\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a24\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a25\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a26\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a27\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a28\", \"arrow\": \"sell\" } },\n" +
                "    { \"data\": { \"source\": \"a1\", \"target\": \"a29\", \"arrow\": \"sell\" } }\n" +
                "  ]\n" +
                "}\n";
    }
}
