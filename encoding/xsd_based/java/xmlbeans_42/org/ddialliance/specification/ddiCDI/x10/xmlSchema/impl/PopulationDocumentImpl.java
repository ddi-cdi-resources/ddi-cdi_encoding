/*
 * An XML document type.
 * Localname: Population
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PopulationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Population(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class PopulationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PopulationDocument {
    private static final long serialVersionUID = 1L;

    public PopulationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Population"),
    };


    /**
     * Gets the "Population" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population getPopulation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Population" element
     */
    @Override
    public void setPopulation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population population) {
        generatedSetterHelperImpl(population, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Population" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population addNewPopulation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Population)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
