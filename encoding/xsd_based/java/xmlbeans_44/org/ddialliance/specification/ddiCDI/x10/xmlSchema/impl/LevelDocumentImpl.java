/*
 * An XML document type.
 * Localname: Level
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Level(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LevelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelDocument {
    private static final long serialVersionUID = 1L;

    public LevelDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Level"),
    };


    /**
     * Gets the "Level" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level getLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Level" element
     */
    @Override
    public void setLevel(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level level) {
        generatedSetterHelperImpl(level, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Level" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level addNewLevel() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Level)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
