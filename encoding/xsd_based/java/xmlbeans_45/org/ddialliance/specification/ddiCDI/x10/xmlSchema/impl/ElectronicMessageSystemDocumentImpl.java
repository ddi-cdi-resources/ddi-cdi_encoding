/*
 * An XML document type.
 * Localname: ElectronicMessageSystem
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystemDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ElectronicMessageSystem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ElectronicMessageSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystemDocument {
    private static final long serialVersionUID = 1L;

    public ElectronicMessageSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ElectronicMessageSystem"),
    };


    /**
     * Gets the "ElectronicMessageSystem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem getElectronicMessageSystem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ElectronicMessageSystem" element
     */
    @Override
    public void setElectronicMessageSystem(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem electronicMessageSystem) {
        generatedSetterHelperImpl(electronicMessageSystem, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ElectronicMessageSystem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem addNewElectronicMessageSystem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ElectronicMessageSystem)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
