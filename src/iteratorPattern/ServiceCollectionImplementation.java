package iteratorPattern;

import java.util.ArrayList;
import java.util.List;
/*Author      : Iheb Jendoubi 
 * University : MedTech-SMU
 * Data : 16/12/2020
 * Course : Software Analaysis and Design CS422
 */


public class ServiceCollectionImplementation implements ServiceCollection{
	private List<Service> services;
	public  ServiceCollectionImplementation() {
		services=new ArrayList<>();
	}

	@Override
	public void addService(Service s) {
		this.services.add(s);
		
	}

	@Override
	public void removeService(Service s) {
		this.services.remove(s);
		
	}

	@Override
	public ServiceIterator iterator(ServiceTypeEnum type) {
		return new ServiceIteratorImplementation(type, this.services);
	}
	}
	class ServiceIteratorImplementation implements ServiceIterator {

		private ServiceTypeEnum type;
		private List<Service> services;
		private int position;

		public ServiceIteratorImplementation(ServiceTypeEnum ty,
				List<Service> serviceList) {
			this.type = ty;
			this.services = serviceList;
		}

		@Override
		public boolean hasNext() {
			while (position < services.size()) {
				Service s = services.get(position);
				if (s.getType().equals(type) || type.equals(ServiceTypeEnum.ALL)) {
					return true;
				} else
					position++;
			}
			return false;
		}

		@Override
		public Service next() {
			Service s = services.get(position);
			position++;
			return s;
		}


}
