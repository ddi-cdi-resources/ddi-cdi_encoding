/*
 * An XML document type.
 * Localname: StatisticalClassificationRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one StatisticalClassificationRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class StatisticalClassificationRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationshipDocument {
    private static final long serialVersionUID = 1L;

    public StatisticalClassificationRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "StatisticalClassificationRelationship"),
    };


    /**
     * Gets the "StatisticalClassificationRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship getStatisticalClassificationRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "StatisticalClassificationRelationship" element
     */
    @Override
    public void setStatisticalClassificationRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship statisticalClassificationRelationship) {
        generatedSetterHelperImpl(statisticalClassificationRelationship, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StatisticalClassificationRelationship" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship addNewStatisticalClassificationRelationship() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticalClassificationRelationship)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
