/*
 * XML Type:  NonIsoDate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML NonIsoDate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface NonIsoDate extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "nonisodate25e4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "calendar" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getCalendar();

    /**
     * True if has "calendar" element
     */
    boolean isSetCalendar();

    /**
     * Sets the "calendar" element
     */
    void setCalendar(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry calendar);

    /**
     * Appends and returns a new empty "calendar" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewCalendar();

    /**
     * Unsets the "calendar" element
     */
    void unsetCalendar();

    /**
     * Gets the "dateContent" element
     */
    java.lang.String getDateContent();

    /**
     * Gets (as xml) the "dateContent" element
     */
    org.apache.xmlbeans.XmlString xgetDateContent();

    /**
     * Sets the "dateContent" element
     */
    void setDateContent(java.lang.String dateContent);

    /**
     * Sets (as xml) the "dateContent" element
     */
    void xsetDateContent(org.apache.xmlbeans.XmlString dateContent);

    /**
     * Gets the "nonIsoDateFormat" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry getNonIsoDateFormat();

    /**
     * True if has "nonIsoDateFormat" element
     */
    boolean isSetNonIsoDateFormat();

    /**
     * Sets the "nonIsoDateFormat" element
     */
    void setNonIsoDateFormat(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry nonIsoDateFormat);

    /**
     * Appends and returns a new empty "nonIsoDateFormat" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.ControlledVocabularyEntry addNewNonIsoDateFormat();

    /**
     * Unsets the "nonIsoDateFormat" element
     */
    void unsetNonIsoDateFormat();
}
