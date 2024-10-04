/*
 * An XML document type.
 * Localname: ConceptSystem
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ConceptSystem(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ConceptSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemDocument {
    private static final long serialVersionUID = 1L;

    public ConceptSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptSystem"),
    };


    /**
     * Gets the "ConceptSystem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem getConceptSystem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ConceptSystem" element
     */
    @Override
    public void setConceptSystem(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem conceptSystem) {
        generatedSetterHelperImpl(conceptSystem, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptSystem" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem addNewConceptSystem() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystem)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
