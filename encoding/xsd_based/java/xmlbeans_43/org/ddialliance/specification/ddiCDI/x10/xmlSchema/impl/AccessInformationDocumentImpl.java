/*
 * An XML document type.
 * Localname: AccessInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AccessInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AccessInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformationDocument {
    private static final long serialVersionUID = 1L;

    public AccessInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "AccessInformation"),
    };


    /**
     * Gets the "AccessInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation getAccessInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AccessInformation" element
     */
    @Override
    public void setAccessInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation accessInformation) {
        generatedSetterHelperImpl(accessInformation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AccessInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation addNewAccessInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.AccessInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
