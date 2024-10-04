/*
 * XML Type:  UnitType
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML UnitType(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface UnitType extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.Concept {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.UnitType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "unittype7cbctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "descriptiveText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString getDescriptiveText();

    /**
     * True if has "descriptiveText" element
     */
    boolean isSetDescriptiveText();

    /**
     * Sets the "descriptiveText" element
     */
    void setDescriptiveText(org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString descriptiveText);

    /**
     * Appends and returns a new empty "descriptiveText" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.InternationalString addNewDescriptiveText();

    /**
     * Unsets the "descriptiveText" element
     */
    void unsetDescriptiveText();
}
