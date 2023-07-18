package com.handok.soapClient.dto.request;

import lombok.Data;

@Data
public class Mb22MbdDto {
    private String IRsnum;  //예약번호
    private String Rspos;   //예약품목번호
    private int Bdmng;      //소요량
    private String Wempf;   //자재수령인/납품처
    private String Xloek;   //수정,삭제 구분 1. 삭제 0. 수정
}
