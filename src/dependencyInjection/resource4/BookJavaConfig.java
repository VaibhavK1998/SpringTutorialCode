package dependencyInjection.resource4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dependencyInjection.deepBeans.BookHelperClass;
import dependencyInjection.deepBeans.Book_DInByJavaConfig;

@Configuration
public class BookJavaConfig {

	@Bean
	public BookHelperClass getShopData() {
		BookHelperClass bt1=new BookHelperClass();
		bt1.setShopKeeperName("Arun");
		bt1.setShopName("Arijit BookeStore");
		return bt1;
	}
	@Bean("bookData")
	public Book_DInByJavaConfig getBookData() {
		Book_DInByJavaConfig bt2=new Book_DInByJavaConfig();
		bt2.setBookHelperClass(getShopData());
		bt2.setBookName("the way of success");
		bt2.setBookPrice(1001);
		return bt2;
	}
}
