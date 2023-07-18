package com.handok.soapClient.controller;

import com.handok.soapClient.client.z_bapi_ar_acc_getopenitems.ArAccGetopenitemsResponse;
import com.handok.soapClient.client.z_bapi_ar_acc_getopenitems.Bapi30072;
import com.handok.soapClient.client.z_bapi_ar_acc_getopenitems.TableOfBapi30072;
import com.handok.soapClient.client.z_bapi_salesorder_simulate.Bapiitemex;
import com.handok.soapClient.client.z_bapi_salesorder_simulate.SalesorderSimulateResponse;
import com.handok.soapClient.client.zfi_credit_detail.ZfiCreditDetailResponse;
import com.handok.soapClient.client.zfi_credit_detail.Zsfi013;
import com.handok.soapClient.client.zfi_search_customer_ws.ZfiSearchCustomerResponse;
import com.handok.soapClient.client.zmm_batch_stock_ws3.ZmmBatchStock2Response;
import com.handok.soapClient.client.zmm_batch_stock_ws3.ZmmWhmatStck2;
import com.handok.soapClient.client.zmm_change_mb22_mbd_2_ws.ZmmChangeMb22Mbd2Response;
import com.handok.soapClient.client.zmm_change_mb22_mbd_ws.ZmmChangeMb22MbdResponse;
import com.handok.soapClient.client.zmm_create_mb21_mbd_ws.ZmmCreateMb21MbdResponse;
import com.handok.soapClient.client.zmm_display_mb25_mbd_ws.TableOfZsmm025;
import com.handok.soapClient.client.zmm_display_mb25_mbd_ws.ZmmDisplayMb25MbdResponse;
import com.handok.soapClient.client.zmm_display_mb25_mbd_ws.Zsmm025;
import com.handok.soapClient.client.zmm_display_mb58_ws.ZmmDisplayMb58Response;
import com.handok.soapClient.client.zmm_display_mb58_ws.Zsmm026;
import com.handok.soapClient.client.zsd_cust_return_create_ws.ZsdCustReturnCreateResponse;
import com.handok.soapClient.client.zsd_delivery_note_so.TableOfZssd007;
import com.handok.soapClient.client.zsd_delivery_note_so.ZsdDeliveryNoteSoResponse;
import com.handok.soapClient.client.zsd_delivery_note_so.Zssd007;
import com.handok.soapClient.client.zsd_so_createfromdat2_ws.ZsdSoCreatefromdat2Response;
import com.handok.soapClient.client.zsd_so_createfromdat3_ws.ZsdSoCreatefromdat3Response;
import com.handok.soapClient.client.zsd_ws_delivery_update_ws.WsDeliveryUpdateResponse;
import com.handok.soapClient.dto.request.*;
import com.handok.soapClient.dto.response.*;
import com.handok.soapClient.service.soap.*;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * SAP Soap 통신
 */
@RestController
@RequestMapping("/api")
public class SoapClientController {
    @Autowired
    private ArAccGetOpenItemSoap arAccGetOpenItemSoap;
    @Autowired
    private ZbapiSalesOrderSimulate zbapiSalesOrderSimulate;
    @Autowired
    private ZfiCreditDetailSoap zfiCreditDetailSoap;
    @Autowired
    private ZmmBatchStockSoap zmmBatchStockSoap;
    @Autowired
    private ZmmChangeMb22Mbd2Soap zmmChangeMb22Mbd2Soap;
    @Autowired
    private ZmmChangeMb22MbdSoap zmmChangeMb22MbdSoap;
    @Autowired
    private ZmmCreateMb21MbdSoap zmmCreateMb21MbdSoap;
    @Autowired
    private ZmmDisplayMb25MbdSoap zmmDisplayMb25MbdSoap;
    @Autowired
    private ZmmDisplayMb58Soap zmmDisplayMb58Soap;
    @Autowired
    private ZsdCustReturnCreateSoap zsdCustReturnCreateSoap;
    @Autowired
    private ZsdDeliveryNoteSoSoap zsdDeliveryNoteSoSoap;
    @Autowired
    private ZsdSoCreatefromdat2Soap zsdSoCreatefromdat2Soap;
    @Autowired
    private ZsdSoCreatefromdat3Soap zsdSoCreatefromdat3Soap;
    @Autowired
    private ZsdWsDeliveryUpdateSoap zsdWsDeliveryUpdateSoap;
    @Autowired
    private ZfiSearchCustomerSoap zfiSearchCustomerSoap;

    /**
     * 가격 확인
     * seq 체크 필요
     *
     * @param form the order
     * @return the list
     */
    @PostMapping("/ZbapiSalesorderSimulate")
    public ResponsePayloadDto invokeZbapiSalesorderSimulate(@RequestBody SimulationRequestDto form) {
        SalesorderSimulateResponse salesorderSimulateResponse = zbapiSalesOrderSimulate.invokeZbapiSalesOrderSimulate(form);
        List<Bapiitemex> bapiitemexes = salesorderSimulateResponse.getOrderItemsOut().getItem();
        List<SimulateData> simulateData = new ArrayList<>();

        int i = 0;
        long[] arr = form.getProducts().stream().mapToLong(SimulationProductDto::getRowIndex).toArray();
        for (Bapiitemex item : bapiitemexes) {
            simulateData.add(
                    SimulateData.builder()
                            .Material(item.getMaterial())
                            .NetValue1(item.getNetValue1())
                            .TxDocCur(item.getTxDocCur())
                            .ItmNumber(item.getItmNumber())
                            .seq(arr[i]).build());
            i++;
        }

        return ResponsePayloadDto.builder().rCode("S").rMessage("성공적으로 처리되었습니다").tData(simulateData).build();
    }

    /**
     * 거래처 여신 정보 반환
     *
     * @param agentCredits the agent credits
     * @return the list
     */
    @PostMapping("/ZfiCreditDetail")
    public ResponseEntity<?> invokeZfiCreditDetail(@RequestBody @NotNull List<AgentCredit> agentCredits) {

        ResponsePayloadDto responsePayloadDto = null;

        for (AgentCredit agentCredit : agentCredits) {
            ZfiCreditDetailResponse zfiCreditDetailResponse = zfiCreditDetailSoap.invokeZfiCreditDetail(agentCredit.getAgentCode());
            Zsfi013 zsfi013 = zfiCreditDetailResponse.getZsfi013();

            BigDecimal klimk = new BigDecimal(zsfi013.getKlimk().trim().replace(",", ""));
            BigDecimal oblig = new BigDecimal(zsfi013.getOblig().trim().replace(",", ""));
            String payTerm = zsfi013.getZterm();
            BigDecimal overdue = BigDecimal.valueOf(0);

            ArAccGetopenitemsResponse arAccGetopenitemsResponse = arAccGetOpenItemSoap.invokeArAccGetOpenItems(agentCredit.getAgentCode());
            TableOfBapi30072 tableOfBapi30072 = arAccGetopenitemsResponse.getLineitems();

            for (Bapi30072 bapi30072 : tableOfBapi30072.getItem()) {
                String blineDate = bapi30072.getBlineDate();
                String pmnttrms = bapi30072.getPmnttrms();
                LocalDate date = LocalDate.parse(blineDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                if (!pmnttrms.equals("")) {
                    if (pmnttrms.charAt(0) == 'X') {
                        date.plusMonths((Integer.parseInt(pmnttrms.substring(1)) + 1) / 30);
                    } else if (pmnttrms.charAt(0) == 'D') {
                        date = date.plusDays(Integer.parseInt(pmnttrms.substring(1)));
                    }
                }

                blineDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM"));

                if (bapi30072.getSpGlInd().equals("") && LocalDate.now().isBefore(YearMonth.parse(blineDate, DateTimeFormatter.ofPattern("yyyy-MM")).atDay(1))) {
                    if (bapi30072.getDbCrInd().equals("H")) overdue = overdue.subtract(bapi30072.getAmount());
                    else overdue = overdue.add(bapi30072.getAmount());
                }
            }

            if (overdue.compareTo(BigDecimal.valueOf(0)) < 0) overdue = BigDecimal.valueOf(0);

            responsePayloadDto = ResponsePayloadDto.builder()
                    .rCode("S")
                    .rMessage("성공적으로 처리되었습니다.")
                    .tData(
                            AgentCreditDetail.builder()
                                    .agentCode(agentCredit.getAgentCode())
                                    .agentName(agentCredit.getAgentName())
                                    .agentCreditTotal(klimk)
                                    .agentAr(oblig)
                                    .agentKeep(agentCredit.getAgentKeep())
                                    .agentCredit(klimk.subtract(oblig).subtract(agentCredit.getAgentKeep()))
                                    .agentOverdue(overdue)
                                    .agentPayTerm(payTerm)
                                    .build()
                    ).build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(responsePayloadDto);
    }

    /**
     * ViewBatch
     *
     * @param lgort 창고코드
     * @param mat   제품코드
     * @return the list
     * @throws JSONException the json exception
     */
    @GetMapping("/ZmmBatchStock")
    public ResponsePayloadDto invokeZmmBatchStock(@RequestParam(value = "lgort") String lgort, @RequestParam("mat") String mat) throws JSONException {
        List<BatchStockDetail> response = new ArrayList<>();

        ZmmBatchStock2Response zmmBatchStock2Response = zmmBatchStockSoap.invokeZmmBatchStock2Response(lgort, mat, null);
        List<ZmmWhmatStck2> zmmWhmatStck2List = zmmBatchStock2Response.getItWhmatStck().getItem();
        for (ZmmWhmatStck2 item : zmmWhmatStck2List) {
            int pDate;
            int iVfdat = Integer.parseInt(item.getVfdat().replace("-", ""));

            if (iVfdat > 0 && iVfdat < 99991231) {
                long diff = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse(item.getVfdat()));
                pDate = Long.valueOf(diff).intValue();
            } else pDate = 9999;

            response.add(BatchStockDetail.builder()
                    .productCode(mat)
                    .batch(item.getCharg())
                    .stockQty(item.getClabs().intValueExact())
                    .batchExpiryDate(item.getVfdat())
                    .batchPeriod(pDate)
                    .lot(item.getLicha())
                    .reservationQty(item.getBdmng().intValueExact())
                    .qty(item.getClabs().subtract(item.getBdmng()).intValueExact())
                    .build());
        }

        return ResponsePayloadDto.builder()
                .rCode(zmmBatchStock2Response.getEResult())
                .rMessage(zmmBatchStock2Response.getEMessage())
                .tData(response)
                .build();
    }

    /**
     * Invoke zmm batch stock ws 3.
     *
     * @param lgort 창고코드
     * @param mat   제품코드
     * @param batch 배치번호
     * @return the int
     * @throws JSONException the json exception
     */
    @GetMapping("/ZmmBatchStockQty")
    public int invokeZmmBatchStockQuantity(@RequestParam("lgort") String lgort, @RequestParam("mat") String mat, @RequestParam("batch") String batch) throws JSONException {
        int returnValue = 0;

        ZmmBatchStock2Response zmmBatchStock2Response = zmmBatchStockSoap.invokeZmmBatchStock2Response(lgort, mat, batch);
        List<ZmmWhmatStck2> zmmWhmatStck2List = zmmBatchStock2Response.getItWhmatStck().getItem();
        for (ZmmWhmatStck2 item : zmmWhmatStck2List) {
            if (item.getClabs().intValueExact() > 0 && item.getCharg().equals(batch)) {
                returnValue = item.getClabs().intValueExact();
            }
        }
        return returnValue;
    }

    /**
     * 배치예약변경
     *
     * @param rsnum the rsnum
     * @param rspos the rspos
     * @param bdmng the bdmng
     * @param wempf the wempf
     * @param xloek the xloek
     * @return the string
     */
    @GetMapping("/ZmmChangeMb22Mbd2")
    public ResponsePayloadDto invokeZmmChangeMb22Mbd2(@RequestParam("rsnum") String rsnum,
                                          @RequestParam("rspos") String rspos,
                                          @RequestParam("bdmng") BigDecimal bdmng,
                                          @RequestParam("wempf") String wempf,
                                          @RequestParam("xloek") String xloek) {
        ZmmChangeMb22Mbd2Response zmmChangeMb22Mbd2Response = zmmChangeMb22Mbd2Soap.invokeZmmChangeMb22Mbd2(rsnum, rspos, bdmng, wempf, xloek);

        return ResponsePayloadDto.builder()
                .rCode(zmmChangeMb22Mbd2Response.getEResult())
                .rMessage(zmmChangeMb22Mbd2Response.getEMessage())
                .build();
    }

    /**
     * Invoke zmm batch stock ws 3.
     *
     * @param rsnum 예약번호
     * @param rspos the rspos
     * @param bdmng the bdmng
     * @return the string
     */
    @GetMapping("/ZmmChangeMb22Mbd")
    public String invokeZmmChangeMb22Mbd(@RequestParam("rsnum") String rsnum, @RequestParam("rspos") String rspos, @RequestParam("bdmng") int bdmng) {
        ZmmChangeMb22MbdResponse zmmChangeMb22MbdResponse = zmmChangeMb22MbdSoap.invokeZmmChangeMb22MbdResponse(rsnum, rspos, bdmng);
        return zmmChangeMb22MbdResponse.getEResult();
    }

    /**
     * 배치예약
     *
     * @param reservation the reservation
     * @return the zmm create mb 21 mbd response
     */
    @PostMapping("/ZmmCreateMb21Mbd")
    public ResponsePayloadDto invokeZmmCreateMb21Mbd(@RequestBody @NotNull Reservation reservation) {
        ZmmCreateMb21MbdResponse response = zmmCreateMb21MbdSoap.invokeZmmCreateMb21Mbd(reservation);
        return ResponsePayloadDto.builder()
                .rCode(response.getEResult())
                .rMessage(response.getEMessage())
                .tData(response.getERsnum()).build();
    }

    /**
     * 배치목록
     *
     * @param partner the partner
     * @param mat     the mat
     * @return the list
     */
    @GetMapping("/ZmmDisplayMb25Mbd")
    public ResponsePayloadDto invokeZmmDisplayMb25Mbd(@RequestParam(value = "partner", required = false) String partner, @RequestParam(value = "mat", required = false) String mat) {
        List<BatchDetail> batchDetailList = new ArrayList<>();
        ZmmDisplayMb25MbdResponse zmmDisplayMb25MbdResponse = zmmDisplayMb25MbdSoap.invokeZmmDisplayMb25Mbd(partner, mat);

        if (zmmDisplayMb25MbdResponse.getEResult().equals("S")) {
            TableOfZsmm025 tableOfZsmm025 = zmmDisplayMb25MbdResponse.getETable();
            List<Zsmm025> list = tableOfZsmm025.getItem();

            for (Zsmm025 item : list) {
                String pDate = "";
                int iVfdate = Integer.parseInt(item.getVfdat().replace("-", ""));
                if (iVfdate > 0 && iVfdate < 99991231) {
                    Period diff = Period.between(LocalDate.parse(item.getVfdat()), LocalDate.now());
                    pDate = String.valueOf(diff.getDays());
                }

                String Kostl = StringUtils.isEmpty(item.getKostl()) ? "0" : item.getKostl();
                String Matnr = StringUtils.isEmpty(item.getMatnr()) ? "0" : item.getMatnr();

                batchDetailList.add(BatchDetail.builder()
                        .rsnum(item.getRsnum())
                        .rspos(item.getRspos())
                        .bster(item.getBster())
                        .bdter(item.getBdter())
                        .lgort(item.getLgort())
                        .kostl(Kostl)
                        .matnr(Matnr)
                        .charg(item.getCharg())
                        .bdmng(item.getBdmng().intValueExact())
                        .meins(item.getMeins())
                        .wempf(item.getWempf())
                        .vfdat(item.getVfdat())
                        .batchPeriod(pDate)
                        .build());
            }
        }

        ResponsePayloadDto responsePayloadDto = ResponsePayloadDto.builder()
                .rCode(zmmDisplayMb25MbdResponse.getEResult())
                .rMessage(zmmDisplayMb25MbdResponse.getEMessage())
                .tData(batchDetailList)
                .build();


        return responsePayloadDto;
    }

    /**
     * Invoke zmm display mb 58 list.
     *
     * @param partner the partner
     * @param mat     the mat
     * @return the list
     */
    @GetMapping("/ZmmDisplayMb58")
    public List<MB58> invokeZmmDisplayMb58(@RequestParam("partner") String partner, @RequestParam("mat") String mat) {
        List<MB58> mb58List = new ArrayList<>();
        ZmmDisplayMb58Response zmmDisplayMb58Response = zmmDisplayMb58Soap.invokeZmmDisplayMb58(partner, mat);

        List<Zsmm026> list = zmmDisplayMb58Response.getETable().getItem();
        for (Zsmm026 item : list) {
            String pDate = "";
            int iVfdate = Integer.parseInt(item.getVfdat().replace("-", ""));

            if (iVfdate > 0 && iVfdate < 99991231) {
                Period diff = Period.between(LocalDate.parse(item.getVfdat()), LocalDate.now());
                pDate = String.valueOf(diff.getDays());
            }

            mb58List.add(MB58.builder()
                    .Ersda(item.getErsda())
                    .Matnr(item.getMatnr())
                    .Maktx(item.getMaktx())
                    .Charg(item.getCharg())
                    .Kulab(item.getKulab().intValueExact())
                    .Licha(item.getLicha())
                    .Vfdat(item.getVfdat())
                    .Period(pDate)
                    .build());
        }

        return mb58List;
    }

    /**
     * Invoke zsd cust return create zsd cust return create response.
     *
     * @param order the order
     * @return the zsd cust return create response
     */
    @PostMapping("/ZsdCustReturnCreate")
    public ZsdCustReturnCreateResponse invokeZsdCustReturnCreate(@RequestBody @NotNull Order order) {
        return zsdCustReturnCreateSoap.invokeZsdCustReturnCreate(order);
    }

    /**
     * Invoke zsd delivery note so order slip detail.
     *
     * @param orderNo the 주문번호
     * @return the order slip detail
     */
    @GetMapping("/ZsdDeliveryNoteSo")
    public DeliveryNoteSo invokeZsdDeliveryNoteSo(@RequestParam("orderNo") String orderNo) {
        List<GtTab> gtTabs = new ArrayList<>();
        ZsdDeliveryNoteSoResponse zsdDeliveryNoteSo = zsdDeliveryNoteSoSoap.invokeZsdDeliveryNoteSo(orderNo);

        TableOfZssd007 tableOfZssd007 = zsdDeliveryNoteSo.getGtTab();
        List<Zssd007> list = tableOfZssd007.getItem();

        for (Zssd007 item : list) {
            gtTabs.add(GtTab.builder()
                    .Matnr(String.valueOf(Integer.parseInt(item.getMatnr())))
                    .Arktx(item.getArktx())
                    .Lfimg(item.getLfimg().intValueExact())
                    .Vfdat(item.getVfdat())
                    .Licha(item.getLicha())
                    .Charg(item.getCharg())
                    .build());
        }

        return DeliveryNoteSo.builder()
                .Gnetwrc(zsdDeliveryNoteSo.getGsHead().getGnetwr())
                .Gtotalc(zsdDeliveryNoteSo.getGsHead().getGtotal())
                .gtTabList(gtTabs)
                .build();
    }

    /**
     * Invoke zsd so createfromdat 2 zsd so createfromdat 2 response.
     *
     * @param order the order
     * @return the zsd so createfromdat 2 response
     */
    @PostMapping("/ZsdSoCreatefromdat2")
    public ZsdSoCreatefromdat2Response invokeZsdSoCreatefromdat2(@RequestBody Order order) {
        return zsdSoCreatefromdat2Soap.invokeZsdSoCreatefromdat2(order);
    }

    /**
     * Invoke zsd so createfromdat 3 zsd so createfromdat 3 response.
     *
     * @param order the order
     * @return the zsd so createfromdat 3 response
     */
    @PostMapping("/ZsdSoCreatefromdat3")
    public ZsdSoCreatefromdat3Response invokeZsdSoCreatefromdat3(@RequestBody Order order) {
        return zsdSoCreatefromdat3Soap.invokeZsdSoCreatefromdat3(order);
    }

    /**
     * Invoke zsd ws delivery update string.
     *
     * @param deliveryNo the delivery no
     * @return the string
     */
    @GetMapping("/ZsdWsDeliveryUpdate")
    public String invokeZsdWsDeliveryUpdate(@RequestParam("deliveryNo") String deliveryNo) {
        WsDeliveryUpdateResponse wsDeliveryUpdateResponse = zsdWsDeliveryUpdateSoap.invokeZsdWsDeliveryUpdate(deliveryNo);
        return wsDeliveryUpdateResponse.getEfErrorAny0().equals("") ? "Y" : "N";
    }

    /**
     * 거래처 검색
     *
     * @param i_gubun the gubun('1: 거래처코드, '2': 거래처명 '3' : 사업자번호)
     * @param i_value the value
     * @return the zfi search customer response
     */
    @GetMapping("/ZfiSearchCustomer")
    public ResponsePayloadDto invokeZfiSearchCustomer(@RequestParam("i_gubun") String i_gubun, @RequestParam("i_value") String i_value) {

        ZfiSearchCustomerResponse respons =  zfiSearchCustomerSoap.invokeZfiSearchCustomer(i_gubun, i_value);
        ResponsePayloadDto responsePayloadDto = ResponsePayloadDto.builder().rCode(respons.getRCode()).rMessage(respons.getRMessage()).tData(respons.getTData()).build();

        return responsePayloadDto;
    }
}
