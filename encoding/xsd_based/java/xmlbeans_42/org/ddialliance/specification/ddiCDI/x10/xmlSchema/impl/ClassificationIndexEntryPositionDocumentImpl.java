/*
 * An XML document type.
 * Localname: ClassificationIndexEntryPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ClassificationIndexEntryPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ClassificationIndexEntryPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPositionDocument {
    private static final long serialVersionUID = 1L;

    public ClassificationIndexEntryPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationIndexEntryPosition"),
    };


    /**
     * Gets the "ClassificationIndexEntryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition getClassificationIndexEntryPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ClassificationIndexEntryPosition" element
     */
    @Override
    public void setClassificationIndexEntryPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition classificationIndexEntryPosition) {
        generatedSetterHelperImpl(classificationIndexEntryPosition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ClassificationIndexEntryPosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition addNewClassificationIndexEntryPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationIndexEntryPosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
