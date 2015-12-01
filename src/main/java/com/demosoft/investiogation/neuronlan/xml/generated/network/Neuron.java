//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.01 at 04:33:26 PM EET 
//


package com.demosoft.investiogation.neuronlan.xml.generated.network;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Neuron complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Neuron">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outgoingLinks" type="{urn:neuronNetwork}Link" minOccurs="0"/>
 *         &lt;element name="initPower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="processor" type="{urn:neuronNetwork}Processor"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Neuron", propOrder = {
        "outgoingLinks",
        "initPower",
        "processor"
})
public class Neuron {

    protected Link outgoingLinks;
    protected Double initPower;
    @XmlElement(required = true)
    protected Processor processor;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Gets the value of the outgoingLinks property.
     *
     * @return possible object is
     * {@link Link }
     */
    public Link getOutgoingLinks() {
        return outgoingLinks;
    }

    /**
     * Sets the value of the outgoingLinks property.
     *
     * @param value allowed object is
     *              {@link Link }
     */
    public void setOutgoingLinks(Link value) {
        this.outgoingLinks = value;
    }

    /**
     * Gets the value of the initPower property.
     *
     * @return possible object is
     * {@link Double }
     */
    public Double getInitPower() {
        return initPower;
    }

    /**
     * Sets the value of the initPower property.
     *
     * @param value allowed object is
     *              {@link Double }
     */
    public void setInitPower(Double value) {
        this.initPower = value;
    }

    /**
     * Gets the value of the processor property.
     *
     * @return possible object is
     * {@link Processor }
     */
    public Processor getProcessor() {
        return processor;
    }

    /**
     * Sets the value of the processor property.
     *
     * @param value allowed object is
     *              {@link Processor }
     */
    public void setProcessor(Processor value) {
        this.processor = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    @Override
    public String toString() {
        return "Neuron{" +
                "outgoingLinks=" + outgoingLinks +
                ", initPower=" + initPower +
                ", processor=" + processor +
                ", id='" + id + '\'' +
                '}';
    }
}