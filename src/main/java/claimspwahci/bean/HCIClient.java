package claimspwahci.bean;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import claimspwahci.generated.Dspart;
import claimspwahci.generated.Dspartprice;
import claimspwahci.generated.Entry;
import claimspwahci.generated.EntryInput;
import claimspwahci.generated.ObjectFactory;

public class HCIClient extends WebServiceGatewaySupport {
	public Dspartprice getPartPrice(List<String> partNumber, String dealerNumber, String roDate) {
		Entry getEntry = new Entry();

		EntryInput entryInput = new EntryInput();
		Dspart dspart = new Dspart();
		dspart.setPARTNO(partNumber.get(0));
		entryInput.setIDEALERCODE(dealerNumber);
		entryInput.setIRODATE(new BigDecimal(roDate));

		// entryInput.getIPARTLIST().add((Dspart) partNumber);

		getEntry.setArg0(entryInput);
		System.out.println("Request::" + getEntry.toString());

//		return (Dspartprice) getWebServiceTemplate().marshalSendAndReceive(getEntry);
		JAXBElement<Entry> jAXBElement = new ObjectFactory().createEntry(getEntry);
		System.out.println("Response of jAXBElement :: "+jAXBElement);
		//jaxbObjectToXML(getEntry);
		Dspartprice response = (Dspartprice) getWebServiceTemplate().marshalSendAndReceive(
				"http://209.203.79.46:10033/web/services/WWR450Service/WWR450", jAXBElement,
				new SoapActionCallback("http://wwr450.wsbeans.iseries/"));

		return response;

	}

	private static void jaxbObjectToXML(Entry entry) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Entry.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// To format XML
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// If we DO NOT have JAXB annotated class
			JAXBElement<Entry> jaxbElement = new JAXBElement<Entry>(new QName("", "getEntry"), Entry.class, entry);
			System.out.println("jaxbMarshaller.marshal");
			jaxbMarshaller.marshal(jaxbElement, System.out);
			System.out.println("after jaxbMarshaller.marshal");

			// If we have JAXB annotated class
			// jaxbMarshaller.marshal(employeeObj, System.out);

		} catch (JAXBException e) {
			System.out.println("Error occured" + e.getMessage());
			e.printStackTrace();
		}
	}
}