/*
 * An XML document type.
 * Localname: ClassificationSeriesStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ClassificationSeriesStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ClassificationSeriesStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructureDocument {
    private static final long serialVersionUID = 1L;

    public ClassificationSeriesStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationSeriesStructure"),
    };


    /**
     * Gets the "ClassificationSeriesStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure getClassificationSeriesStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ClassificationSeriesStructure" element
     */
    @Override
    public void setClassificationSeriesStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure classificationSeriesStructure) {
        generatedSetterHelperImpl(classificationSeriesStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ClassificationSeriesStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure addNewClassificationSeriesStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
