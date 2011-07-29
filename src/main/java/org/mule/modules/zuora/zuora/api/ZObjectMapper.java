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

import org.mule.modules.zuora.zobject.ZObjectType;

import com.zuora.api.object.ZObject;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;

public class ZObjectMapper
{
    public static ZObject toZObject(ZObjectType type, Map<String, String> map)
    {
        ZObject zobject = type.newInstance();
        for (Entry<String, String> entry : map.entrySet())
        {
            zobject.setField(entry.getKey(), entry.getValue());
        }
        return zobject;
    }

    @SuppressWarnings("unchecked")
    public static List<ZObject> toZObject(final ZObjectType type, List<Map<String, String>> maps)
    {
        return (List<ZObject>) CollectionUtils.collect(maps, new Transformer()
        {
            @Override
            public Object transform(Object input)
            {
                return toZObject(type, (Map<String, String>) input);
            }
        });
    }
}
