/*
 * Copyright 2014-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.app.web.member;

import java.io.Serializable;

/**
 * @author jflute
 */
public class MemberSearchForm implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                 Basic
    //                                                 -----
    public Integer pageNumber = 0;

    // -----------------------------------------------------
    //                                             Condition
    //                                             ---------
    private String memberName;
    public String memberStatus;
    public String purchaseProductName;
    public boolean unpaid;
    public String formalizedDateFrom;
    public String formalizedDateTo;

    // ===================================================================================
    //                                                                               Reset
    //                                                                               =====
    public void reset() {
        unpaid = false;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return "{" + memberName + ", " + memberStatus + "}";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
