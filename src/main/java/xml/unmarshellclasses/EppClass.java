package xml.unmarshellclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "epp")
@XmlAccessorType(XmlAccessType.NONE)
public class EppClass {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "response")
    private EppResponse response;

    public EppResponse getResponse() {
        return response;
    }

    public void setResponse(EppResponse response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "EppClass{" +
                "response=" + response +
                '}';
    }
}
