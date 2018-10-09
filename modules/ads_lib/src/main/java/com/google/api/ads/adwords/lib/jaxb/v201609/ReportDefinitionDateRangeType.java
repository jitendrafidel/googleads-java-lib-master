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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.google.api.ads.adwords.lib.jaxb.v201609;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportDefinition.DateRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportDefinition.DateRangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TODAY"/&gt;
 *     &lt;enumeration value="YESTERDAY"/&gt;
 *     &lt;enumeration value="LAST_7_DAYS"/&gt;
 *     &lt;enumeration value="LAST_WEEK"/&gt;
 *     &lt;enumeration value="LAST_BUSINESS_WEEK"/&gt;
 *     &lt;enumeration value="THIS_MONTH"/&gt;
 *     &lt;enumeration value="LAST_MONTH"/&gt;
 *     &lt;enumeration value="ALL_TIME"/&gt;
 *     &lt;enumeration value="CUSTOM_DATE"/&gt;
 *     &lt;enumeration value="LAST_14_DAYS"/&gt;
 *     &lt;enumeration value="LAST_30_DAYS"/&gt;
 *     &lt;enumeration value="THIS_WEEK_SUN_TODAY"/&gt;
 *     &lt;enumeration value="THIS_WEEK_MON_TODAY"/&gt;
 *     &lt;enumeration value="LAST_WEEK_SUN_SAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportDefinition.DateRangeType")
@XmlEnum
public enum ReportDefinitionDateRangeType {

    TODAY,
    YESTERDAY,
    LAST_7_DAYS,
    LAST_WEEK,
    LAST_BUSINESS_WEEK,
    THIS_MONTH,
    LAST_MONTH,
    ALL_TIME,
    CUSTOM_DATE,
    LAST_14_DAYS,
    LAST_30_DAYS,
    THIS_WEEK_SUN_TODAY,
    THIS_WEEK_MON_TODAY,
    LAST_WEEK_SUN_SAT;

    public String value() {
        return name();
    }

    public static ReportDefinitionDateRangeType fromValue(String v) {
        return valueOf(v);
    }

}
