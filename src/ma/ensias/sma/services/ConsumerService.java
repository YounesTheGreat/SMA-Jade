package ma.ensias.sma.services;

import ma.ensias.sma.beans.Product;

public interface ConsumerService {

	/** D�terminer Quantit� � acheter en utilisant une fonction
	 * de planification de la demande */
	int calculateQuantityToBuy();

	/** fonction de planification de la demande */
	int demandPlanification(Product product, double budget);
}
