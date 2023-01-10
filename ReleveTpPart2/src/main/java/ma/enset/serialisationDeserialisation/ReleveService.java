package ma.enset.serialisationDeserialisation;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReleveService {
    @XmlAttribute
    private String RIB;
    @XmlElement
    private double solde;
    @XmlElement
    private Date dateReleve;
    @XmlElement
    public Operations operations;

    public ReleveService() {
    }

    public ReleveService(String RIB, Date dateReleve, double solde, Operations operations) {
        this.RIB = RIB;
        solde = solde;
        this.dateReleve = dateReleve;
        this.operations = operations;
    }

    public String getRIB() {
        return RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        solde = solde;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Releve{" +
                "RIB='" + RIB + "\n" +
                ", dateReleve=" + dateReleve+ "\n"  +
                ", solde=" + solde+ "\n"  +
                ", operations=" + operations +
                '}';
    }
}
