package com.haegerconsulting.apotheke.medikament.controller;

import com.haegerconsulting.apotheke.medikament.model.Medikament;
import com.haegerconsulting.apotheke.medikament.service.MedikamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/medikament")
public class MedikamentController {

    @Autowired
    private MedikamentService medikamentService;

    @GetMapping
    public List<Medikament> getMedikamente() {
        return medikamentService.getMedikamente();

    }
}
