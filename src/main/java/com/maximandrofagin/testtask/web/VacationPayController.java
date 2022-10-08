package com.maximandrofagin.testtask.web;

import com.maximandrofagin.testtask.facade.VacationFacade;
import com.maximandrofagin.testtask.web.request.Request;
import com.maximandrofagin.testtask.web.response.VacationPayResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/vacation",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class VacationPayController {
    private final VacationFacade vacationFacade;

    public VacationPayController(VacationFacade vacationFacade) {
        this.vacationFacade = vacationFacade;
    }

    @GetMapping(value = "/calculate")
    public VacationPayResponse calculate(@RequestBody Request request) {
        return vacationFacade.calculateVacationPay(request.getVacationPayRequest());
    }
}
