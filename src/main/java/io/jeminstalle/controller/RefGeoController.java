package io.jeminstalle.controller;

import io.jeminstalle.domain.RefGeo;
import io.jeminstalle.service.RefGeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController("RefGeoController")
@RequestMapping(value = "/refgeo")
public class RefGeoController {

    @Autowired
    private RefGeoService refGeoService;


    @RequestMapping(value = "/{communeName}", method = RequestMethod.GET)
    public RefGeo getRefGeoByCommuneName(@PathVariable("communeName") String communeName) {
        return refGeoService.getRefGeoByCommuneName(communeName);
    }

}
