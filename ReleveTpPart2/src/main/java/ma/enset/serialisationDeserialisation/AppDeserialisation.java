package ma.enset.serialisationDeserialisation;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.List;

public class AppDeserialisation {
        public static void main(String[] args) throws JAXBException {
            //Deserialization
            JAXBContext jaxbContext = JAXBContext.newInstance(ReleveService.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            ReleveService releve = (ReleveService) unmarshaller.unmarshal(new File("releve.xml"));
            List<Operation> operationList = releve.getOperations().getOperation();

            /*for (Operation operation:operationList){
                System.out.println("---------------------");
                System.out.println("Type: "+operation.getType());
                System.out.println("Date: "+operation.getDate());
                System.out.println("Montant: "+operation.getMontant());
                System.out.println("Description: "+operation.getDescription());

            }*/

            System.out.println(operationList.toString());

        }
}

