package com.demo.type_converter;

import com.demo.type_converter.bean.User;
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.core.convert.support.DefaultConversionService;

/**
 * @program: spring
 * @description:
 * @author: wanghui
 * @create: 2020-10-16 10:41
 */
public class Test {

	public static void main(String[] args) {
		/*DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new StringToUserConverter());
		User value = conversionService.convert("1", User.class);
		System.out.println(value);*/


		SimpleTypeConverter typeConverter = new SimpleTypeConverter();
		typeConverter.registerCustomEditor(User.class, new StringToUserPropertyEditor());
//typeConverter.setConversionService(conversionService);
		User user = typeConverter.convertIfNecessary("1", User.class);
		System.out.println(user);

	}

}
