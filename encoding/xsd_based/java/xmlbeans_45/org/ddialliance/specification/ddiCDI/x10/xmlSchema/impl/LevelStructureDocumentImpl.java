/*
 * An XML document type.
 * Localname: LevelStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one LevelStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class LevelStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructureDocument {
    private static final long serialVersionUID = 1L;

    public LevelStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "LevelStructure"),
    };


    /**
     * Gets the "LevelStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure getLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "LevelStructure" element
     */
    @Override
    public void setLevelStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure levelStructure) {
        generatedSetterHelperImpl(levelStructure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LevelStructure" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure addNewLevelStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.LevelStructure)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
