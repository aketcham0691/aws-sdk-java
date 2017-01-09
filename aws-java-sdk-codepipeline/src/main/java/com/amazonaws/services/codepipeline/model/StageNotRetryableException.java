/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

/**
 * <p>
 * The specified stage can't be retried because the pipeline structure or stage state changed after the stage was not
 * completed; the stage contains no failed actions; one or more actions are still in progress; or another retry attempt
 * is already in progress.
 * </p>
 */
public class StageNotRetryableException extends com.amazonaws.services.codepipeline.model.AWSCodePipelineException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new StageNotRetryableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public StageNotRetryableException(String message) {
        super(message);
    }

}