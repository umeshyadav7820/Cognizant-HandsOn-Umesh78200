package com.cognizant.restapi.util;

import java.io.File;
import java.util.List;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import javax.xml.transform.stream.StreamSource;
import com.cognizant.restapi.model.Country;
import com.cognizant.restapi.model.CountryList;

public class CountryUtil {

    public static List<Country> getCountryList() {

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setClassesToBeBound(CountryList.class);

        CountryList countries = (CountryList) marshaller.unmarshal(
                new StreamSource(new File("src/main/resources/country.xml")));

        return countries.getCountryList();
    }
}
