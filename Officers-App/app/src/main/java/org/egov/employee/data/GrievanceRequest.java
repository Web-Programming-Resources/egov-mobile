/*
 * ******************************************************************************
 *  eGov suite of products aim to improve the internal efficiency,transparency,
 *      accountability and the service delivery of the government  organizations.
 *
 *        Copyright (C) <2016>  eGovernments Foundation
 *
 *        The updated version of eGov suite of products as by eGovernments Foundation
 *        is available at http://www.egovernments.org
 *
 *        This program is free software: you can redistribute it and/or modify
 *        it under the terms of the GNU General Public License as published by
 *        the Free Software Foundation, either version 3 of the License, or
 *        any later version.
 *
 *        This program is distributed in the hope that it will be useful,
 *        but WITHOUT ANY WARRANTY; without even the implied warranty of
 *        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *        GNU General Public License for more details.
 *
 *        You should have received a copy of the GNU General Public License
 *        along with this program. If not, see http://www.gnu.org/licenses/ or
 *        http://www.gnu.org/licenses/gpl.html .
 *
 *        In addition to the terms of the GPL license to be adhered to in using this
 *        program, the following additional terms are to be complied with:
 *
 *    	1) All versions of this program, verbatim or modified must carry this
 *    	   Legal Notice.
 *
 *    	2) Any misrepresentation of the origin of the material is prohibited. It
 *    	   is required that all modified versions of this material be marked in
 *    	   reasonable ways as different from the original version.
 *
 *    	3) This license does not grant any rights to any user of the program
 *    	   with regards to rights under trademark law for use of the trade names
 *    	   or trademarks of eGovernments Foundation.
 *
 *      In case of any queries, you can reach eGovernments Foundation at contact@egovernments.org.
 *  *****************************************************************************
 */

package org.egov.employee.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * POJO class used to upload grievances
 **/

public class GrievanceRequest {

    @Expose
    @SerializedName("receivingMode")
    private final String receivingMode = "MOBILE";
    @Expose
    @SerializedName("location")
    private int locationId;
    @Expose
    @SerializedName("lat")
    private double lat;
    @Expose
    @SerializedName("lng")
    private double lng;
    @Expose
    @SerializedName("details")
    private String details;
    @Expose
    @SerializedName("complaintTypeId")
    private int complaintTypeId;
    @Expose
    @SerializedName("landmarkDetails")
    private String landmarkDetails;
    @Expose
    @SerializedName("complainantName")
    private String complainantName;
    @Expose
    @SerializedName("complainantMobileNo")
    private String complainantMobileNo;
    @Expose
    @SerializedName("complainantEmail")
    private String complainantEmail;

    //Constructor for use with lat/lng
    public GrievanceRequest(String complainantName, String complainantMobileNo, String complainantEmail, double lat, double lng, String details, int complaintTypeId, String landmarkDetails) {
        this.complainantName = complainantName;
        this.complainantMobileNo = complainantMobileNo;
        this.complainantEmail = complainantEmail;
        this.lat = lat;
        this.lng = lng;
        this.details = details;
        this.complaintTypeId = complaintTypeId;
        this.landmarkDetails = landmarkDetails;
    }

    //Constructor for use with locationID
    public GrievanceRequest(String complainantName, String complainantMobileNo, String complainantEmail, int locationId, String details, int complaintTypeId, String landmarkDetails) {
        this.complainantName = complainantName;
        this.complainantMobileNo = complainantMobileNo;
        this.complainantEmail = complainantEmail;
        this.locationId = locationId;
        this.details = details;
        this.complaintTypeId = complaintTypeId;
        this.landmarkDetails = landmarkDetails;
    }
}
