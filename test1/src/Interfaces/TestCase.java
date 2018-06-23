package Interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestCase{
	String id()default"[none]";
	
}
