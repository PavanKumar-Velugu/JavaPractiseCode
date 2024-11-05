package xml.unmarshellclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "trID")
@XmlAccessorType(XmlAccessType.NONE)
public class EppTrId {

    @XmlElement(name = "clTRID")
    private String clTRID;

    @XmlElement(name = "svTRID")
    private String svTRID;

    public String getClTRID() {
        return clTRID;
    }

    public void setClTRID(String clTRID) {
        this.clTRID = clTRID;
    }

    public String getSvTRID() {
        return svTRID;
    }

    public void setSvTRID(String svTRID) {
        this.svTRID = svTRID;
    }

    @Override
    public String toString() {
        return "EppTrId{" +
                "clTRID='" + clTRID + '\'' +
                ", svTRID='" + svTRID + '\'' +
                '}';
    }
}
