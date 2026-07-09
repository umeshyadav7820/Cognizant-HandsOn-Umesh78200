package com.cognizant.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.restapi.model.Country;
import com.cognizant.restapi.util.CountryUtil;

@Service
public class CountryService {

    public Country getCountry(String code) {

        List<Country> countryList = CountryUtil.getCountryList();

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }

}