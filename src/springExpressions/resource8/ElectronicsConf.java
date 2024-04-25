package springExpressions.resource8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springExpressions.beans8.ElectronicsItems;
import springExpressions.beans8.ElectronicsPrice;
@Configuration
public class ElectronicsConf {
	
	@Bean
	public ElectronicsPrice getPriceDetail() {
		ElectronicsPrice ePrice=new ElectronicsPrice();
		ePrice.setItemId("390");
		ePrice.setPriceAfterGst(1999.23f);
		ePrice.setPriceBeforeGst(18901.56f);
		return ePrice;
	}
	
	@Bean(name="eitem")
	public ElectronicsItems getItemsDetail(@Value("#{getPriceDetail.itemId}") String itemid) {
		/*if you want set value via spring expressing you cant directly use expression in setMethod you need to give spring 
		  expression in @value() and need to store in any variable and then need to pass those variable in setMethodvalue */
		ElectronicsItems etElectronicsItems=new ElectronicsItems();
		etElectronicsItems.setePrice(getPriceDetail());
		etElectronicsItems.setItemId(itemid);
		etElectronicsItems.setName("Mixer");
		etElectronicsItems.setSize("10*4");
		return etElectronicsItems;
	}
	



}
