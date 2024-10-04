/*
 * An XML document type.
 * Localname: AccessLocation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AccessLocation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AccessLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocationDocument {
    private static final long serialVersionUID = 1L;

    public AccessLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AccessLocation"),
    };


    /**
     * Gets the "AccessLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation getAccessLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AccessLocation" element
     */
    @Override
    public void setAccessLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation accessLocation) {
        generatedSetterHelperImpl(accessLocation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AccessLocation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation addNewAccessLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessLocation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
