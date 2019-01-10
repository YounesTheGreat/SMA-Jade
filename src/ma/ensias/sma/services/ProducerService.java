package ma.ensias.sma.services;

import ma.ensias.sma.beans.Product;

public interface ProducerService {
	
	/** Cr�er un agent consommateur */
	void createConsumerAgent();
	
	/** Envoi d�tails du Produit aux Consommateurs */
	void advertise(Product product);
	
	/** Quantit� totale vendue */
	int  getTotalQuantitySold();
	
	/** Calcul du B�n�fice */
	double calculateAmountOfProfit(Product product, int quantity);

	/** # of Consumer Agents */
	int getNumberOfConsumers();
}
