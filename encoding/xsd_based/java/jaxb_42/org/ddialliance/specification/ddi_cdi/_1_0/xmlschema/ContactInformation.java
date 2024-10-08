//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.ddialliance.specification.ddi_cdi._1_0.xmlschema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Definition
 *             ============
 *             Contact information for the individual or organization including location specification, address, web site, phone numbers, and other means of communication access. Address, location, telephone, and other means of communication can be repeated to express multiple means of a single type or change over time. Each major piece of contact information contains the element effectiveDates in order to date stamp the period for which the information is valid.
 * 
 * <p>Java class for ContactInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContactInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="address" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="email" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Email" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="emessaging" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}ElectronicMessageSystem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="telephone" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}Telephone" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="website" type="{http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/}WebLink" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformation", propOrder = {
    "address",
    "email",
    "emessaging",
    "telephone",
    "website"
})
public class ContactInformation {

    protected List<Address> address;
    protected List<Email> email;
    protected List<ElectronicMessageSystem> emessaging;
    protected List<Telephone> telephone;
    protected List<WebLink> website;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     * @return
     *     The value of the address property.
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<>();
        }
        return this.address;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     * @return
     *     The value of the email property.
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<>();
        }
        return this.email;
    }

    /**
     * Gets the value of the emessaging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the emessaging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmessaging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicMessageSystem }
     * 
     * 
     * @return
     *     The value of the emessaging property.
     */
    public List<ElectronicMessageSystem> getEmessaging() {
        if (emessaging == null) {
            emessaging = new ArrayList<>();
        }
        return this.emessaging;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telephone }
     * 
     * 
     * @return
     *     The value of the telephone property.
     */
    public List<Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the website property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the website property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebsite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebLink }
     * 
     * 
     * @return
     *     The value of the website property.
     */
    public List<WebLink> getWebsite() {
        if (website == null) {
            website = new ArrayList<>();
        }
        return this.website;
    }

}
