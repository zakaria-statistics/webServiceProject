package ma.enset.serialisationDeserialisation;

import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebService
public class AppSerialisation {
    public static void main(String[] args) throws ParseException, JAXBException {
        Operations operations = new Operations(new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"),new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"));
        operations.getOperation().add(new Operation(TypeEnum.CREDIT,new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"),3454.45,"Virement"));
        operations.getOperation().add(new Operation(TypeEnum.DEBIT,new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"),4342.45,"Virement"));
        ReleveService releve = new ReleveService("23458675",new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"),1200.89,operations);

        //serialisation output console
        //System.out.println(releve.toString());


        //serialization output file
        JAXBContext jaxbContext = JAXBContext.newInstance(ReleveService.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve, new File("releve.xml"));

    }
}


