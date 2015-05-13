/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  https://github.com/mulesoft/mule-transport-amqp
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.transport.amqp.harness;

public class NameFactory 
{
    public String getQueueName( String flowName)
    {
        return flowName + "-queue";
    }

    public String getExchangeName( String flowName)
    {
        return flowName + "-exchange";
    }
    
    public String getVmName(String flowName)
    {
    	return "vm://" + flowName + ".in";
    }
}
