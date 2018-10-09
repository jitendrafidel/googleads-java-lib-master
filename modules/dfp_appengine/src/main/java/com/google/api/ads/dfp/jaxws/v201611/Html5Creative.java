// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201611;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that contains a zipped HTML5 bundle asset, a list of third party impression
 *             trackers, and a third party click tracker.
 *           
 * 
 * <p>Java class for Html5Creative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Html5Creative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201611}Creative">
 *       &lt;sequence>
 *         &lt;element name="overrideSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="thirdPartyImpressionTrackingUrls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="thirdPartyClickTrackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isInterstitial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lockedOrientation" type="{https://www.google.com/apis/ads/publisher/v201611}LockedOrientation" minOccurs="0"/>
 *         &lt;element name="sslScanResult" type="{https://www.google.com/apis/ads/publisher/v201611}SslScanResult" minOccurs="0"/>
 *         &lt;element name="sslManualOverride" type="{https://www.google.com/apis/ads/publisher/v201611}SslManualOverride" minOccurs="0"/>
 *         &lt;element name="isSafeFrameCompatible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="html5Asset" type="{https://www.google.com/apis/ads/publisher/v201611}CreativeAsset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Html5Creative", propOrder = {
    "overrideSize",
    "thirdPartyImpressionTrackingUrls",
    "thirdPartyClickTrackingUrl",
    "isInterstitial",
    "lockedOrientation",
    "sslScanResult",
    "sslManualOverride",
    "isSafeFrameCompatible",
    "html5Asset"
})
public class Html5Creative
    extends Creative
{

    protected Boolean overrideSize;
    protected List<String> thirdPartyImpressionTrackingUrls;
    protected String thirdPartyClickTrackingUrl;
    protected Boolean isInterstitial;
    @XmlSchemaType(name = "string")
    protected LockedOrientation lockedOrientation;
    @XmlSchemaType(name = "string")
    protected SslScanResult sslScanResult;
    @XmlSchemaType(name = "string")
    protected SslManualOverride sslManualOverride;
    protected Boolean isSafeFrameCompatible;
    protected CreativeAsset html5Asset;

    /**
     * Gets the value of the overrideSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideSize() {
        return overrideSize;
    }

    /**
     * Sets the value of the overrideSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideSize(Boolean value) {
        this.overrideSize = value;
    }

    /**
     * Gets the value of the thirdPartyImpressionTrackingUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyImpressionTrackingUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyImpressionTrackingUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getThirdPartyImpressionTrackingUrls() {
        if (thirdPartyImpressionTrackingUrls == null) {
            thirdPartyImpressionTrackingUrls = new ArrayList<String>();
        }
        return this.thirdPartyImpressionTrackingUrls;
    }

    /**
     * Gets the value of the thirdPartyClickTrackingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyClickTrackingUrl() {
        return thirdPartyClickTrackingUrl;
    }

    /**
     * Sets the value of the thirdPartyClickTrackingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyClickTrackingUrl(String value) {
        this.thirdPartyClickTrackingUrl = value;
    }

    /**
     * Gets the value of the isInterstitial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterstitial() {
        return isInterstitial;
    }

    /**
     * Sets the value of the isInterstitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterstitial(Boolean value) {
        this.isInterstitial = value;
    }

    /**
     * Gets the value of the lockedOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link LockedOrientation }
     *     
     */
    public LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }

    /**
     * Sets the value of the lockedOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockedOrientation }
     *     
     */
    public void setLockedOrientation(LockedOrientation value) {
        this.lockedOrientation = value;
    }

    /**
     * Gets the value of the sslScanResult property.
     * 
     * @return
     *     possible object is
     *     {@link SslScanResult }
     *     
     */
    public SslScanResult getSslScanResult() {
        return sslScanResult;
    }

    /**
     * Sets the value of the sslScanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SslScanResult }
     *     
     */
    public void setSslScanResult(SslScanResult value) {
        this.sslScanResult = value;
    }

    /**
     * Gets the value of the sslManualOverride property.
     * 
     * @return
     *     possible object is
     *     {@link SslManualOverride }
     *     
     */
    public SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }

    /**
     * Sets the value of the sslManualOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link SslManualOverride }
     *     
     */
    public void setSslManualOverride(SslManualOverride value) {
        this.sslManualOverride = value;
    }

    /**
     * Gets the value of the isSafeFrameCompatible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSafeFrameCompatible() {
        return isSafeFrameCompatible;
    }

    /**
     * Sets the value of the isSafeFrameCompatible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSafeFrameCompatible(Boolean value) {
        this.isSafeFrameCompatible = value;
    }

    /**
     * Gets the value of the html5Asset property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeAsset }
     *     
     */
    public CreativeAsset getHtml5Asset() {
        return html5Asset;
    }

    /**
     * Sets the value of the html5Asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeAsset }
     *     
     */
    public void setHtml5Asset(CreativeAsset value) {
        this.html5Asset = value;
    }

}
