/*
 * An XML document type.
 * Localname: ConceptSystemCorrespondence
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ConceptSystemCorrespondence(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ConceptSystemCorrespondenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondenceDocument {
    private static final long serialVersionUID = 1L;

    public ConceptSystemCorrespondenceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ConceptSystemCorrespondence"),
    };


    /**
     * Gets the "ConceptSystemCorrespondence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence getConceptSystemCorrespondence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ConceptSystemCorrespondence" element
     */
    @Override
    public void setConceptSystemCorrespondence(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence conceptSystemCorrespondence) {
        generatedSetterHelperImpl(conceptSystemCorrespondence, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConceptSystemCorrespondence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence addNewConceptSystemCorrespondence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ConceptSystemCorrespondence)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
