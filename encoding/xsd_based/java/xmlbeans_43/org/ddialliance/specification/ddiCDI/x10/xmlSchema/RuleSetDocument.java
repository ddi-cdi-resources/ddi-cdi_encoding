/*
 * An XML document type.
 * Localname: RuleSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one RuleSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface RuleSetDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSetDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "ruleset6062doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "RuleSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet getRuleSet();

    /**
     * Sets the "RuleSet" element
     */
    void setRuleSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet ruleSet);

    /**
     * Appends and returns a new empty "RuleSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.RuleSet addNewRuleSet();
}
