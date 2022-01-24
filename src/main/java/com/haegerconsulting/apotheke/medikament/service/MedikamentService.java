package com.haegerconsulting.apotheke.medikament.service;

import com.haegerconsulting.apotheke.medikament.model.Medikament;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedikamentService {

    public List<Medikament> getMedikamente() {
        return List.of(
                new Medikament(
                        1L,
                        "Asprin 500mg",
                        "DL-Lysinmono(acetylsalicylat)-Glycin",
                        "Bayer AG",
                        "04324188",
                        842

                )
        ) ;
    }

}
