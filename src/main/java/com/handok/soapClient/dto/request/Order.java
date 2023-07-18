package com.handok.soapClient.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Master master;
    private List<Detail> details;
    private List<Partner> partners;
    private List<Desc> descs;

    @Data
    public class Master {
        private String docType;
        private String salesOrg;
        private String salesGrp;
        private String salesOff;
        private String distrChan;
        private String division;
        private String ordReason;
        private String billBlock;
        private String purchNoC;
        private String purchNoS;
        private String condType;
    }

    @Data
    public class Detail {
        private String productCode;
        private String batch;
        private int qty;
        private int amt;
        private int seq;
    }

    @Data
    public class Partner {
        private String partnRole;
        private String partnNumb;
    }

    @Data
    public class Desc {
        private String textId;
        private String formatCol;
        private String langu;
        private String textLine;
    }
}
