package xml.unmarshellclasses;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.NONE)
public class EppResult {

    @XmlAttribute
    private int code;

    @XmlElement(name = "msg")
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "EppResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
