package factory;
import object.DocumentObject;
import object.IObject;
import object.UserObject;

public class ObjectFactory {

	public IObject getinstance (String nrobject) {
		switch(nrobject) {
			case "Document":
				return new DocumentObject();
			default:
				return new UserObject();
		}
		
	} 

}
