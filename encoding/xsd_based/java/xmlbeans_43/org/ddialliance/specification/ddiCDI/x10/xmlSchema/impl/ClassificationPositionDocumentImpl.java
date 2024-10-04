/*
 * An XML document type.
 * Localname: ClassificationPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ClassificationPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ClassificationPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPositionDocument {
    private static final long serialVersionUID = 1L;

    public ClassificationPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationPosition"),
    };


    /**
     * Gets the "ClassificationPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition getClassificationPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ClassificationPosition" element
     */
    @Override
    public void setClassificationPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition classificationPosition) {
        generatedSetterHelperImpl(classificationPosition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ClassificationPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition addNewClassificationPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationPosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
