/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeletePlacement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePlacementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the empty placement to delete.
     * </p>
     */
    private String placementName;
    /**
     * <p>
     * The project containing the empty placement to delete.
     * </p>
     */
    private String projectName;

    /**
     * <p>
     * The name of the empty placement to delete.
     * </p>
     * 
     * @param placementName
     *        The name of the empty placement to delete.
     */

    public void setPlacementName(String placementName) {
        this.placementName = placementName;
    }

    /**
     * <p>
     * The name of the empty placement to delete.
     * </p>
     * 
     * @return The name of the empty placement to delete.
     */

    public String getPlacementName() {
        return this.placementName;
    }

    /**
     * <p>
     * The name of the empty placement to delete.
     * </p>
     * 
     * @param placementName
     *        The name of the empty placement to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePlacementRequest withPlacementName(String placementName) {
        setPlacementName(placementName);
        return this;
    }

    /**
     * <p>
     * The project containing the empty placement to delete.
     * </p>
     * 
     * @param projectName
     *        The project containing the empty placement to delete.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The project containing the empty placement to delete.
     * </p>
     * 
     * @return The project containing the empty placement to delete.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The project containing the empty placement to delete.
     * </p>
     * 
     * @param projectName
     *        The project containing the empty placement to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePlacementRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPlacementName() != null)
            sb.append("PlacementName: ").append(getPlacementName()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePlacementRequest == false)
            return false;
        DeletePlacementRequest other = (DeletePlacementRequest) obj;
        if (other.getPlacementName() == null ^ this.getPlacementName() == null)
            return false;
        if (other.getPlacementName() != null && other.getPlacementName().equals(this.getPlacementName()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlacementName() == null) ? 0 : getPlacementName().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        return hashCode;
    }

    @Override
    public DeletePlacementRequest clone() {
        return (DeletePlacementRequest) super.clone();
    }

}
