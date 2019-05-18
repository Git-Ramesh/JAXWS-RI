
package com.rs.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.rs.service.Book;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rs.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchBookOut_QNAME = new QName("http://model.rs.com", "SearchBookOut");
    private final static QName _RegisterBookOut_QNAME = new QName("http://model.rs.com", "RegisterBookOut");
    private final static QName _RegisterBookIn_QNAME = new QName("http://model.rs.com", "RegisterBookIn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rs.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rs.com", name = "SearchBookOut")
    public JAXBElement<Book> createSearchBookOut(Book value) {
        return new JAXBElement<Book>(_SearchBookOut_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rs.com", name = "RegisterBookOut")
    public JAXBElement<Book> createRegisterBookOut(Book value) {
        return new JAXBElement<Book>(_RegisterBookOut_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rs.com", name = "RegisterBookIn")
    public JAXBElement<Book> createRegisterBookIn(Book value) {
        return new JAXBElement<Book>(_RegisterBookIn_QNAME, Book.class, null, value);
    }

}
