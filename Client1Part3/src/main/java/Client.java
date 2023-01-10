
import proxy.JAXBException_Exception;
import proxy.ReleveService;
import proxy.ReleveWebService;
import proxy.ReleveWebService_Service;


public class Client {
    public static void main(String[] args) throws JAXBException_Exception {
        /*
        Releve stub = new ReleveWS_Service().getReleveWSPort();
        Releve rel1 = stub.getReleve();
        System.out.println(rel1.getRib());
        System.out.println(rel1.getDateReleve());
        System.out.println(rel1.getSolde());
        System.out.println(rel1.getOperations().getOperation().get(0).getMontant());
        */

        ReleveWebService stub = new ReleveWebService_Service().getReleveWebServicePort();
        ReleveService releveService = stub.getReleveService();
        System.out.println(releveService.getSolde());


    }
}
