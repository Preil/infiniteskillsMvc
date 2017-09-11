package com.infiniteskills.mvc.converters;

import com.infiniteskills.mvc.data.services.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import com.infiniteskills.mvc.data.entities.Resource;

/**
 * Ilya 11.09.2017.
 */
public class ResourceConverter implements Converter<String,Resource>{

    @Autowired
    ResourceService service;

    @Override
    public Resource convert(String resourceId) {
        return service.find(new Long(resourceId));
    }
}
