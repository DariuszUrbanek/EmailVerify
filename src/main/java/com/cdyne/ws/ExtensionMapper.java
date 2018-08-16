/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package com.cdyne.ws;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static Object getTypeObject(
        String namespaceURI, String typeName,
        javax.xml.stream.XMLStreamReader reader) throws Exception {
        if ("http://ws.cdyne.com/".equals(namespaceURI) &&
                "ReturnIndicator".equals(typeName)) {
            return com.cdyne.ws.ReturnIndicator.Factory.parse(reader);
        }

        if ("http://ws.cdyne.com/".equals(namespaceURI) &&
                "ArrayOfAnyType".equals(typeName)) {
            return ArrayOfAnyType.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
