package com.handok.soapClient.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponsePayloadDto<T> {
    private String rCode;
    private String rMessage;
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private T tData;
}
