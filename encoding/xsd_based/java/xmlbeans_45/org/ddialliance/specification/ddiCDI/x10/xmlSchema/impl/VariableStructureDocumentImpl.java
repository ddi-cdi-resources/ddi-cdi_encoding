/*
 * An XML document type.
 * Localname: VariableStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one VariableStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class VariableStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructureDocument {
    private static final long serialVersionUID = 1L;

    public VariableStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "VariableStructure"),
    };


    /**
     * Gets the "VariableStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure getVariableStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "VariableStructure" element
     */
    @Override
    public void setVariableStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure variableStructure) {
        generatedSetterHelperImpl(variableStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "VariableStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure addNewVariableStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
