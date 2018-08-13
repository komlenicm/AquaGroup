package com.mycompany.aquagroup.converter;

import com.mycompany.aquagroup.dao.AquaGroupDao;
import com.mycompany.aquagroup.entity.KategorijaBazena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class IntegerToKategorijaBazena implements Converter<String, KategorijaBazena> {

    @Autowired
    AquaGroupDao aquaGroupDao;
    
    
    @Override
    public KategorijaBazena convert(String s) {
        if (s.isEmpty()) {
            return null;
        }
        Integer value = Integer.valueOf(s);
        System.out.println("Konvertujem u kategoriju bazena");
        KategorijaBazena kb = aquaGroupDao.getKategorijaBazenaById(value);
        return kb;
    }
    
}
