/*
 * An XML document type.
 * Localname: Statistic
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Statistic(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface StatisticDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.StatisticDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "statistic4d2cdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Statistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic getStatistic();

    /**
     * Sets the "Statistic" element
     */
    void setStatistic(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic statistic);

    /**
     * Appends and returns a new empty "Statistic" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.Statistic addNewStatistic();
}
