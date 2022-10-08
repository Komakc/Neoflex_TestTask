package com.maximandrofagin.testtask.facade;

import com.maximandrofagin.testtask.web.request.VacationPayRequest;
import com.maximandrofagin.testtask.web.response.VacationPayResponse;
import org.springframework.stereotype.Component;

@Component
public class VacationFacade {
    public VacationPayResponse calculateVacationPay(VacationPayRequest request) {
        int avgSalary = request.getAvgSalary();
        int vacationDays = request.getVacationDays();

        double scale = Math.pow(10, 2);
        double avgSalaryDay = Math.ceil((double) avgSalary / 365 * scale) / scale;
        double vacationPay =  avgSalaryDay * vacationDays;

        return VacationPayResponse.builder()
                .vacationPay(vacationPay)
                .build();
    }
}