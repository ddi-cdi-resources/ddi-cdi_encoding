/*
 * XML Type:  TimeRole
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TimeRole(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface TimeRole extends org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpecializationRole {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.TimeRole> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "timerole3d41type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "time" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getTime();

    /**
     * True if has "time" element
     */
    boolean isSetTime();

    /**
     * Sets the "time" element
     */
    void setTime(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry time);

    /**
     * Appends and returns a new empty "time" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewTime();

    /**
     * Unsets the "time" element
     */
    void unsetTime();
}
