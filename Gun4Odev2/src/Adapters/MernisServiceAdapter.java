package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisWebService.DKBKPSPublicSoap;
import MernisWebService.DKBKPSPublicSoap12;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        //intellij idea için web service client de sorun yaşandı
        DKBKPSPublicSoap12 publicSoap = new DKBKPSPublicSoap12();
        boolean returned  = publicSoap.TCKimlikNoDogrula(36799335016L,customer.getFirstName(),customer.getLastName(),1997);

        return returned;
    }
}
