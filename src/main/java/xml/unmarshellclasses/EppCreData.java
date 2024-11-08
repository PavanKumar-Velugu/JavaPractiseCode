package xml.unmarshellclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "creData")
@XmlAccessorType(XmlAccessType.NONE)
public class EppCreData {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "crDate")
    private String crDate;

    @XmlElement(name = "exDate")
    private String exDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EppCreData{" +
                "name='" + name + '\'' +
                ", crDate='" + crDate + '\'' +
                ", exDate='" + exDate + '\'' +
                '}';
    }
}
