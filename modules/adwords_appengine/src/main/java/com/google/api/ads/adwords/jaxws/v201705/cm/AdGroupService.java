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
@WebServiceClient(name = "AdGroupService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201705", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201705/AdGroupService?wsdl")
public class AdGroupService
    extends Service
{

    private final static URL ADGROUPSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADGROUPSERVICE_EXCEPTION;
    private final static QName ADGROUPSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201705", "AdGroupService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201705/AdGroupService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADGROUPSERVICE_WSDL_LOCATION = url;
        ADGROUPSERVICE_EXCEPTION = e;
    }

    public AdGroupService() {
        super(__getWsdlLocation(), ADGROUPSERVICE_QNAME);
    }

    public AdGroupService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AdGroupServiceInterface
     */
    @WebEndpoint(name = "AdGroupServiceInterfacePort")
    public AdGroupServiceInterface getAdGroupServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201705", "AdGroupServiceInterfacePort"), AdGroupServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdGroupServiceInterface
     */
    @WebEndpoint(name = "AdGroupServiceInterfacePort")
    public AdGroupServiceInterface getAdGroupServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201705", "AdGroupServiceInterfacePort"), AdGroupServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADGROUPSERVICE_EXCEPTION!= null) {
            throw ADGROUPSERVICE_EXCEPTION;
        }
        return ADGROUPSERVICE_WSDL_LOCATION;
    }

}
