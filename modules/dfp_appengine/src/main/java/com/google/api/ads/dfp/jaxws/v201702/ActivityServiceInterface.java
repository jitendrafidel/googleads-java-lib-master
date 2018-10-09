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


package com.google.api.ads.dfp.jaxws.v201702;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link Activity} objects.
 *       <p>
 *       An activity group contains {@link Activity} objects. Activities have a one-to-one relationship
 *       with activity groups. Each activity can belong to only one activity group. Activity groups,
 *       however, have a one-to-many relationship with activities, meaning each activity group can have
 *       multiple activities. A activity group can be used to manage the activities it contains.
 *       </p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ActivityServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ActivityServiceInterface {


    /**
     * 
     *         Creates a new {@link Activity} objects.
     *         
     *         @param activities to be created.
     *         @return the created activities with its IDs filled in.
     *       
     * 
     * @param activities
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201702.Activity>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
    @RequestWrapper(localName = "createActivities", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ActivityServiceInterfacecreateActivities")
    @ResponseWrapper(localName = "createActivitiesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ActivityServiceInterfacecreateActivitiesResponse")
    public List<Activity> createActivities(
        @WebParam(name = "activities", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
        List<Activity> activities)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link ActivityPage} of {@link Activity} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Activity#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Activity#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code expectedURL}</td>
     *         <td>{@link Activity#expectedURL}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Activity#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code activityGroupId}</td>
     *         <td>{@link Activity#activityGroupId}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a statement used to filter a set of activities.
     *         @return the activities that match the given filter.
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201702.ActivityPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
    @RequestWrapper(localName = "getActivitiesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ActivityServiceInterfacegetActivitiesByStatement")
    @ResponseWrapper(localName = "getActivitiesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ActivityServiceInterfacegetActivitiesByStatementResponse")
    public ActivityPage getActivitiesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Activity} objects.
     *         
     *         @param activities to be updated.
     *         @return the updated activities.
     *       
     * 
     * @param activities
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201702.Activity>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
    @RequestWrapper(localName = "updateActivities", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ActivityServiceInterfaceupdateActivities")
    @ResponseWrapper(localName = "updateActivitiesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702", className = "com.google.api.ads.dfp.jaxws.v201702.ActivityServiceInterfaceupdateActivitiesResponse")
    public List<Activity> updateActivities(
        @WebParam(name = "activities", targetNamespace = "https://www.google.com/apis/ads/publisher/v201702")
        List<Activity> activities)
        throws ApiException_Exception
    ;

}
