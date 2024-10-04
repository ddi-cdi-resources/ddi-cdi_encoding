/*
 * An XML document type.
 * Localname: DimensionalKeyDefinitionMember
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DimensionalKeyDefinitionMember(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class DimensionalKeyDefinitionMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMemberDocument {
    private static final long serialVersionUID = 1L;

    public DimensionalKeyDefinitionMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "DimensionalKeyDefinitionMember"),
    };


    /**
     * Gets the "DimensionalKeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember getDimensionalKeyDefinitionMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DimensionalKeyDefinitionMember" element
     */
    @Override
    public void setDimensionalKeyDefinitionMember(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember dimensionalKeyDefinitionMember) {
        generatedSetterHelperImpl(dimensionalKeyDefinitionMember, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DimensionalKeyDefinitionMember" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember addNewDimensionalKeyDefinitionMember() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalKeyDefinitionMember)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
