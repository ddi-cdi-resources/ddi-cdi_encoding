/*
 * An XML document type.
 * Localname: CombinedDate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one CombinedDate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class CombinedDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDateDocument {
    private static final long serialVersionUID = 1L;

    public CombinedDateDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "CombinedDate"),
    };


    /**
     * Gets the "CombinedDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate getCombinedDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "CombinedDate" element
     */
    @Override
    public void setCombinedDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate combinedDate) {
        generatedSetterHelperImpl(combinedDate, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CombinedDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate addNewCombinedDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.CombinedDate)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
