package ma.enset.serialisationDeserialisation;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
    @XmlAttribute
    private TypeEnum type;
    @XmlAttribute
    private Date date;
    @XmlAttribute
    private double montant;
    @XmlAttribute
    private String description;

    public Operation() {
    }

    public Operation(TypeEnum type, Date date, double montant, String description) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type='" + type + '\'' +
                ", date=" + date +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                '}';
    }
}
