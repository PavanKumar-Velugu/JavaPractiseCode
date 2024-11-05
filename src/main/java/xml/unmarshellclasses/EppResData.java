package xml.unmarshellclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "resData")
@XmlAccessorType(XmlAccessType.NONE)
public class EppResData {

    @XmlElement(name = "creData")
    private EppCreData creData;

    public EppCreData getCreData() {
        return creData;
    }

    public void setCreData(EppCreData creData) {
        this.creData = creData;
    }

    @Override
    public String toString() {
        return "EppResData{" +
                "creData=" + creData +
                '}';
    }
}
