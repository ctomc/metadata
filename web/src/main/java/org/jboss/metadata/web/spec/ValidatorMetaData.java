/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.metadata.web.spec;

import org.jboss.metadata.javaee.spec.ParamValueMetaData;
import org.jboss.metadata.javaee.support.IdMetaDataImplWithDescriptions;

import java.util.List;

/**
 * The tag/validator metadata
 *
 * @author Remy Maucherat
 * @version $Revision: 81768 $
 */
public class ValidatorMetaData extends IdMetaDataImplWithDescriptions {
    private static final long serialVersionUID = 1;

    private String validatorClass;
    private List<ParamValueMetaData> initParams;

    public String getValidatorClass() {
        return validatorClass;
    }

    public void setValidatorClass(String validatorClass) {
        this.validatorClass = validatorClass;
    }

    public List<ParamValueMetaData> getInitParams() {
        return initParams;
    }

    public void setInitParams(List<ParamValueMetaData> initParams) {
        this.initParams = initParams;
    }

}
