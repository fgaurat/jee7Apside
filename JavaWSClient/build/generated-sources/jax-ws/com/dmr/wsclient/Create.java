
package com.dmr.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour create complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="create">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity" type="{http://ws.helloworld.dmr.com/}projects" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "create", propOrder = {
    "entity"
})
public class Create {

    protected Projects entity;

    /**
     * Obtient la valeur de la propriété entity.
     * 
     * @return
     *     possible object is
     *     {@link Projects }
     *     
     */
    public Projects getEntity() {
        return entity;
    }

    /**
     * Définit la valeur de la propriété entity.
     * 
     * @param value
     *     allowed object is
     *     {@link Projects }
     *     
     */
    public void setEntity(Projects value) {
        this.entity = value;
    }

}
