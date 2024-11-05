package xml.unmarshellclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.NONE)
public class EppResponse {

    @XmlElement(name = "result")
    private EppResult result;

    @XmlElement(name = "resData")
    private EppResData resData;

    @XmlElement(name = "trID")
    private EppTrId trId;

    public EppResult getResult() {
        return result;
    }

    public void setResult(EppResult result) {
        this.result = result;
    }

    public EppTrId getTrId() {
        return trId;
    }

    public void setTrId(EppTrId trId) {
        this.trId = trId;
    }

    public EppResData getResData() {
        return resData;
    }

    public void setResData(EppResData resData) {
        this.resData = resData;
    }

    @Override
    public String toString() {
        return "EppResponse{" +
                "result=" + result +
                ", resData=" + resData +
                ", trId=" + trId +
                '}';
    }
}
