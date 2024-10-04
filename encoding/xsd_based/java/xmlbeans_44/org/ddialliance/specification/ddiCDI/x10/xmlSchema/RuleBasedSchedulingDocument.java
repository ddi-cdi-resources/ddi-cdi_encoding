/*
 * An XML document type.
 * Localname: RuleBasedScheduling
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedSchedulingDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one RuleBasedScheduling(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface RuleBasedSchedulingDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedSchedulingDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "rulebasedschedulingcfa7doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RuleBasedScheduling" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling getRuleBasedScheduling();

    /**
     * Sets the "RuleBasedScheduling" element
     */
    void setRuleBasedScheduling(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling ruleBasedScheduling);

    /**
     * Appends and returns a new empty "RuleBasedScheduling" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleBasedScheduling addNewRuleBasedScheduling();
}
