// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201705.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AdGroupCriterionService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201705/AdGroupCriterionService?wsdl")
public class AdGroupCriterionService
    extends Service
{

    private final static URL ADGROUPCRITERIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADGROUPCRITERIONSERVICE_EXCEPTION;
    private final static QName ADGROUPCRITERIONSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201705", "AdGroupCriterionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201705/AdGroupCriterionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADGROUPCRITERIONSERVICE_WSDL_LOCATION = url;
        ADGROUPCRITERIONSERVICE_EXCEPTION = e;
    }

    public AdGroupCriterionService() {
        super(__getWsdlLocation(), ADGROUPCRITERIONSERVICE_QNAME);
    }

    public AdGroupCriterionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AdGroupCriterionServiceInterface
     */
    @WebEndpoint(name = "AdGroupCriterionServiceInterfacePort")
    public AdGroupCriterionServiceInterface getAdGroupCriterionServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201705", "AdGroupCriterionServiceInterfacePort"), AdGroupCriterionServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdGroupCriterionServiceInterface
     */
    @WebEndpoint(name = "AdGroupCriterionServiceInterfacePort")
    public AdGroupCriterionServiceInterface getAdGroupCriterionServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201705", "AdGroupCriterionServiceInterfacePort"), AdGroupCriterionServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADGROUPCRITERIONSERVICE_EXCEPTION!= null) {
            throw ADGROUPCRITERIONSERVICE_EXCEPTION;
        }
        return ADGROUPCRITERIONSERVICE_WSDL_LOCATION;
    }

}
