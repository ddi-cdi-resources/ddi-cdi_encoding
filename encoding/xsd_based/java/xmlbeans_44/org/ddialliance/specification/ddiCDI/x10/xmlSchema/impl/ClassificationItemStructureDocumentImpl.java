/*
 * An XML document type.
 * Localname: ClassificationItemStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ClassificationItemStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ClassificationItemStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructureDocument {
    private static final long serialVersionUID = 1L;

    public ClassificationItemStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationItemStructure"),
    };


    /**
     * Gets the "ClassificationItemStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure getClassificationItemStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ClassificationItemStructure" element
     */
    @Override
    public void setClassificationItemStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure classificationItemStructure) {
        generatedSetterHelperImpl(classificationItemStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ClassificationItemStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure addNewClassificationItemStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationItemStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
