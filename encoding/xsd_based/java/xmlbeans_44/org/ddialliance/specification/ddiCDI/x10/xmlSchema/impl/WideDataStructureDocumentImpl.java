/*
 * An XML document type.
 * Localname: WideDataStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one WideDataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class WideDataStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructureDocument {
    private static final long serialVersionUID = 1L;

    public WideDataStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "WideDataStructure"),
    };


    /**
     * Gets the "WideDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure getWideDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "WideDataStructure" element
     */
    @Override
    public void setWideDataStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure wideDataStructure) {
        generatedSetterHelperImpl(wideDataStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "WideDataStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure addNewWideDataStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.WideDataStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
