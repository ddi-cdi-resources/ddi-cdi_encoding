/*
 * An XML document type.
 * Localname: LongDataStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LongDataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LongDataStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructureDocument {
    private static final long serialVersionUID = 1L;

    public LongDataStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LongDataStructure"),
    };


    /**
     * Gets the "LongDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure getLongDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LongDataStructure" element
     */
    @Override
    public void setLongDataStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure longDataStructure) {
        generatedSetterHelperImpl(longDataStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LongDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure addNewLongDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LongDataStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
