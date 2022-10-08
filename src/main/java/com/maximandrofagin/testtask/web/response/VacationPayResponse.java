package com.maximandrofagin.testtask.web.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VacationPayResponse {
    private double vacationPay;
}
