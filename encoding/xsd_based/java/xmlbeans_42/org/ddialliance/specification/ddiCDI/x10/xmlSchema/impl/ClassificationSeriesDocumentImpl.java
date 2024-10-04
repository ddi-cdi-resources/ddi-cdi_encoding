/*
 * An XML document type.
 * Localname: ClassificationSeries
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ClassificationSeries(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ClassificationSeriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeriesDocument {
    private static final long serialVersionUID = 1L;

    public ClassificationSeriesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ClassificationSeries"),
    };


    /**
     * Gets the "ClassificationSeries" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries getClassificationSeries() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ClassificationSeries" element
     */
    @Override
    public void setClassificationSeries(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries classificationSeries) {
        generatedSetterHelperImpl(classificationSeries, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ClassificationSeries" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries addNewClassificationSeries() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ClassificationSeries)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
