//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.02 at 01:32:51 PM IDT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RolePermissionsMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RolePermissionsMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}roleRef"/>
 *         &lt;element ref="{}portalPermissions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePermissionsMap", propOrder = {
    "roleRef",
    "portalPermissions"
})
public class RolePermissionsMap {

    @XmlElement(required = true)
    protected RoleRef roleRef;
    @XmlElement(required = true)
    protected PortalPermissions portalPermissions;

    /**
     * Gets the value of the roleRef property.
     * 
     * @return
     *     possible object is
     *     {@link RoleRef }
     *     
     */
    public RoleRef getRoleRef() {
        return roleRef;
    }

    /**
     * Sets the value of the roleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleRef }
     *     
     */
    public void setRoleRef(RoleRef value) {
        this.roleRef = value;
    }

    /**
     * Gets the value of the portalPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link PortalPermissions }
     *     
     */
    public PortalPermissions getPortalPermissions() {
        return portalPermissions;
    }

    /**
     * Sets the value of the portalPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalPermissions }
     *     
     */
    public void setPortalPermissions(PortalPermissions value) {
        this.portalPermissions = value;
    }

}
