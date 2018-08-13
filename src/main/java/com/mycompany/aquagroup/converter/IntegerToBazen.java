
package com.mycompany.aquagroup.converter;

import com.mycompany.aquagroup.dao.AquaGroupDao;
import com.mycompany.aquagroup.entity.Bazen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class IntegerToBazen implements Converter<String, Bazen> {

    @Autowired
    AquaGroupDao aquaGroupDao;
    
    
    @Override
    public Bazen convert(String s) {
        if (s.isEmpty()) {
            return null;
        }
        Integer value = Integer.valueOf(s);
        System.out.println("Konvertujem u bazen");
        Bazen bazen = aquaGroupDao.getBazenById(value);
        return bazen;
    }
    
}
