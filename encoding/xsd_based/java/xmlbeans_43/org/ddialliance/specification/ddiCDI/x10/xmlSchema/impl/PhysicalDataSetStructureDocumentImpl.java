/*
 * An XML document type.
 * Localname: PhysicalDataSetStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one PhysicalDataSetStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class PhysicalDataSetStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructureDocument {
    private static final long serialVersionUID = 1L;

    public PhysicalDataSetStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalDataSetStructure"),
    };


    /**
     * Gets the "PhysicalDataSetStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure getPhysicalDataSetStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PhysicalDataSetStructure" element
     */
    @Override
    public void setPhysicalDataSetStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure physicalDataSetStructure) {
        generatedSetterHelperImpl(physicalDataSetStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PhysicalDataSetStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure addNewPhysicalDataSetStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
