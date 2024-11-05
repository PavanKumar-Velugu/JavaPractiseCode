package xml.mainxml;

import xml.unmarshellclasses.EppClass;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class DomagateXML {
    public static void main(String[] args) {
        System.out.println("Domgate XML parse....");
        String xmlResponse = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "\n" +
                "<epp xmlns=\"urn:ietf:params:xml:ns:epp-1.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:ietf:params:xml:ns:epp-1.0 epp-1.0.xsd\">\n" +
                "    <response>\n" +
                "        <result code=\"1001\">\n" +
                "            <msg>Command completed successfully; action pending</msg>\n" +
                "        </result>\n" +
                "        <resData>\n" +
                "            <domain:creData xmlns:domain=\"urn:ietf:params:xml:ns:domain-1.0\" xsi:schemaLocation=\"urn:ietf:params:xml:ns:domain-1.0 domain-1.0.xsd\">\n" +
                "                <domain:name>rootiyouth12.id</domain:name>\n" +
                "                <domain:crDate>2024-10-16T10:20:35+00:00</domain:crDate>\n" +
                "                <domain:exDate>2025-10-16T00:00:00+00:00</domain:exDate>\n" +
                "            </domain:creData>\n" +
                "        </resData>\n" +
                "        <trID>\n" +
                "            <clTRID>123</clTRID>\n" +
                "            <svTRID>2024101610203303514</svTRID>\n" +
                "        </trID>\n" +
                "    </response>\n" +
                "</epp>";

        xmlResponse = xmlResponse.replace("domain:","");
        xmlResponse = xmlResponse.replace("xmlns:domain=\"urn:ietf:params:xml:ns:domain-1.0\"","");
        xmlResponse = xmlResponse.replace("xmlns=\"urn:ietf:params:xml:ns:epp-1.0\"","");
        xmlResponse = xmlResponse.replace("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"","");
        xmlResponse = xmlResponse.replace("xsi:schemaLocation=\"urn:ietf:params:xml:ns:epp-1.0 epp-1.0.xsd\"","");
        xmlResponse = xmlResponse.replace("xsi:schemaLocation=\"urn:ietf:params:xml:ns:domain-1.0 domain-1.0.xsd\"","");

        System.out.println("xmlResponse: "+xmlResponse);

        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(EppClass.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            EppClass cEppClass = (EppClass) unmarshaller.unmarshal(new StringReader(xmlResponse));
            System.out.println("Response: "+cEppClass.toString());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }
}
