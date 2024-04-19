package beanValidations.bean7;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


// lecture 15 we use Validator interface and it's method to write the code for our validations on bean in validateMethod
public class StudenValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		boolean result=StudentBeanValidationByValidatorInterface.class.equals(clazz);
		return result;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		StudentBeanValidationByValidatorInterface std=(StudentBeanValidationByValidatorInterface)target;
		if(std.getRollNo()<0||std.getRollNo()>100) {
			errors.reject("RollNo","your Roll no is not correct");
		}if(std.getName()==""||std.getName()==null){
			errors.reject("name","name is not correct");
		}if(std.getSchoool()!="kabara") {
			errors.reject("school","school is not correct");
	}

	}
}
