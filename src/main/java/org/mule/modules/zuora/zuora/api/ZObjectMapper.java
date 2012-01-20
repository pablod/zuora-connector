/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zuora.api;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.mule.modules.zuora.zobject.ZObjectType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zuora.api.object.ZObject;

public class ZObjectMapper {
    private static Logger logger = LoggerFactory.getLogger(ZObjectMapper.class);

    public static ZObject toZObject(ZObjectType type, Map<String, Object> map)
    {
        ZObject zobject = type.newInstance();
        for (Entry<String, Object> entry : map.entrySet())
        {
            if (!entry.getKey().equalsIgnoreCase("id"))
            {
                zobject.setField(entry.getKey(), entry.getValue());
            }
            else
            {
                if (!(entry.getValue() instanceof String))
                {
                    logger.error("The ID of a ZObject must be a String");
                }
                zobject.setId((String) entry.getValue());
            }
        }
        return zobject;
    }

    @SuppressWarnings("unchecked")
    public static List<ZObject> toZObject(final ZObjectType type, List<Map<String, Object>> maps)
    {
        return (List<ZObject>) CollectionUtils.collect(maps, new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return toZObject(type, (Map<String, Object>) input);
            }
        });
    }
}
