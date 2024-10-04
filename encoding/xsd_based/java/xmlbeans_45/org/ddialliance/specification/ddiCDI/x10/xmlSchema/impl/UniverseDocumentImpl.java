/*
 * An XML document type.
 * Localname: Universe
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.UniverseDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Universe(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class UniverseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.UniverseDocument {
    private static final long serialVersionUID = 1L;

    public UniverseDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Universe"),
    };


    /**
     * Gets the "Universe" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe getUniverse() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Universe" element
     */
    @Override
    public void setUniverse(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe universe) {
        generatedSetterHelperImpl(universe, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Universe" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe addNewUniverse() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Universe)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
